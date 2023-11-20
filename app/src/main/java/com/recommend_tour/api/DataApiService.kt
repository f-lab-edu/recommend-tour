package com.recommend_tour.api

import com.recommend_tour.data.ApiResponse
import com.recommend_tour.data.AreaCodeItems
import com.recommend_tour.data.TourDetailItems
import com.recommend_tour.data.TourItems

import retrofit2.http.GET
import retrofit2.http.Query

private const val MOBILE_APP = "recommend_tour"
private const val SERVICE_KEY = "Lv3KHPJYHUvfCs0PRMXwrxDSUYHp3ePlZLPSbQ3JeGgai6UhMyWmBGFw79liTjnNd3pJaqRdcesC+1XWjnnTuA=="

interface DataApiService {

    @GET("areaBasedList1")
    suspend fun getAllData(
        @Query("pageNo") pageNo: Int,
        @Query("numOfRows") numOfRows: Int,
        @Query("_type") type: String = "json",
        @Query("MobileApp") mobileApp: String = MOBILE_APP,
        @Query("MobileOS") mobileOS: String = "AND",
        @Query("serviceKey") serviceKey: String = SERVICE_KEY,
    ): ApiResponse<TourItems>

    @GET("areaCode1")
    suspend fun getAreaCode(
        @Query("_type") type: String = "json",
        @Query("MobileApp") mobileApp: String = MOBILE_APP,
        @Query("MobileOS") mobileOS: String = "AND",
        @Query("serviceKey") serviceKey: String = SERVICE_KEY,
    ): ApiResponse<AreaCodeItems>

    @GET("detailIntro1")
    suspend fun getTourDetailItem(
        @Query("contentId") contentId: String,
        @Query("contentTypeId") contentTypeId: String,
        @Query("_type") type: String = "json",
        @Query("MobileApp") mobileApp: String = MOBILE_APP,
        @Query("MobileOS") mobileOS: String = "AND",
        @Query("serviceKey") serviceKey: String = SERVICE_KEY,
    ): ApiResponse<TourDetailItems>
}