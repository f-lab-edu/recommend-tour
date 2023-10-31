package com.recommend_tour

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.recommend_tour.service.ApiService


//@AndroidEntryPoint
class MyActivity : AppCompatActivity() {
//    private val tourService: TourService by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val serviceIntent = Intent(this, ApiService::class.java)
        startService(serviceIntent)
    }
}