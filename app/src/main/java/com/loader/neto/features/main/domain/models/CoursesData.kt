package com.loader.neto.features.main.domain.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoursesData(
    @SerialName("direction")
    val direction: Course,
    @SerialName("groups")
    val groups: List<CoursesGroup>
)