package com.loader.neto.features.main.states

import com.loader.neto.features.main.presentation.holders.items.CoursesGroupUiItem

sealed class MainUiStates {
    object Refreshing : MainUiStates()
    class Data(
        val value: List<CoursesGroupUiItem>
    ) : MainUiStates()
}

