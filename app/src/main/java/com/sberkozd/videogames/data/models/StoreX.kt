package com.sberkozd.videogames.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StoreX(
    val domain: String,
    val games_count: Int,
    val id: Int,
    val image_background: String,
    val name: String,
    val slug: String
)