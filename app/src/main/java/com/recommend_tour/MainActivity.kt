package com.recommend_tour

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.recommend_tour.service.TourDataUpdateService
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        navController = navHostFragment.navController

        val bottomNav: BottomNavigationView = findViewById(R.id.bottomNav)

        bottomNav.setupWithNavController(navController)

        val serviceIntent = Intent(this, TourDataUpdateService::class.java)
        startService(serviceIntent)
    }
}