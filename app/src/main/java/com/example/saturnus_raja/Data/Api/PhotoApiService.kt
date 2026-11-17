package com.example.saturnus_raja.Data.Api

import com.example.saturnus_raja.Data.Model.PhotoModel
import retrofit2.http.GET

interface PhotoApiService {
    @GET("list")
    suspend fun getPhotos(): List<PhotoModel>
}