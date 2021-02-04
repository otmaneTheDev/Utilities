package com.example.utilities.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.utilities.BR

class RvViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(itemBase: RvItem, itemClickListener: RvAdapter.GenericItemListener?) {
        binding.setVariable(BR.item, itemBase)
        binding.setVariable(BR.clickListener, itemClickListener)
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup, viewType: Int): RvViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            return RvViewHolder(DataBindingUtil.inflate<ViewDataBinding>(inflater, viewType, parent, false))
        }
    }
}