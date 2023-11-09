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

    val tourAddress: LiveData<String>
    val tourTitle: LiveData<String>
    val tourImage: MutableLiveData<String?> = MutableLiveData()

    val pathAddress: LiveData<String>
    val pathTitle: LiveData<String>
    val pathImage: MutableLiveData<String?> = MutableLiveData()

    private var areaCode: String = "1"

    init {
        // 각각의 LiveData를 초기화
        tourAddress = savedStateHandle.getLiveData("tour_address_key")
        tourTitle = savedStateHandle.getLiveData("tour_title_key")

        pathAddress = savedStateHandle.getLiveData("path_address_key")
        pathTitle = savedStateHandle.getLiveData("path_title_key")
    }

    fun getTourData(areaName: String){
        viewModelScope.launch {
            try{
                val getAreaCode = tourRepository.getAreaCode(areaName).collect{areaItem ->
                    areaCode = areaItem.map { it.code }.joinToString()

                    val tourData = tourRepository.getAreaItem(areaCode).asLiveData()

                    savedStateHandle[tour_saved_state_key] = tourData.value

//                    val areaItems = tourRepository.getAreaItem(areaCode).collect{items ->
                    val areaItems = tourRepository.getAreaPathItem(areaCode).collect{items ->
                        Log.d("viewModel", "viewModelScope item collect !! ")
                        items.forEach{areaItem ->
                            val address = areaItem.address
                            val title = areaItem.title

                            savedStateHandle["tour_address_key"] = areaItem.address
                            savedStateHandle["tour_title_key"] = areaItem.title
                            tourImage.postValue(areaItem.firstImage)

                            Log.d("viewModel", "viewModelScope address : $address")
                            Log.d("viewModel", "viewModelScope title : $title")
                            Log.d("viewModel", "viewModelScope image : ${areaItem.firstImage}")
                        }
                    }


                    val areaPathItems = tourRepository.getAreaPathItem(areaCode).collect{items ->
                        Log.d("viewModel", "viewModelScope path collect !! ")
                        items.forEach{areaPathItem ->
                            val address = areaPathItem.address
                            val title = areaPathItem.title

                            savedStateHandle["path_address_key"] = areaPathItem.address
                            savedStateHandle["path_title_key"] = areaPathItem.title
                            pathImage.postValue(areaPathItem.firstImage)

                            Log.d("viewModel", "viewModelScope path address : $address")
                            Log.d("viewModel", "viewModelScope path title : $title")
                            Log.d("viewModel", "viewModelScope path image : ${areaPathItem.firstImage}")
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