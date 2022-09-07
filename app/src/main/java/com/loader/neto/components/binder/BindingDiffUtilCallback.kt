package com.loader.neto.components.binder

import androidx.recyclerview.widget.DiffUtil

open class BindingDiffUtilCallback(
    private val oldItems: List<BindingClass>,
    private val newItems: List<BindingClass>
) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
            oldItems[oldItemPosition].areItemsTheSame(newItems[newItemPosition])

    override fun getOldListSize(): Int = oldItems.size

    override fun getNewListSize(): Int = newItems.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
            oldItems[oldItemPosition].areContentsTheSame(newItems[newItemPosition])
}