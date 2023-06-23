package com.example.kotapp

import com.example.kotapp.Responsemodel.PokeApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface ApiInterface {

    fun getPokemonListWithOffsetLimit(@Url url:String) : Call<PokeApiResponse>
}