package com.recommend_tour.di

import com.google.gson.GsonBuilder
import com.recommend_tour.adapter.RuntimeTypeAdapterFactory
import com.recommend_tour.api.DataApiService
import com.recommend_tour.data.CulturalIntroduction
import com.recommend_tour.data.FestivalIntroduction
import com.recommend_tour.data.FoodIntroduction
import com.recommend_tour.data.IntroductionItem
import com.recommend_tour.data.LeisureIntroduction
import com.recommend_tour.data.ShoppingIntroduction
import com.recommend_tour.data.TourCourseIntroduction
import com.recommend_tour.data.TourDetailIntroduction
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Singleton
    @Provides
    fun provideDataApiService(): DataApiService {
        val BASE_URL = "http://apis.data.go.kr/B551011/KorService1/"

        val adapter = RuntimeTypeAdapterFactory.of(IntroductionItem::class.java, "contenttypeid")
            .registerSubtype(TourDetailIntroduction::class.java, "12")
            .registerSubtype(CulturalIntroduction::class.java, "14")
            .registerSubtype(TourCourseIntroduction::class.java, "25")
            .registerSubtype(LeisureIntroduction::class.java, "28")
            .registerSubtype(FestivalIntroduction::class.java, "15")
            .registerSubtype(ShoppingIntroduction::class.java, "38")
            .registerSubtype(FoodIntroduction::class.java, "39")

        val gson = GsonBuilder().setLenient()
            .registerTypeAdapterFactory(adapter)
            .create()

        val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
        val client = OkHttpClient.Builder()
            .addInterceptor(logger)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()

        return retrofit.create(DataApiService::class.java)
    }
}
