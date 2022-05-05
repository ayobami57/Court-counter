package com.example.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val default_Score = 3

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val mainViewModel = ViewModelProvider(this ).get(MainViewModel::class.java)
        binding.mainViewModel = mainViewModel
        binding.lifecycleOwner = this


        mainViewModel.score_A.observe(this, Observer { newScore ->
            binding.scoreText.text = newScore.toString()
        })
/*
        mainViewModel.score_A.observe(this, Observer {
            Toast.makeText(this, "action", Toast.LENGTH_SHORT).show()
        })*/

        mainViewModel.score_B.observe(this, Observer { newScore ->
            binding.scoreText2.text = newScore.toString()
        })


    }
}