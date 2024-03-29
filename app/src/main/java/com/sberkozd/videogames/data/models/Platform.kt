package com.sberkozd.videogames.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Platform(
    val id: Int,
    val name: String,
    val slug: String
)