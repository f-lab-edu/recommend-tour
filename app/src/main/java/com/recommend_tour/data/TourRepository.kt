package com.recommend_tour.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TourRepository @Inject constructor(private val tourDao: TourDao){

    fun getAreaItem(areaId: String, contentTypeId: String) = tourDao.getAreaItem(areaId, contentTypeId)

    fun getAreaPagingItem(areaId: String, contentTypeId: String, pagingSize: Int, offset: Int) = tourDao.getAreaPagingItem(areaId, contentTypeId, pagingSize, offset)

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