package com.github.novotnyr.drink

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
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

class DrinkListAdapter : ListAdapter<Drink, DrinkViewHolder>(DrinkDiff) {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrinkViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.drink, parent, false)
        return DrinkViewHolder(layout)
    }

    override fun onBindViewHolder(holder: DrinkViewHolder, position: Int) {
        // nothing
    }
}