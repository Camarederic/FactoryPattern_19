package com.example.factorypattern_19

import java.lang.IllegalArgumentException

object CoffeeFactory {

    enum class Type {
        LATTE, AMERICANO
    }

    fun getCoffee(type: Type): Coffee {
        if (type == Type.LATTE) {
            return CaffeLatte()
        } else if (type == Type.AMERICANO) {
            return Americano()
        }
        throw IllegalArgumentException("Can't handle your command ${type.name}")
    }
}