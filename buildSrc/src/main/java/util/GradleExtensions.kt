package util

import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.kapts(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementations(list: List<String>) = list.forEach { dependency ->
    add("implementation", dependency)
}

fun DependencyHandler.debugImplementations(list: List<String>) = list.forEach { dependency ->
    add("debugImplementation", dependency)
}

fun DependencyHandler.androidTestImplementations(list: List<String>) = list.forEach { dependency ->
    add("androidTestImplementation", dependency)
}

fun DependencyHandler.testImplementations(list: List<String>) = list.forEach { dependency ->
    add("testImplementation", dependency)
}