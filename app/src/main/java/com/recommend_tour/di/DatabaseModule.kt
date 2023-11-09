package com.recommend_tour.di

import android.content.Context
import com.recommend_tour.data.AppDatabase
import com.recommend_tour.data.TourDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Singleton
    @Provides
    fun provideTourDao(appDatabase: AppDatabase): TourDao{
        return appDatabase.tourDao()
    }

}