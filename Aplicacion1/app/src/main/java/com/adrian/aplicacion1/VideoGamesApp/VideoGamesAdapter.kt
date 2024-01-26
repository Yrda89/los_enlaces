package com.adrian.aplicacion1.VideoGamesApp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adrian.aplicacion1.R

class VideoGamesAdapter (var videoGamesList: List<VideoGamesItemResponse> =
    emptyList()) : RecyclerView.Adapter<VideoGamesViewHolder>() {

    fun updateList(list: List<VideoGamesItemResponse>) {
        videoGamesList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoGamesViewHolder {
        return VideoGamesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_video_games, parent, false)
        )

    }

    override fun onBindViewHolder(holder: VideoGamesViewHolder, position: Int) {
        holder.bind(videoGamesList[position])    }

    override fun getItemCount() = videoGamesList.size
}

