package com.loader.neto.features.main.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.loader.neto.components.result.doIfSuccess
import com.loader.neto.features.main.domain.repositories.RawCoursesRepository
import com.loader.neto.features.main.states.MainUiStates
import com.loader.neto.features.main.presentation.holders.items.CoursesGroupUiItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(
    private val repository: RawCoursesRepository
) : ViewModel() {
    private val _uiState = MutableLiveData<MainUiStates>(MainUiStates.Refreshing)
    val uiState = _uiState as LiveData<MainUiStates>

    fun onCreateScreen() = viewModelScope.launch {
        with(Dispatchers.IO) {
            val result = repository.getCoursesGroups()

            result.doIfSuccess { response ->
                withContext(Dispatchers.Main) {
                    _uiState.value = MainUiStates.Data(
                        value = response.data.map { coursesData ->
                            CoursesGroupUiItem(
                                title = coursesData.direction.title,
                                countCourses = coursesData.groups.size
                            )
                        }
                    )
                }
            }
        }
    }
}