package com.neluam.builderpettern.bread

import com.neluam.builderpettern.R

class Roll: Bread() {
    override fun name(): String = "Roll"
    override fun calories(): Int = 301
    override fun description(): String = "Rol de canela con pasas"
    override fun image(): Int = R.drawable.roll
}