package com.example.daggarhiltmvp.networkauth

import com.example.daggarhiltmvp.model.SportsModel
import retrofit2.http.GET

interface WebAuth {

    @GET("all_sports.php")
    suspend fun getAllSports() : SportsModel
}