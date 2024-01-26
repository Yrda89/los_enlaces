package com.adrian.aplicacion1.VideoGamesApp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("games?key=3288be2b5a534b99911a95d7fdcd2fdf")
    suspend fun getVideoGames(@Query("search") videoGameName:String): Response<VideoGamesResponse>
}