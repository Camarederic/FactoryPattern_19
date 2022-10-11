package com.example.factorypattern_19

interface Coffee {

    fun name():String
    fun recipe():String
}

class CaffeLatte: Coffee{

    override fun name(): String = "CaffeLatte"
    override fun recipe(): String = "Espresso"
}

class Americano:Coffee{

    override fun recipe():String = "Espresso, Hot water!"
    override fun name(): String = "Cafe Americano"
}