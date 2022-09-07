package com.loader.neto.di

import android.preference.PreferenceManager
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.loader.neto.BuildConfig
import com.loader.neto.components.result.retrofit.ResultAdapterFactory
import com.loader.neto.features.main.domain.repositories.RawCoursesRepository
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit

val appModule = module {
        single {
            val builder = OkHttpClient.Builder()
            // logs
            if (BuildConfig.DEBUG) {
                builder
                    .addInterceptor(HttpLoggingInterceptor()
                        .setLevel(HttpLoggingInterceptor.Level.BODY))
            }
            builder
                .build()
        }

        single { PreferenceManager.getDefaultSharedPreferences(androidContext()) }


        single {
            Json {
                ignoreUnknownKeys = true
                allowStructuredMapKeys = true
                coerceInputValues = true
            }
        }

        single {
            Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/netology-code/")
                .addCallAdapterFactory(ResultAdapterFactory())
                .addConverterFactory(
                    get<Json>().asConverterFactory(contentType = "application/json".toMediaType())
                )
                .client(get())
                .build()
        }
}
