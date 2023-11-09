package com.recommend_tour.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "area_item")
data class AreaItem(
    @PrimaryKey
    @SerializedName("rnum")
    val rnum: String,
    @SerializedName("code")
    val code: String? = null,
    @SerializedName("name")
    val name: String? = null
)
