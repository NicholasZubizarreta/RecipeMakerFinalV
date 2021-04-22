package com.example.recipemakerv2

import android.util.Log
import java.util.*

class IngredientManager {
    var ingredients: ArrayList<Ingredient> = ArrayList<Ingredient>()

    fun getInstance(): IngredientManager? {
        if(instance == null) {
            instance = IngredientManager()
        }
        return instance
    }

    fun addSampleData() {
        ingredients.add(Ingredient(5, "cups", "Water"))
    }

    fun addSampleDatatoFront() {
        ingredients.add(0, Ingredient(5, "cups", "Water"))
    }

    fun removeFirstWithName(toRemove: String): Int {
        for (i in ingredients.indices) {
            if (ingredients.get(i).ingredient.equals(toRemove)) {
                ingredients.removeAt(i)
                Log.d("Removal Notice", i.toString() + " " + toRemove)
                return i
            }
        }
        return -1
    }

    companion object {
        var instance: IngredientManager? = null
    }
}