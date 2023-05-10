package com.hellodev.ssx_project02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hellodev.ssx_project02.databinding.ActivityBottoNavigationBinding
import com.hellodev.ssx_project02.fragments.HomeFragment

class BottonNavigationActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var _binding: ActivityBottoNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        installSplashScreen().apply {
//            setKeepOnScreenCondition{
//                viewModel.isLoading.value
//            }

        }
        _binding = ActivityBottoNavigationBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(_binding.fragmentContainerView2.id) as NavHostFragment
        val navController = navHostFragment.navController

        _binding.bottonNavigationView.setupWithNavController(navController)
    }

}