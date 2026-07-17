package com.example.repository

import com.example.api.ApiService
import com.example.models.ImageRequest
import com.example.models.VideoRequest
import com.example.models.ImageToVideoRequest
import com.example.utils.Constants
import retrofit2.Call

class Repository(private val api: ApiService) {

    fun generateImage(prompt: String, aspectRatio: String): Call<Any> {
        return api.generateImage(Constants.API_KEY, ImageRequest(prompt, aspectRatio))
    }

    fun generateVideo(prompt: String, durationSeconds: Int): Call<Any> {
        return api.generateVideo(Constants.API_KEY, VideoRequest(prompt, durationSeconds))
    }

    fun generateImageToVideo(image: String, prompt: String): Call<Any> {
        return api.generateImageToVideo(Constants.API_KEY, ImageToVideoRequest(image, prompt))
    }
}
