package com.recommend_tour.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.recommend_tour.data.TourItem
import com.recommend_tour.databinding.TourPagingLayoutBinding

class TourPagingAdapter : PagingDataAdapter<TourItem, TourPagingAdapter.TourItemViewHolder>(DIFF_CALLBACK) {

    /**
     * 뷰 홀더 생성 및 리턴
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourItemViewHolder {
        val binding = TourPagingLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TourItemViewHolder(binding)
    }

    /**
     * 1. 리사이클러 뷰 특정 위치 (position)의 아이템을 가져옴
     * 2. 해당 아이템을 뷰 홀더에 바인딩
     */
    override fun onBindViewHolder(holder: TourItemViewHolder, position: Int) {
        val tourItem = getItem(position)
        tourItem?.let {
            holder.bind(it)
        }
    }

    /**
     * 1. 뷰 홀더에서 받은 1개의 리스트의 상세 정보들을 바인딩
     * 2. executePendingBindings : 데이터 바인딩 즉시 실행하여 레이아웃에 변경된 데이터 표시
     */
    class TourItemViewHolder(private val binding: TourPagingLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tourItem: TourItem) {
            binding.tourAddress.text = tourItem.address
            binding.tourTitle.text = tourItem.title
            Glide.with(binding.tourImage.context)
                .load(tourItem.firstImage)
                .into(binding.tourImage)
            binding.executePendingBindings()
        }
    }

    /**
     * 1. 아이템의 간의 변경 사항을 처리한다. 동일한 아이템인지 판별
     */
    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TourItem>() {
            override fun areItemsTheSame(oldItem: TourItem, newItem: TourItem): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: TourItem, newItem: TourItem): Boolean {
                return oldItem == newItem
            }
        }
    }
}