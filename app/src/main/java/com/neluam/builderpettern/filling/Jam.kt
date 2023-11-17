package com.neluam.builderpettern.filling

import com.neluam.builderpettern.R

class Jam: Filling() {
    override fun name(): String = "Jamón"
    override fun calories(): Int = 195
    override fun description(): String = "Jamon de pierna de cerdo ahumado"
    override fun image(): Int = R.drawable.jam
}