package com.loader.neto.components.binder

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

inline fun RecyclerView.setBindingList(
	bindingList: List<BindingClass>?,
	detectMoves: Boolean = false,
	diffUtil: (old: List<BindingClass>, new: List<BindingClass>) -> DiffUtil.Callback = { old, new ->
			BindingDiffUtilCallback(old, new)
		}
) {
    val bindingAdapter = adapter as? BinderAdapter ?: return

    val newOrEmptyList = bindingList.orEmpty()

    val bindingsDiffResult = DiffUtil.calculateDiff(
			diffUtil(bindingAdapter.itemList, newOrEmptyList),
			detectMoves
	)

    bindingAdapter.setItems(bindingsDiffResult, newOrEmptyList)
}

inline fun BinderAdapter.setBindingList(
	bindingList: List<BindingClass>?,
	detectMoves: Boolean = false,
	diffUtil: (old: List<BindingClass>, new: List<BindingClass>) -> DiffUtil.Callback = { old, new ->
		BindingDiffUtilCallback(old, new)
	}
) {
	val bindingAdapter = this

	val newOrEmptyList = bindingList.orEmpty()

	val bindingsDiffResult = DiffUtil.calculateDiff(
		diffUtil(bindingAdapter.itemList, newOrEmptyList),
		detectMoves
	)

	bindingAdapter.setItems(bindingsDiffResult, newOrEmptyList)
}