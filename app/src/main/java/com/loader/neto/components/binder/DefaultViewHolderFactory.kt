package com.loader.neto.components.binder

import android.view.ViewGroup
import androidx.viewbinding.ViewBinding

fun <M : BindingClass> viewHolderFactory(
        binding: (parent: ViewGroup) -> ViewBinding
): ViewHolderFactory<ViewBinding, M> = object : ViewHolderFactory<ViewBinding, M> {

    override fun create(parent: ViewGroup): BindingViewHolder<M, ViewBinding> =
            BindingViewHolder(binding(parent))
}