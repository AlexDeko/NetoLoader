package com.loader.neto.features.main.domain.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Badge(
    @SerialName("bgColor")
    val bgColor: String,
    @SerialName("color")
    val color: String,
    @SerialName("text")
    val text: String
)