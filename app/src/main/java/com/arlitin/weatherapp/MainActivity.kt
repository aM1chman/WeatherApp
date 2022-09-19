package com.arlitin.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arlitin.weatherapp.databinding.ActivityMainBinding
import com.arlitin.weatherapp.fragment.MainFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance()).commit()
    }
}