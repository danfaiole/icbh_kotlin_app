package fms.android.discipulosembh.utilities

import fms.android.discipulosembh.services.VideosService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConfig {
    private val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun videosService(): VideosService = retrofit.create(VideosService::class.java)
}