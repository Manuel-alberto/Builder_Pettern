package com.neluam.builderpettern.bread

import com.neluam.builderpettern.R


class Baguette: Bread() {
    override fun name(): String = "Baguette"
    override fun calories(): Int = 238
    override fun description(): String = "Una bagette recien hecha y super crugiente"
    override fun image(): Int = R.drawable.bagette
}