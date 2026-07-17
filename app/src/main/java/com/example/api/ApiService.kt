package com.example.api

import com.example.models.ImageRequest
import com.example.models.VideoRequest
import com.example.models.ImageToVideoRequest
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @POST("models/imagen-3:generateImage")
    fun generateImage(
        @Query("key") key: String,
        @Body body: ImageRequest
    ): Call<Any>

    @POST("models/veo-2:generateVideo")
    fun generateVideo(
        @Query("key") key: String,
        @Body body: VideoRequest
    ): Call<Any>

    @POST("models/veo-2:generateVideo")
    fun generateImageToVideo(
        @Query("key") key: String,
        @Body body: ImageToVideoRequest
    ): Call<Any>
}
