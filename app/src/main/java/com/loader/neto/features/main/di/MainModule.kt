package com.loader.neto.features.main.di

import com.loader.neto.features.main.domain.repositories.RawCoursesRepository
import com.loader.neto.features.main.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import retrofit2.Retrofit

val mainModule = module {
    single { get<Retrofit>().create(RawCoursesRepository::class.java) }

    viewModelOf(::MainViewModel)
}