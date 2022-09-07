object LibrariesGroup {

    val kotlin = arrayOf(
        Libraries.Kotlin.coroutinesCore,
        Libraries.Kotlin.coroutinesAndroid,
        Libraries.Kotlin.serialization,
        Libraries.Kotlin.serializationJson
    )

    val koin = arrayOf(
        Libraries.Koin.koin
    )

    val network = arrayOf(
        Libraries.Network.retrofit,
        Libraries.Network.okhttp,
        Libraries.Network.logging,
        Libraries.Network.kotlinxConverter,
    )

    val ui = arrayOf(
        Libraries.Ui.material,
        Libraries.Ui.constraintLayout,
        Libraries.Ui.recyclerView,
        Libraries.Ui.viewBindingDelegate
    )

    val androidX = arrayOf(
        Libraries.AndroidX.coreKtx,
        Libraries.AndroidX.appCompat,
        Libraries.AndroidX.activityKtx
    )

    val lyfecycle = arrayOf(
        Libraries.Lifecycle.liveDataKtx
    )

    val utils = arrayOf(
        Libraries.Utils.timber
    )

    val tests = arrayOf(
        Libraries.Tests.junit,
        Libraries.Tests.mockito,
    )

    val koinTests = arrayOf(
        Libraries.Koin.koinTest,
        Libraries.Koin.koinTestJunit
    )

    val androidTest = arrayOf(
        Libraries.AndroidTests.junit,
        Libraries.AndroidTests.espresso
    )

    val app = mutableListOf<String>().apply {
        addAll(kotlin)
        addAll(ui)
        addAll(androidX)
        addAll(lyfecycle)
        addAll(koin)
        addAll(utils)
        addAll(network)
    }

    val appTest = mutableListOf<String>().apply {
        addAll(tests)
    }

    val appDebug = mutableListOf<String>()

    val appAndroidTest = mutableListOf<String>().apply {
        addAll(tests)
        addAll(androidTest)
        addAll(koinTests)
    }

    val appKapts = mutableListOf<String>()
}