package com.recommend_tour.data

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tour_item")
data class TourItem(
    @PrimaryKey
    @SerializedName("contentid")
    val contentId: String,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("addr1")
    val address: String? = null,
    @SerializedName("addr2")
    val address2: String? = null,
    @SerializedName("areacode")
    val areaCode: String? = null,
    @SerializedName("booktour")
    val bookTour: String? = null,
    @SerializedName("cat1")
    val category1: String? = null,
    @SerializedName("cat2")
    val category2: String? = null,
    @SerializedName("cat3")
    val category3: String? = null,
    @SerializedName("contenttypeid")
    val contentTypeId: String? = null,
    @SerializedName("createdtime")
    val createdTime: String? = null,
    @SerializedName("firstimage")
    val firstImage: String? = null,
    @SerializedName("firstimage2")
    val firstImage2: String? = null,
    @SerializedName("cpyrhtDivCd")
    val copyrightDivCode: String? = null,
    @SerializedName("mapx")
    val mapX: String? = null,
    @SerializedName("mapy")
    val mapY: String? = null,
    @SerializedName("mlevel")
    val mapLevel: String? = null,
    @SerializedName("modifiedtime")
    val modifiedTime: String? = null,
    @SerializedName("sigungucode")
    val siGunGuCode: String? = null,
    @SerializedName("tel")
    val telephone: String? = null,
    @SerializedName("zipcode")
    val zipCode: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()?:"",
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(contentId)
        parcel.writeString(title)
        parcel.writeString(address)
        parcel.writeString(address2)
        parcel.writeString(areaCode)
        parcel.writeString(bookTour)
        parcel.writeString(category1)
        parcel.writeString(category2)
        parcel.writeString(category3)
        parcel.writeString(contentTypeId)
        parcel.writeString(createdTime)
        parcel.writeString(firstImage)
        parcel.writeString(firstImage2)
        parcel.writeString(copyrightDivCode)
        parcel.writeString(mapX)
        parcel.writeString(mapY)
        parcel.writeString(mapLevel)
        parcel.writeString(modifiedTime)
        parcel.writeString(siGunGuCode)
        parcel.writeString(telephone)
        parcel.writeString(zipCode)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TourItem> {
        override fun createFromParcel(parcel: Parcel): TourItem {
            return TourItem(parcel)
        }

        override fun newArray(size: Int): Array<TourItem?> {
            return arrayOfNulls(size)
        }
    }
}