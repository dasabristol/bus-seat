package com.example.bus_seat

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bus_seat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)
    }
}