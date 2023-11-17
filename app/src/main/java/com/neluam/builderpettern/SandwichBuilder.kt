package com.neluam.builderpettern

import com.neluam.builderpettern.bread.Sliced
import com.neluam.builderpettern.filling.Cheese
import com.neluam.builderpettern.filling.Jam

object SandwichBuilder {
    fun cheeseAndJam(): Sandwich {
        val sandwich = Sandwich()
        sandwich.apply {
            addIngredient(Sliced())
            addIngredient(Cheese())
            addIngredient(Jam())
            addIngredient(Sliced())
        }
        return sandwich
    }

    fun build(sandwich: Sandwich, ingredient: Ingredient): Sandwich {
        sandwich.addIngredient(ingredient)
        return sandwich
    }
}