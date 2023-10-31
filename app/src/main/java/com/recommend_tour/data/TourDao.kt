package com.recommend_tour.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface TourDao {
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
////    @Insert
//    suspend fun insertTourList(list: TourList)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTourList(vararg list: TourList)

    @Query("SELECT * FROM tour_list")
    suspend fun getAllTourList(): List<TourList>
}
