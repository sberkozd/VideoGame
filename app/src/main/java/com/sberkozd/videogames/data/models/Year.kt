package com.sberkozd.videogames.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Year(
    val count: Int,
    val decade: Int,
    val filter: String,
    val from: Int,
    val nofollow: Boolean,
    val to: Int,
    val years: List<YearX>
)