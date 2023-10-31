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
//    var items: MutableList<Item>? = null,
//    var items: List<Item>? = null,
//    var items: List<Tour>? = null,

    @SerializedName("numOfRows")
    var numOfRows: Int? = null,

    @SerializedName("pageNo")
    var pageNo: Int? = null,

    @SerializedName("totalCount")
    var totalCount: Int? = null
)

data class Items(
    @SerializedName("item")
    var item: List<Item>? = null
)

data class Item(
    @SerializedName("contentid")
    val contentid: String,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("addr1")
    val addr1: String? = null,

    @SerializedName("addr2")
    val addr2: String? = null,

    @SerializedName("areacode")
    val areacode: String? = null,

    @SerializedName("booktour")
    val booktour: String? = null,

    @SerializedName("cat1")
    val cat1: String? = null,

    @SerializedName("cat2")
    val cat2: String? = null,

    @SerializedName("cat3")
    val cat3: String? = null,

    @SerializedName("contenttypeid")
    val contenttypeid: String? = null,

    @SerializedName("createdtime")
    val createdtime: String? = null,

    @SerializedName("firstimage")
    val firstimage: String? = null,

    @SerializedName("firstimage2")
    val firstimage2: String? = null,

    @SerializedName("cpyrhtDivCd")
    val cpyrhtDivCd: String? = null,

    @SerializedName("mapx")
    val mapx: String? = null,

    @SerializedName("mapy")
    val mapy: String? = null,

    @SerializedName("mlevel")
    val mlevel: String? = null,

    @SerializedName("modifiedtime")
    val modifiedtime: String? = null,

    @SerializedName("sigungucode")
    val sigungucode: String? = null,

    @SerializedName("tel")
    val tel: String? = null,

    @SerializedName("zipcode")
    val zipcode: String? = null
)
