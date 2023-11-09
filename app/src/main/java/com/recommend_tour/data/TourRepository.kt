package com.recommend_tour.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TourRepository @Inject constructor(private val tourDao: TourDao){

    fun getSeoulItem() = tourDao.getSeoulItem()

//    companion object{
//
//        @Volatile private var instance: TourRepository? = null
//
//        fun getInstance(tourDao: TourDao) =
//            instance ?: synchronized(this){
//                instance ?: TourRepository(tourDao).also { instance = it }
//            }
//    }
}