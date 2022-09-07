package com.loader.neto.features.main.domain.repositories

import com.loader.neto.components.result.Result
import com.loader.neto.features.main.domain.models.CoursesGroupsResponse
import retrofit2.http.GET

interface RawCoursesRepository {

    @GET("rn-task/master/netology.json")
    suspend fun getCoursesGroups() : Result<CoursesGroupsResponse>
}