package com.recommend_tour

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.recommend_tour.adapter.TourPagingAdapter
import com.recommend_tour.databinding.ActivityMainBinding
import com.recommend_tour.service.TourDataUpdateService
import com.recommend_tour.viewmodels.TourListViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: TourListViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: TourPagingAdapter

    var selectedArea: String = "서울"
    var contentTypeApiCode: String = "12"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        val serviceIntent = Intent(this, TourDataUpdateService::class.java)
        startService(serviceIntent)

        spinnerEvent(binding.areaSpinner, binding)
        spinnerEvent(binding.contentTypeSpinner, binding)

        initViews()
    }

    /**
     * 1. 데이터 바인딩을 사용하여 리사이클러 뷰를 수직으로 레이아웃 배치
     * 2. recyclerView adapter 설정
     */
    private fun initViews() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = viewModel.adapter
    }

    /**
     * 1. spinner의 이벤트 구분 -> 지역 spinner인지? 관광지 spinner인지?
     * 2. 선택한 spinner 변수 값만 변경하여 getTourData로 다시 화면 그리기
     */
    private fun spinnerEvent(spinner: Spinner, binding: ActivityMainBinding){
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                when (spinner) {
                    binding.areaSpinner -> selectedArea = spinner.selectedItem.toString()
                    binding.contentTypeSpinner -> contentTypeApiCode = resources.getStringArray(R.array.contentType_apiCode)[position]
                }
                viewModel.getTourData(selectedArea, contentTypeApiCode)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.d("MainActivity", "spinner Nothing Select")
            }
        }
    }

    private val receiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            if(intent?.action == "tourDataReady"){
                viewModel.getTourData(selectedArea, contentTypeApiCode)
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