package com.recommend_tour.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.recommend_tour.data.TourRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TourListViewModel @Inject internal constructor(
    tourRepository: TourRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel(){

}