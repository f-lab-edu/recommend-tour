package com.recommend_tour.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.recommend_tour.data.TourRepository
import dagger.hilt.android.lifecycle.HiltViewModel
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
    private var areaCode: String = "1"

    init {
        // 각각의 LiveData를 초기화
        address = savedStateHandle.getLiveData("address_key")
        title = savedStateHandle.getLiveData("title_key")
    }

    fun getTourData(areaName: String){
        viewModelScope.launch {
            try{
                val areaCode2 = tourRepository.getAreaCode(areaName).collect{areaItem ->
                    areaCode = areaItem.map { it.code }.joinToString()

                    val tourData = tourRepository.getAreaItem(areaCode).asLiveData()

                    savedStateHandle[tour_saved_state_key] = tourData.value

                    val areaItems = tourRepository.getAreaItem(areaCode).collect{items ->
                        items.forEach{areaItem ->
                            val address = areaItem.address
                            val title = areaItem.title

                            savedStateHandle["address_key"] = areaItem.address
                            savedStateHandle["title_key"] = areaItem.title
                            image.postValue(areaItem.firstImage)

                            Log.d("viewModel", "viewModelScope address : $address")
                            Log.d("viewModel", "viewModelScope title : $title")
                            Log.d("viewModel", "viewModelScope image : ${areaItem.firstImage}")
                        }
                    }
                }
            }catch (e: Exception){
                Log.d("viewModel", "viewModelScope error : $e")
            }
        }
    }

    companion object{
        private const val tour_saved_state_key = "tour_key"
    }
}