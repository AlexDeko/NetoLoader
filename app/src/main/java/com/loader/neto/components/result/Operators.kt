@file:Suppress("unused")

package com.loader.neto.components.result

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

fun <T> Result<T>.isSuccess(): Boolean {
    return this is Result.Success
}

fun <T> Result<T>.asSuccess(): Result.Success<T> {
    return this as Result.Success<T>
}

@OptIn(ExperimentalContracts::class)
fun <T> Result<T>.isFailure(): Boolean {
    contract {
        returns(true) implies (this@isFailure is Result.Failure)
    }
    return this is Result.Failure
}

fun <T> Result<T>.asFailure(): Result.Failure {
    return this as Result.Failure
}

fun <T, R> Result<T>.map(transform: (value: T) -> R): Result<R> {
    return when (this) {
        is Result.Success -> Result.Success.Value(transform(value))
        is Result.Failure -> this
    }
}

fun <T, R> Result<T>.flatMap(transform: (result: Result<T>) -> Result<R>): Result<R> {
    return transform(this)
}

inline fun <reified T> Result<T>.doIfFailure(callback: (throwable: Throwable?) -> Unit) {
    if (isFailure()) asFailure().error?.let { error -> callback(error) }
}

inline fun <reified T> Result<T>.doIfFailure(callback: () -> Unit) {
    if (isFailure()) callback()
}

inline fun <reified T> Result<T>.doIfSuccess(callback: (value: T) -> Unit) {
    if (isSuccess()) callback(asSuccess().value)
}

inline fun <T> Result<T>.withDefault(value: () -> T): Result.Success<T> {
    return when (this) {
        is Result.Success -> this
        is Result.Failure -> Result.Success.Value(value())
    }
}