package com.github.novotnyr.drink

import androidx.recyclerview.widget.DiffUtil

object DrinkDiff : DiffUtil.ItemCallback<Drink>() {
    override fun areItemsTheSame(oldItem: Drink, newItem: Drink): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Drink, newItem: Drink): Boolean {
        return oldItem == newItem
    }
}