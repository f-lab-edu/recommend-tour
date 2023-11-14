package com.recommend_tour.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TourDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(items: List<TourItem>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAreaCode(items: List<AreaItem>)

    @Query("SELECT * FROM tour_item WHERE areaCode = :areaId AND contentTypeId = :contentTypeId AND TRIM(firstImage, address) <> '' ORDER BY RANDOM()")
    fun getAreaItem(areaId: String, contentTypeId: String): Flow<List<TourItem>>

    @Query("SELECT * FROM area_item where name= :areaName")
    fun getAreaCode(areaName: String): Flow<List<AreaItem>>

}
