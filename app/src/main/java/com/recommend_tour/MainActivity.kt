package com.recommend_tour

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
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

        val areaListSpinner = binding.spinner
        areaListSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedAreaPosition = areaListSpinner.selectedItem.toString()
                Log.d("MainActivity", "selectedAreaPosition : $selectedAreaPosition")

                viewModel.getTourData(selectedAreaPosition)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.d("MainActivity", "spinner Nothing Select")
            }
        }
    }

    private val receiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            if(intent?.action == "tourDataReady"){
                viewModel.getTourData("서울")
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