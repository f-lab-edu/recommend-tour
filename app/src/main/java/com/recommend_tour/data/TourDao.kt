package com.recommend_tour.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface TourDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(items: List<TourItem>)

//    @Query("SELECT * FROM tour_item")
    @Query("SELECT * FROM tour_item LIMIT 100")
    suspend fun getAll(): List<TourItem>

    @Query("SELECT COUNT(*) FROM tour_item")
    suspend fun getItemCount(): Int

    @Query("SELECT * FROM tour_item where siGunGuCode='18'")
    fun getSeoulItem(): List<TourItem>
}
