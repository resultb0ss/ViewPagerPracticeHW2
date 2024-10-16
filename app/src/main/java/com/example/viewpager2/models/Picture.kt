package com.example.viewpager2.models

import com.example.viewpager2.R
import java.io.Serializable

class Picture (
    val imageView: Int,
    var checkButton: Boolean
): Serializable{

    companion object {
        val viewPagerList = mutableListOf(
            Picture(R.drawable.one, true),
            Picture(R.drawable.two, true),
            Picture(R.drawable.three, false)
        )
    }
}