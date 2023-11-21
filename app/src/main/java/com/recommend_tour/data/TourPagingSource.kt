package com.recommend_tour.data

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext

class TourPagingSource (
    private val tourRepository: TourRepository
): PagingSource<Int, TourItem>(){
    override fun getRefreshKey(state: PagingState<Int, TourItem>): Int? {
        TODO("getRefreshKey")
    }

    private var areaName: String = ""
    private var contentTypeApiCode: String = ""

    fun changeData(newAreaName: String, newCode: String){
        areaName = newAreaName
        contentTypeApiCode = newCode
    }

    /**
     * 1. 지역 이름으로 지역 코드 가져옴
     * 2. 지역 코드,content 종류로 관광지 List 가져옴
     * 3. 해당 관광지 데이터 return
     */
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, TourItem> {
        try {

            val pageSize = params.loadSize
            val offset = params.key ?: 0

            val areaCode = withContext(Dispatchers.IO) {
                tourRepository.getAreaCode(areaName).first().map { it.code }.joinToString()
            }

            val tourList = withContext(Dispatchers.IO) {
                tourRepository.getAreaPagingItem(areaCode, contentTypeApiCode, pageSize, offset).first()
            }

            val nextPage = if (tourList.size < pageSize) {
                null
            } else {
                offset + pageSize
            }

            return LoadResult.Page(
                data = tourList,
                prevKey = if (offset == 0) null else offset - pageSize,
                nextKey = nextPage
            )
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }
}