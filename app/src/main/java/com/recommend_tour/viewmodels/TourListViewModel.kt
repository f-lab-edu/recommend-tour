package com.recommend_tour.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.recommend_tour.data.AppDatabase
import com.recommend_tour.data.TourItem
import com.recommend_tour.data.TourRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class TourListViewModel @Inject internal constructor(
    private val tourRepository: TourRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    val address: LiveData<String>
    val title: LiveData<String>
    val image: MutableLiveData<String?> = MutableLiveData()

    init {
        // 각각의 LiveData를 초기화
        address = savedStateHandle.getLiveData("address_key")
        title = savedStateHandle.getLiveData("title_key")
    }

    private fun getTourData(){
        viewModelScope.launch {
            try{
                val tourData = tourRepository.getSeoulItem().asLiveData()
                savedStateHandle.set(tour_saved_state_key, tourData.value)

                val seoulItems = tourRepository.getSeoulItem().collect{items ->
                    items.forEach{seoulItem ->
                        val address = seoulItem.address
                        val title = seoulItem.title

                        savedStateHandle.set("address_key", seoulItem.address)
                        savedStateHandle.set("title_key", seoulItem.title)
                        image.postValue(seoulItem.firstImage)

                        Log.d("viewModel", "viewModelScope address : $address")
                        Log.d("viewModel", "viewModelScope title : $title")
                        Log.d("viewModel", "viewModelScope image : $image")
                    }
                }

            }catch (e: Exception){
                Log.d("viewModel", "viewModelScope error")
            }
        }
    }

    fun updateData() {
        getTourData()
    }

    companion object{
        private const val tour_saved_state_key = "tour_key"
    }
}