package com.example.factorypattern_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.factorypattern_19.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var isChanged: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCoffee.setOnClickListener(this::changeCoffee)
    }

    private fun changeCoffee(view: View) {
        var factory:Coffee
        if (isChanged){
            factory = CoffeeFactory.getCoffee(CoffeeFactory.Type.AMERICANO)
        }else{
            factory = CoffeeFactory.getCoffee(CoffeeFactory.Type.LATTE)
            isChanged = true
        }

        changeCoffeeType(factory.recipe(), factory.name())
    }

    private fun changeCoffeeType(recipe: String, name: String) {
        binding.coffeeRecipe.text = recipe
        binding.coffeeName.text = name
    }
}