object Libraries {

    object Kotlin {
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinSerialization}"
        const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinSerialization}"
    }

    object Koin {
        const val koin = "io.insert-koin:koin-android:${Versions.koin}"
        const val koinTest = "io.insert-koin:koin-test:${Versions.koin}"
        const val koinTestJunit = "io.insert-koin:koin-test-junit4:${Versions.koin}"
    }

    object Network {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val kotlinxConverter = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.kotlinxConverter}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
        const val picasso = "com.squareup.picasso:picasso:${Versions.picasso}"
    }

    object Ui {
        const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val viewBindingDelegate = "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Versions.viewBindingDelegate}"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val activityKtx = "androidx.activity:activity-ktx:${Versions.activityKtx}"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
        const val navigationKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigationKtx}"
        const val navigationFragmentKtx =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigationKtx}"
    }

    object Lifecycle {
        const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.runtimeLifecycleKtx}"
        const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.archComponents}"
        const val common = "androidx.lifecycle:lifecycle-common-java8:${Versions.archComponents}"
        const val test = "androidx.arch.core:core-testing:${Versions.archComponents}"
        const val compiler =
                "androidx.lifecycle:lifecycle-compiler:${Versions.archComponents}"
        const val liveDataKtx =
                "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleLiveDataKtx}"
    }

    object Utils {
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    }

    object Tests {
        const val junit = "junit:junit:${Versions.junit}"
        const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    }

    object AndroidTests {
        const val junit = "androidx.test.ext:junit:${Versions.androidJunit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }
}