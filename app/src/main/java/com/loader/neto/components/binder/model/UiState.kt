package ru.dailycup.android.components.binder.model

import com.loader.neto.components.binder.BindingClass

sealed class UiState {

    object Empty : UiState()
    object NotFound : UiState()
    data class Data(val items: List<BindingClass>) : UiState()
    data class Error(val error: Throwable) : UiState()
    object EmptyProgress : UiState()
    sealed class Refreshing : UiState() {

        data class Data(val items: List<BindingClass>) : Refreshing()
        object Empty : Refreshing()
        data class Error(val error: Throwable) : Refreshing()
    }
}