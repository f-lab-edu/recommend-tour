package com.recommend_tour.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TourRepository @Inject constructor(private val tourDao: TourDao){

    fun getAreaItem(areaId: String, contentTypeId: String) = tourDao.getAreaItem(areaId, contentTypeId)

    fun getAreaCode(areaName: String) = tourDao.getAreaCode(areaName)

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