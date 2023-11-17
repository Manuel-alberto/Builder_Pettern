package com.neluam.builderpettern

interface Ingredient {
    fun name(): String
    fun calories(): Int
    fun description(): String
    fun image(): Int
}