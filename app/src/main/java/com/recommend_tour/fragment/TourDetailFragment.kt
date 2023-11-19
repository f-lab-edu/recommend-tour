package com.recommend_tour.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.recommend_tour.R
import com.recommend_tour.databinding.ActivityMainBinding
import com.recommend_tour.viewmodels.TourListViewModel

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.util.Log
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.recommend_tour.databinding.FragmentHomeBinding
import com.recommend_tour.databinding.FragmentTourDetailBinding
import com.recommend_tour.service.TourDataUpdateService
import dagger.hilt.android.AndroidEntryPoint

class TourDetailFragment : Fragment() {

    private val viewModel: TourListViewModel by viewModels()
    private lateinit var binding: FragmentTourDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tour_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val contentId = arguments?.getString("contentId")
    }


    override fun onResume() {
        super.onResume()
        hideBottomNavigationView()
    }

    private fun hideBottomNavigationView() {
        val bottomNav: BottomNavigationView = requireActivity().findViewById(R.id.bottomNav)
        bottomNav.visibility = View.GONE
    }

    override fun onPause() {
        super.onPause()
        showBottomNavigationView()
    }

    private fun showBottomNavigationView() {
        val bottomNav: BottomNavigationView = requireActivity().findViewById(R.id.bottomNav)
        bottomNav.visibility = View.VISIBLE
    }
}