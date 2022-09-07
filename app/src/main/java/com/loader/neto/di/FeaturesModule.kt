package com.loader.neto.di

import com.loader.neto.features.main.di.mainModule
import org.koin.dsl.module

val featuresModule = module {
    includes(mainModule)
}