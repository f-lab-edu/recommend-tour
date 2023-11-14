package com.recommend_tour.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.recommend_tour.adapter.TourPagingAdapter
import com.recommend_tour.data.TourItem
import com.recommend_tour.data.TourPagingSource
import com.recommend_tour.data.TourRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TourListViewModel @Inject internal constructor(
    private val tourRepository: TourRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    /**
     * 1. adapter : 리사이클러 뷰에 데이터 표시하기 위해 어댑터 호출
     * 2. TourPagingSource : 페이징 데이터 호출
     * 3. pager () : 한 항목씩 비동기로 로드
     * 4. collectLatest, submitData : 업데이트 된 데이터 화면에 표시
     */

    private lateinit var pagingData : Flow<PagingData<TourItem>>

    val adapter = TourPagingAdapter()

    fun getTourData(areaName: String, contentTypeApiCode: String) {

        val pagingSourceFactory = { TourPagingSource(tourRepository, areaName, contentTypeApiCode) }

        pagingData = Pager(
            config = PagingConfig(pageSize = 1),
            pagingSourceFactory = pagingSourceFactory
        ).flow

        viewModelScope.launch(Dispatchers.IO) {
            pagingData.collectLatest { pagingData ->
                adapter.submitData(pagingData)
//                savedStateHandle.set("pagingData", pagingData)
            }
        }
    }

    fun getPagingData(): PagingData<TourItem>? {
        return savedStateHandle.get<PagingData<TourItem>>("pagingData")
    }
}