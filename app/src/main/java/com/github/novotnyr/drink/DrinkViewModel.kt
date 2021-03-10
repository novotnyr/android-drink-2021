package com.github.novotnyr.drink

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DrinkViewModel : ViewModel() {
    val drinks = MutableLiveData<List<Drink>>(emptyList())

    fun addDrink() {
        val oldDrinks = drinks.value ?: emptyList()
        drinks.value = oldDrinks + Drink()
    }
}