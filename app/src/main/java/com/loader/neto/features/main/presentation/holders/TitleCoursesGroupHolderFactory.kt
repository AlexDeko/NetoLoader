package com.loader.neto.features.main.presentation.holders

import android.view.LayoutInflater
import android.view.ViewGroup
import com.loader.neto.components.binder.BindingViewHolder
import com.loader.neto.components.binder.ViewHolderFactory
import com.loader.neto.databinding.HolderTitleCoursesGroupBinding
import com.loader.neto.features.main.presentation.holders.items.TitleCoursesGroupsUiItem

class TitleCoursesGroupHolderFactory :
    ViewHolderFactory<HolderTitleCoursesGroupBinding, TitleCoursesGroupsUiItem> {

    override fun create(parent: ViewGroup) =
        BindingViewHolder<TitleCoursesGroupsUiItem, HolderTitleCoursesGroupBinding>(
            HolderTitleCoursesGroupBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun bind(
        binding: HolderTitleCoursesGroupBinding,
        model: TitleCoursesGroupsUiItem,
        payloads: List<Any>
    ) {
        with(binding) {
            //можно использовать SpannableStringBuilder для расскрасски частей текста в разные цвета
            title.text = model.title
        }
    }
}