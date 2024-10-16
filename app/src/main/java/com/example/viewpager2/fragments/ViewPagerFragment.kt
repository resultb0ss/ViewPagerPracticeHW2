package com.example.viewpager2.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2.activities.StartActivity
import com.example.viewpager2.models.Picture
import com.example.viewpager2.databinding.FragmentViewPagerBinding


class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding
    private var check = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewPagerBinding.inflate(inflater,container,false)

        val viewPageItem = arguments?.getSerializable("vp") as Picture
        binding.viewPagerImageView.setImageResource(viewPageItem.imageView)
        check = viewPageItem.checkButton

        if (!check){
            binding.viewPagerButtonBTN.visibility = View.VISIBLE
            binding.viewPagerButtonBTN.setOnClickListener{
                startActivity(Intent(activity,StartActivity::class.java))
            }
        }

        return binding.root
    }

}