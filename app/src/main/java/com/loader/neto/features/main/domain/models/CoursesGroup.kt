package com.loader.neto.features.main.domain.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoursesGroup(
    @SerialName("badge")
    val badge: Badge,
    @SerialName("id")
    val id: String,
    @SerialName("items")
    val items: List<CourseGroupItem>,
    @SerialName("link")
    val link: String,
    @SerialName("title")
    val title: String
)