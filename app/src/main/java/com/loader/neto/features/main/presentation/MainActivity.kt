package com.loader.neto.features.main.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.loader.neto.R
import com.loader.neto.components.binder.bindWith
import com.loader.neto.components.binder.binderAdapterOf
import com.loader.neto.components.binder.decorations.GroupVerticalItemDecoration
import com.loader.neto.components.binder.setBindingList
import com.loader.neto.databinding.ActivityMainBinding
import com.loader.neto.features.main.presentation.holders.CoursesGroupHolderFactory
import com.loader.neto.features.main.presentation.holders.TitleCoursesGroupHolderFactory
import com.loader.neto.features.main.presentation.holders.items.CoursesGroupUiItem
import com.loader.neto.features.main.presentation.holders.items.TitleCoursesGroupsUiItem
import com.loader.neto.features.main.states.MainUiStates
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding by viewBinding(ActivityMainBinding::bind)
    private val viewModel: MainViewModel by viewModel()
    private val coursesAdapter = binderAdapterOf(
        TitleCoursesGroupsUiItem::class bindWith TitleCoursesGroupHolderFactory(),
        CoursesGroupUiItem::class bindWith CoursesGroupHolderFactory()
    )
    private val initialList
        get() = MutableList(size = 1) {
            TitleCoursesGroupsUiItem(getString(R.string.title_courses_groups))
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
        viewModel.onCreateScreen()
    }

    override fun onResume() {
        super.onResume()

        setupUiState()
    }

    private fun initRecycler() {
        with(binding.recycler) {
            val manager = LinearLayoutManager(context)
            layoutManager = manager
            adapter = coursesAdapter
            setBindingList(initialList)
            addItemDecoration(
                DividerItemDecoration(context, manager.orientation)
            )
            addItemDecoration(
                GroupVerticalItemDecoration(divider = 100)
            )
        }
    }

    private fun setupUiState() = viewModel.uiState.observe(this) { state ->
        with(binding) {
            when (state) {
                MainUiStates.Refreshing -> progressBar.show()
                is MainUiStates.Data -> {
                    recycler.setBindingList(initialList + state.value)
                    progressBar.hide()
                }
            }
        }
    }
}