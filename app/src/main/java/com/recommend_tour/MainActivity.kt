package com.recommend_tour

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.recommend_tour.service.TourDataUpdateService
import com.recommend_tour.viewmodels.TourListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    private val viewModel: TourListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_layout)

        val serviceIntent = Intent(this, TourDataUpdateService::class.java)
        startService(serviceIntent)
    }

    private val receiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            if(intent?.action == "movePageMainLayout"){
                setContentView(R.layout.main_layout)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val filter = IntentFilter("movePageMainLayout")
        registerReceiver(receiver, filter)
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(receiver)
    }
}