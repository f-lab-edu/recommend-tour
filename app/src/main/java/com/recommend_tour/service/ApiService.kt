package com.recommend_tour.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.room.Room
import com.copy.sunflower.api.ApiClient
import com.recommend_tour.data.ApiResponse
import com.recommend_tour.data.AppDatabase
import com.recommend_tour.data.TourDao
import com.recommend_tour.data.TourList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ApiService : Service() {

    private lateinit var database: AppDatabase // 데이터베이스 인스턴스 추가
    private lateinit var tourDao: TourDao // DAO 추가
//    private lateinit var tourList: TourList // DAO 추가
    private var tourList: MutableList<TourList> = mutableListOf()

    var pageNumber = 0

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(this, AppDatabase::class.java, "tour-db").build()
        tourDao = database.tourDao()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // 여기서 API 호출 및 데이터 가져오기를 수행
        fetchDataFromApi()
        return super.onStartCommand(intent, flags, startId)
    }

    private fun fetchDataFromApi() {
        val mobileApp = ApiClient.mobileApp
        val serviceKey = ApiClient.serviceKey
        val call = ApiClient.tourService.getData("AND", mobileApp, serviceKey, pageNumber)

        call.enqueue(object : Callback<ApiResponse> {
            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                Log.d("ApiResponse", "api response !")
                if (response.isSuccessful) {
                    val apiResponse = response.body()
                    Log.d("ApiResponse", "api response totalCount : ${apiResponse?.response?.body?.totalCount}")

                    val apiPageNumber = apiResponse?.response?.body?.totalCount

                    if (apiPageNumber != null) {
                        pageNumber = apiPageNumber / 500
                    }

                    // XML 응답을 처리하는 코드를 작성합니다
                    val items = apiResponse?.response?.body?.items?.item
                    if (items != null) {
                        for (item in items) {
                            Log.d("ApiResponse", "item: $item")
                        }

                        items.forEach { item ->
                            val tour = TourList(
                                contentId = item.contentid,
                                title = item.title,
                                address = item.addr1,
                                address2 = item.addr2,
                                areaCode = item.areacode,
                                bookTour = item.booktour,
                                category1 = item.cat1,
                                category2 = item.cat2,
                                category3 = item.cat3,
                                contentTypeId = item.contenttypeid,
                                createdTime = item.createdtime,
                                firstImage = item.firstimage,
                                firstImage2 = item.firstimage2,
                                copyrightDivCode = item.cpyrhtDivCd,
                                mapX = item.mapx,
                                mapY = item.mapy,
                                mapLevel = item.mlevel,
                                modifiedTime = item.modifiedtime,
                                siGunGuCode = item.sigungucode,
                                telephone = item.tel,
                                zipCode = item.zipcode
                            )
                            tourList.add(tour)
                        }

                        CoroutineScope(Dispatchers.IO).launch {
                            tourDao.insertTourList(*tourList.toTypedArray())
                        }

                        CoroutineScope(Dispatchers.IO).launch {
                            val tourList = tourDao.getAllTourList()

                            // tourList에는 모든 TourList 데이터가 포함됩니다.

                            for (tour in tourList) {
                                val contentId = tour.contentId
                                val title = tour.title
                                Log.d("TourList", "contentId: $contentId, title: $title")
                            }
                        }

                    }
                } else {
                    // 오류 처리 코드
                }
                stopSelf() // 서비스 종료
            }

            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                // 네트워크 오류 처리 코드
                stopSelf() // 서비스 종료
            }
        })
    }
}
