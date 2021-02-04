package com.example.utilities.recyclerview

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RvAdapter : RecyclerView.Adapter<RvViewHolder>() {
    private var clickListener: GenericItemListener? = null
    private var items: List<RvItem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder = RvViewHolder.from(parent, viewType)

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) = holder.bind(items[position], clickListener)

    override fun getItemViewType(position: Int): Int = items[position].layoutId

    override fun getItemCount(): Int = items.size

    fun setClickListener(genericListener: GenericItemListener): RvAdapter {
        this.clickListener = genericListener
        return this
    }

    fun setItems(listOfItemBases: List<RvItem>): RvAdapter {
        items = listOfItemBases
        notifyDataSetChanged()
        return this
    }

    fun notifyItemChanged(itemBase: RvItem): RvAdapter {
        val index = items.indexOf(itemBase)
        notifyItemChanged(index)
        return this
    }

    interface GenericItemListener {
        fun onClick(view: View, itemBase: RvItem)
    }

}