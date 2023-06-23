package com.example.kotapp.Responsemodel

import com.google.gson.annotations.SerializedName

data class PokemonModel(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String? = null
)
