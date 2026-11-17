package com.example.saturnus_raja.Data.Api

import com.example.saturnus_raja.Data.Model.CatFactModel
import retrofit2.http.GET

interface CatFactApiService {
    @GET("fact")
    suspend fun getCatFact(): CatFactModel
}