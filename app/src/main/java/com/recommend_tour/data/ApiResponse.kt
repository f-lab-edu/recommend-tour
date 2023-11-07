package com.recommend_tour.data

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("response")
    var response: Response? = null
)

data class Response(
    @SerializedName("header")
    var header: Header? = null,

    @SerializedName("body")
    var body: Body? = null
)

data class Header(
    @SerializedName("resultCode")
    var resultCode: String? = null,

    @SerializedName("resultMsg")
    var resultMsg: String? = null
)

data class Body(
    @SerializedName("items")
    var items: Items? = null,

    @SerializedName("numOfRows")
    var numOfRows: Int,

    @SerializedName("pageNo")
    var pageNo: Int,

    @SerializedName("totalCount")
    var totalCount: Int
)

data class Items(
    @SerializedName("item")
    var item: List<TourItem>? = null
)