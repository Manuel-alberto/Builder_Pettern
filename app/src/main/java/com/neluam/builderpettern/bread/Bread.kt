package com.neluam.builderpettern.bread

import com.neluam.builderpettern.Ingredient

abstract class Bread : Ingredient{
    abstract override fun name(): String
    abstract override fun calories(): Int
    abstract override fun description(): String
    abstract override fun image(): Int
}
