package com.loader.neto.app

import android.app.Application
import android.content.Context
import com.loader.neto.di.appModule
import com.loader.neto.di.featuresModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App : Application() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)

        // Code called before ContentProvider.onCreate method
        setupKoinDi()
    }

    private fun setupKoinDi() {
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    appModule,
                    featuresModule,
                )
            )
        }
    }
}