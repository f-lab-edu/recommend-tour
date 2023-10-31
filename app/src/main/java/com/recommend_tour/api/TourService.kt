package com.copy.sunflower.api

import com.google.gson.GsonBuilder
import com.recommend_tour.data.ApiResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level
import retrofit2.Call

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

interface TourService {

    @GET("areaBasedList1")
    fun getData(
        @Query("MobileOS") mobileOS: String,
        @Query("MobileApp") mobileApp: String,
        @Query("serviceKey") serviceKey: String,
        @Query("pageNo") pageNo: Int,
        @Query("_type") _type: String = "json"
        , @Query("numOfRows") numOfRows: Int = 500
    ): Call<ApiResponse>
}

object ApiClient {
    private const val BASE_URL = "http://apis.data.go.kr/B551011/KorService1/"
    const val mobileApp = "recommend_tour"
    const val serviceKey = "Lv3KHPJYHUvfCs0PRMXwrxDSUYHp3ePlZLPSbQ3JeGgai6UhMyWmBGFw79liTjnNd3pJaqRdcesC+1XWjnnTuA=="
    private val gson = GsonBuilder().setLenient().create()
    val logger = HttpLoggingInterceptor().apply { level = Level.BASIC }

    private val clientBuilder = OkHttpClient.Builder().addInterceptor(
        HttpLoggingInterceptor().apply {
            // body 로그를 출력하기 위한 interceptor
            level = HttpLoggingInterceptor.Level.BODY
        }
    )

    val client = OkHttpClient.Builder()
        .addInterceptor(logger)
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
//        .addConverterFactory(GsonConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create(gson))
//        .addConverterFactory(SimpleXmlConverterFactory.create())
        .client(clientBuilder.build())
//        .client(client)
        .build()

    val tourService: TourService = retrofit.create(TourService::class.java)
}