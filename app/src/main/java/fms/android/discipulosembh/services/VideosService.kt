package fms.android.discipulosembh.services

import fms.android.discipulosembh.models.Video
import retrofit2.Call
import retrofit2.http.GET

interface VideosService {
    @GET("videos")
    fun index() : Call<ArrayList<Video>>
}