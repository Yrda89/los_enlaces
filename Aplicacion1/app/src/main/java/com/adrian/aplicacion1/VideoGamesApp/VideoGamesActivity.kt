package com.adrian.aplicacion1.VideoGamesApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import com.adrian.aplicacion1.R
import com.adrian.aplicacion1.databinding.ActivityPokeApiBinding
import com.adrian.aplicacion1.databinding.ActivityVideoGamesBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class VideoGamesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVideoGamesBinding
    private lateinit var retrofit: Retrofit
    private lateinit var adapter: VideoGamesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoGamesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        retrofit = getRetrofit()
        initUI()

        binding.searchView.setOnClickListener{}

    }

    private fun initUI() {
        binding.searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener
        {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchByName(query.orEmpty())
                return false
            }
            override fun onQueryTextChange(newText: String?) = false
        })
        adapter = VideoGamesAdapter ()
        binding.rvVideoGames.setHasFixedSize(true)
        binding.rvVideoGames.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // Para que el contenido se centre automaticamente al deslizar.
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(binding.rvVideoGames)
        
        binding.rvVideoGames.adapter = adapter

    }
    private fun searchByName(query: String) {
        binding.progressBar.isVisible = true
        CoroutineScope(Dispatchers.IO).launch {
            val myResponse: Response<VideoGamesResponse> =
                retrofit.create(ApiService::class.java).getVideoGames(query)
            if (myResponse.isSuccessful) {
                Log.i("Consulta", "Funciona :)")
                val response: VideoGamesResponse? = myResponse.body()
                if (response != null) {
                    Log.i("Cuerpo de la consulta", response.toString())
                    runOnUiThread {
                        adapter.updateList(response.videoGames)
                        binding.progressBar.isVisible = false
                    }
                }

            } else {
                Log.i("Consulta", "No funciona :(")
            }

        }
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl("https://api.rawg.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}
