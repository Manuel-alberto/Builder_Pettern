package com.neluam.builderpettern

import android.util.Log

class Sandwich {
    val TAG = "Sandwich"
    private val ingredients: MutableList<Ingredient> = mutableListOf()

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }

    val calories: Unit
        get() {
            var calories = 0
            ingredients.forEach{ ingredient ->
                calories += ingredient.calories()
            }
            Log.i(TAG ,"Total de calorias: $calories kcal")
        }

    fun getIngredients() {
        ingredients.forEach { ingredient ->
            Log.i(TAG, "${ingredient.name()} : ${ingredient.calories()} kcal")
        }
    }
}