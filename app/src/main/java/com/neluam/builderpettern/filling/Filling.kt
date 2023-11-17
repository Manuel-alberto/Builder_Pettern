package com.neluam.builderpettern.filling

import com.neluam.builderpettern.Ingredient

abstract class Filling: Ingredient {
    abstract override fun name(): String
    abstract override fun calories(): Int
    abstract override fun description(): String
    abstract override fun image(): Int
}