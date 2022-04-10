package com.example.retrofit2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CovidService{
    @GET("/korea/country/new/")
    fun getDocument(@Query("serviceKey") serviceKey: String): Call<StateVO>
}