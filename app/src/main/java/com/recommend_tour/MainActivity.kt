package com.recommend_tour

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.recommend_tour.databinding.ActivityMainBinding
import com.recommend_tour.service.TourDataUpdateService
import com.recommend_tour.viewmodels.TourListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: TourListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(TourListViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        val serviceIntent = Intent(this, TourDataUpdateService::class.java)
        startService(serviceIntent)
    }

    private val receiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            if(intent?.action == "tourDataReady"){

                viewModel.updateData()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val filter = IntentFilter("tourDataReady")
        registerReceiver(receiver, filter)
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(receiver)
    }
}