package com.neluam.builderpettern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.neluam.builderpettern.bread.Baguette
import com.neluam.builderpettern.filling.Cheese
import com.neluam.builderpettern.filling.Tomato

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder = SandwichBuilder
        val classicSandwich = builder.cheeseAndJam()
        Log.d(TAG, "Sandwich classic")
        classicSandwich.apply {
            getIngredients()
            calories
        }
        val customSandwich = builder.cheeseAndJam()
        builder.build(customSandwich, Tomato())
        Log.d(TAG, "Con tomate extra")
        customSandwich.apply {
            getIngredients()
            calories
        }

        val doubleCustomCheese = Sandwich()
        builder.apply {
            build(doubleCustomCheese, Baguette())
            build(doubleCustomCheese, Cheese())
            build(doubleCustomCheese, Cheese())
            build(doubleCustomCheese, Tomato())
        }
        Log.d(TAG, "Sandwich con doble queso")
        doubleCustomCheese.apply {
            getIngredients()
            calories
        }

    }
}