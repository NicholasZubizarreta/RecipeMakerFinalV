package com.example.recipemakerv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class RecipePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_page)

//back button
        val button: Button = findViewById(R.id.backAPage)
        button.setOnClickListener(View.OnClickListener {
            goBack();
        })

//        getting recipe from global variables
        var name = findViewById<TextView>(R.id.yourRecipe)
        name.text = recipes[currentRecipe].title;

//        gets categories
        var rCats = ""
        rCats += recipes[currentRecipe].category + " "



        var categories = findViewById<TextView>(R.id.categories)
        categories.text = rCats

//        gets original number of servings
//        edittext
        var scale = findViewById<TextView>(R.id.scale)
        var number = recipes[currentRecipe].servings.toString()
        val originalNum = recipes[currentRecipe].servings.toInt()
        scale.setText(number)

//        getting the ingredients
//        changed to a text view
        var ingredientList = findViewById<TextView>(R.id.ingredientList)
        var List = ""
        for(i in 0..recipes[currentRecipe].ingredients.size-1){
            List = List + recipes[currentRecipe].ingredients[i].wholeNum + " " + recipes[currentRecipe].ingredients[i].unit + " "+ recipes[currentRecipe].ingredients[i].ingredient + "\n"
        }
        ingredientList.setText(List)

//        gets directions so simply
        var directions = findViewById<TextView>(R.id.directions)
        directions.text = recipes[currentRecipe].directions

        val calculate: Button = findViewById(R.id.calculate)
        calculate.setOnClickListener(View.OnClickListener {
            scale.setText(scale.text.toString())
            var multiply = scale.text.toString().toFloat()/originalNum
            var ingredientList = findViewById<TextView>(R.id.ingredientList)
            var List = ""
            for(i in 0..recipes[currentRecipe].ingredients.size-1){
                List = List + (multiply * recipes[currentRecipe].ingredients[i].wholeNum.toString().toFloat()) + " " + recipes[currentRecipe].ingredients[i].unit + " "+ recipes[currentRecipe].ingredients[i].ingredient + "\n"
            }
            ingredientList.setText(List)
        })
    }

    //    back button
    fun goBack(){
        val intent = Intent(this, YourRecipes::class.java).apply{}
        startActivity(intent)
    }
}