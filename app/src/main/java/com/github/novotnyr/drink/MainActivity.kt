package com.github.novotnyr.drink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var drinkRecyclerView: RecyclerView

    val viewModel: DrinkViewModel by viewModels()

    private val adapter = DrinkListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drinkRecyclerView = findViewById(R.id.drinkRecyclerView)
        drinkRecyclerView.layoutManager = GridLayoutManager(this, 3)
        drinkRecyclerView.adapter = adapter

        ItemTouchHelper(SwipeHelper())
            .attachToRecyclerView(drinkRecyclerView)

        viewModel.drinks.observe(this) {
            adapter.submitList(it)
        }
    }

    fun onFloatingActionButtonClick(floatingActionButton: View) {
        Snackbar.make(floatingActionButton, "Na zdravie!", Snackbar.LENGTH_LONG)
                .apply {
                    anchorView = floatingActionButton
                }
                .show()

        viewModel.addDrink()
    }

    inner class SwipeHelper : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            viewModel.removeDrink(viewHolder.adapterPosition)
        }

        override fun onMove(r: RecyclerView, v: RecyclerView.ViewHolder, t: RecyclerView.ViewHolder) = false
    }
}