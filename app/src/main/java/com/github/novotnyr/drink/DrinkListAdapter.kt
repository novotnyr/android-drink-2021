package com.github.novotnyr.drink

import android.view.View
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

object DrinkDiff : DiffUtil.ItemCallback<Drink>() {
    override fun areItemsTheSame(oldItem: Drink, newItem: Drink): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Drink, newItem: Drink): Boolean {
        return oldItem == newItem
    }
}

class DrinkViewHolder(layout: View) : RecyclerView.ViewHolder(layout)