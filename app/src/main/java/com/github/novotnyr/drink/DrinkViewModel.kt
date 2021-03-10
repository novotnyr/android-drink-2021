package com.github.novotnyr.drink

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class DrinkViewModel(private val state: SavedStateHandle) : ViewModel() {
    val drinks: LiveData<List<Drink>>
        get() {
            return state.getLiveData("drinks")
        }

    fun addDrink() {
        val oldDrinks = drinks.value ?: emptyList()
        state["drinks"] = oldDrinks + Drink()
    }

    fun removeDrink(position: Int) {
        val oldDrinks = drinks.value ?: emptyList()
        state["drinks"] = oldDrinks - oldDrinks.elementAt(position)
    }
}