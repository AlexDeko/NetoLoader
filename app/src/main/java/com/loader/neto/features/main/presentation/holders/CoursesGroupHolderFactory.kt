package com.loader.neto.features.main.presentation.holders

import android.view.LayoutInflater
import android.view.ViewGroup
import com.loader.neto.R
import com.loader.neto.components.binder.BindingViewHolder
import com.loader.neto.components.binder.ViewHolderFactory
import com.loader.neto.databinding.HolderCoursesGroupBinding
import com.loader.neto.features.main.presentation.holders.items.CoursesGroupUiItem

class CoursesGroupHolderFactory : ViewHolderFactory<HolderCoursesGroupBinding, CoursesGroupUiItem> {

    override fun create(parent: ViewGroup) =
            BindingViewHolder<CoursesGroupUiItem, HolderCoursesGroupBinding>(
                HolderCoursesGroupBinding.inflate(
                            LayoutInflater.from(parent.context),
                            parent,
                            false
                    )
            )

    override fun bind(
        binding: HolderCoursesGroupBinding,
        model: CoursesGroupUiItem,
        payloads: List<Any>
    ) {
        with(binding) {
           title.text = model.title
            //Можно вынести получение текстовки
            countCourses.text = root.resources.getQuantityString(
                R.plurals.plurals_courses_counter, model.countCourses, model.countCourses
            )
        }
    }
}