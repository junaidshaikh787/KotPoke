package com.example.kotapp.Responsemodel

import com.google.gson.annotations.SerializedName

data class PokeApiResponse(
    @SerializedName("count") var count: Int? = null,
    @SerializedName("next") var next: String? = null,
    @SerializedName("previous") var previous: String? = null,
    @SerializedName("results") var results: ArrayList<PokemonModel> = arrayListOf()
)
