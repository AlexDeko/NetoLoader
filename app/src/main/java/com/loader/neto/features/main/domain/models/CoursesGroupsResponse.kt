package com.loader.neto.features.main.domain.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoursesGroupsResponse(
    @SerialName("data")
    val data: List<CoursesData>
)