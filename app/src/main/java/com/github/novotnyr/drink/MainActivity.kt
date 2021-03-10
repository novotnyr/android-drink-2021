package com.github.novotnyr.drink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var drinkRecyclerView: RecyclerView

    private val adapter = DrinkListAdapter().apply {
        submitList(listOf(Drink()))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drinkRecyclerView = findViewById(R.id.drinkRecyclerView)
        drinkRecyclerView.layoutManager = GridLayoutManager(this, 3)
        drinkRecyclerView.adapter = adapter
    }

    fun onFloatingActionButtonClick(view: View) {}
}