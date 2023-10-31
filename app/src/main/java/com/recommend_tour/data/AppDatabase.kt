package com.recommend_tour.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TourList::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun tourDao(): TourDao
}

