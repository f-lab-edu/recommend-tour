package com.recommend_tour.api

import com.google.gson.GsonBuilder
import com.recommend_tour.data.ApiResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
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
    ): ApiResponse

    @GET("areaBasedList1")
    suspend fun getAreaData(
        @Query("pageNo") pageNo: Int,
        @Query("numOfRows") numOfRows: Int,
        @Query("_type") type: String = "json",
        @Query("MobileApp") mobileApp: String = MOBILE_APP,
        @Query("MobileOS") mobileOS: String = "AND",
        @Query("serviceKey") serviceKey: String = SERVICE_KEY,
    ): ApiResponse
}