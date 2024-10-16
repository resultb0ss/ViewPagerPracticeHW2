package com.example.viewpager2.activities

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.viewpager2.models.Picture
import com.example.viewpager2.adapters.ViewPagerAdapter
import com.example.viewpager2.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ViewPagerAdapter(this, Picture.viewPagerList)
        binding.viewPager.adapter = adapter


    }
}