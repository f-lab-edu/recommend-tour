package com.recommend_tour.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("app:imageFromUrl")
fun loadImageUrl(imageView: ImageView, imageUrl: String?){
    imageUrl?.let {
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}
