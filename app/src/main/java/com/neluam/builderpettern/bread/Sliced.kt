package com.neluam.builderpettern.bread

import com.neluam.builderpettern.R

class Sliced: Bread() {
    override fun name(): String = "SlicedBread"
    override fun calories(): Int = 67
    override fun description(): String = "Pan blanco perfecto para sandwiches"
    override fun image(): Int = R.drawable.slice

}