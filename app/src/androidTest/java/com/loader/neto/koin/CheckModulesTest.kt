package com.loader.neto.koin

import androidx.test.platform.app.InstrumentationRegistry
import com.loader.neto.di.appModule
import com.loader.neto.di.featuresModule
import org.junit.Rule
import org.junit.Test
import org.koin.android.ext.koin.androidContext
import org.koin.test.KoinTest
import org.koin.test.check.checkModules
import org.koin.test.mock.MockProviderRule
import org.mockito.Mockito

class CheckModulesTest : KoinTest {
    private val context
    get() = InstrumentationRegistry.getInstrumentation().targetContext

    // Declare Mock with Mockito
    @get:Rule
    val mockProvider = MockProviderRule.create { clazz ->
        Mockito.mock(clazz.java)
    }

    // verify the Koin configuration
    @Test
    fun checkAllModules() = checkModules {
        androidContext(context)
        modules(
            listOf(
                appModule,
                featuresModule
            )
        )
    }
}