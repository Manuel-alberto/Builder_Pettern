package com.neluam.builderpettern.filling

import com.neluam.builderpettern.R

class Tomato: Filling() {
    override fun name(): String = "Tomato"
    override fun calories(): Int = 22
    override fun description(): String = "Tomate salade"
    override fun image(): Int = R.drawable.tomatoe
}