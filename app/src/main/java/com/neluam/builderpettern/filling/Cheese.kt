package com.neluam.builderpettern.filling

import com.neluam.builderpettern.R

class Cheese: Filling() {
    override fun name(): String = "Chesse"
    override fun calories(): Int = 259
    override fun description(): String = "Queso tipo americano"
    override fun image(): Int = R.drawable.cheese
}