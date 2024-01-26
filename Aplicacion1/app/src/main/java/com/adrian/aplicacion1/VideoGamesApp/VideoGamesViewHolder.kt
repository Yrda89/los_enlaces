package com.adrian.aplicacion1.VideoGamesApp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.adrian.aplicacion1.databinding.ItemVideoGamesBinding
import com.squareup.picasso.Picasso

class VideoGamesViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemVideoGamesBinding.bind(view)
    fun bind(videoGamesItemResponse: VideoGamesItemResponse) {
        binding.tvVideoGameName.text = videoGamesItemResponse.name
        binding.tvVideoGameMetacritic.text = "Metacritic: ${videoGamesItemResponse.metacritic ?: "No hay datos"}"
                val genresText =
                    videoGamesItemResponse.genres.joinToString(separator = ", ") { genre ->
                        genre.genreName
                    }
                binding.tvVideoGameGenres.text = "Género/s: $genresText"
                Picasso.get().load(videoGamesItemResponse.image).into(binding.ivVideoGame)
            }
    }
