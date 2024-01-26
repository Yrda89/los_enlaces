package com.adrian.aplicacion1.VideoGamesApp

import com.google.gson.annotations.SerializedName

data class VideoGamesResponse(
    @SerializedName("results") val videoGames: List<VideoGamesItemResponse>


)

data class VideoGamesItemResponse(
    @SerializedName("name")
    val name: String,

    @SerializedName("background_image")
    val image: String,

    @SerializedName("metacritic")
    val metacritic: String,

    @SerializedName("genres")
    val genres: List<VideoGamesGenre>
)

data class VideoGamesGenre(
    @SerializedName("name")
    val genreName: String
)
