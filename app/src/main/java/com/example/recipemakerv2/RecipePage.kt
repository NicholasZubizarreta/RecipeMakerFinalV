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
        for(index in 0..recipes[currentRecipe].cIndex-1){
            rCats += recipes[currentRecipe].categories[index] + " "
        }


        var categories = findViewById<TextView>(R.id.categories)
        categories.text = rCats

//        gets original number of servings
//        edittext
        var scale = findViewById<TextView>(R.id.scale)
        var number = recipes[currentRecipe].servings.toString()
        val originalNum = recipes[currentRecipe].servings.toInt()
        scale.setText(number)

//        getting the ingredients
//        one good use of having the same layout as another page
        var ingredient1 = findViewById<TextView>(R.id.ingredient1)
        var ingredient2 = findViewById<TextView>(R.id.ingredient2)
        var ingredient3 = findViewById<TextView>(R.id.ingredient3)
        var ingredient4 = findViewById<TextView>(R.id.ingredient4)
        var ingredient5 = findViewById<TextView>(R.id.ingredient5)
        var ingredient6 = findViewById<TextView>(R.id.ingredient6)
        var ingredient7 = findViewById<TextView>(R.id.ingredient7)
        var ingredient8 = findViewById<TextView>(R.id.ingredient8)
        var ingredient9 = findViewById<TextView>(R.id.ingredient9)
        var ingredient10 = findViewById<TextView>(R.id.ingredient10)
        var ingredient11 = findViewById<TextView>(R.id.ingredient11)
        var ingredient12 = findViewById<TextView>(R.id.ingredient12)
        var ingredient13 = findViewById<TextView>(R.id.ingredient13)
        var ingredient14 = findViewById<TextView>(R.id.ingredient14)
        var ingredient15 = findViewById<TextView>(R.id.ingredient15)

        var wholeNum1 = findViewById<TextView>(R.id.wholeNumber1)
        var wholeNum2 = findViewById<TextView>(R.id.wholeNumber2)
        var wholeNum3 = findViewById<TextView>(R.id.wholeNumber3)
        var wholeNum4 = findViewById<TextView>(R.id.wholeNumber4)
        var wholeNum5 = findViewById<TextView>(R.id.wholeNumber5)
        var wholeNum6 = findViewById<TextView>(R.id.wholeNumber6)
        var wholeNum7 = findViewById<TextView>(R.id.wholeNumber7)
        var wholeNum8 = findViewById<TextView>(R.id.wholeNumber8)
        var wholeNum9 = findViewById<TextView>(R.id.wholeNumber9)
        var wholeNum10 = findViewById<TextView>(R.id.wholeNumber10)
        var wholeNum11 = findViewById<TextView>(R.id.wholeNumber11)
        var wholeNum12 = findViewById<TextView>(R.id.wholeNumber12)
        var wholeNum13 = findViewById<TextView>(R.id.wholeNumber13)
        var wholeNum14 = findViewById<TextView>(R.id.wholeNumber14)
        var wholeNum15 = findViewById<TextView>(R.id.wholeNumber15)

        var topHalf1 = findViewById<TextView>(R.id.topHalf1)
        var topHalf2 = findViewById<TextView>(R.id.topHalf2)
        var topHalf3 = findViewById<TextView>(R.id.topHalf3)
        var topHalf4 = findViewById<TextView>(R.id.topHalf4)
        var topHalf5 = findViewById<TextView>(R.id.topHalf5)
        var topHalf6 = findViewById<TextView>(R.id.topHalf6)
        var topHalf7 = findViewById<TextView>(R.id.topHalf7)
        var topHalf8 = findViewById<TextView>(R.id.topHalf8)
        var topHalf9 = findViewById<TextView>(R.id.topHalf9)
        var topHalf10 = findViewById<TextView>(R.id.topHalf10)
        var topHalf11 = findViewById<TextView>(R.id.topHalf11)
        var topHalf12 = findViewById<TextView>(R.id.topHalf12)
        var topHalf13 = findViewById<TextView>(R.id.topHalf13)
        var topHalf14 = findViewById<TextView>(R.id.topHalf14)
        var topHalf15 = findViewById<TextView>(R.id.topHalf15)

        var bottomHalf1 = findViewById<TextView>(R.id.bottomHalf1)
        var bottomHalf2 = findViewById<TextView>(R.id.bottomHalf2)
        var bottomHalf3 = findViewById<TextView>(R.id.bottomHalf3)
        var bottomHalf4 = findViewById<TextView>(R.id.bottomHalf4)
        var bottomHalf5 = findViewById<TextView>(R.id.bottomHalf5)
        var bottomHalf6 = findViewById<TextView>(R.id.bottomHalf6)
        var bottomHalf7 = findViewById<TextView>(R.id.bottomHalf7)
        var bottomHalf8 = findViewById<TextView>(R.id.bottomHalf8)
        var bottomHalf9 = findViewById<TextView>(R.id.bottomHalf9)
        var bottomHalf10 = findViewById<TextView>(R.id.bottomHalf10)
        var bottomHalf11 = findViewById<TextView>(R.id.bottomHalf11)
        var bottomHalf12 = findViewById<TextView>(R.id.bottomHalf12)
        var bottomHalf13 = findViewById<TextView>(R.id.bottomHalf13)
        var bottomHalf14 = findViewById<TextView>(R.id.bottomHalf14)
        var bottomHalf15 = findViewById<TextView>(R.id.bottomHalf15)

//        units were changed to a string
//        TODO MAYBE HAVE THESE DO CONVERSIONS
        var units1 = findViewById<TextView>(R.id.units1)
        var units2 = findViewById<TextView>(R.id.units2)
        var units3 = findViewById<TextView>(R.id.units3)
        var units4 = findViewById<TextView>(R.id.units4)
        var units5 = findViewById<TextView>(R.id.units5)
        var units6 = findViewById<TextView>(R.id.units6)
        var units7 = findViewById<TextView>(R.id.units7)
        var units8 = findViewById<TextView>(R.id.units8)
        var units9 = findViewById<TextView>(R.id.units9)
        var units10 = findViewById<TextView>(R.id.units10)
        var units11 = findViewById<TextView>(R.id.units11)
        var units12 = findViewById<TextView>(R.id.units12)
        var units13 = findViewById<TextView>(R.id.units13)
        var units14 = findViewById<TextView>(R.id.units14)
        var units15 = findViewById<TextView>(R.id.units15)

//        getting the ingredients unfortunately hard to set with the way I did things
        if(recipes[currentRecipe].ingredients[0].ingredient != "string"){
            ingredient1.setText(recipes[currentRecipe].ingredients[0].ingredient)
            wholeNum1.setText(recipes[currentRecipe].ingredients[0].wholeNum.toString())
            topHalf1.setText(recipes[currentRecipe].ingredients[0].topHalf.toString())
            bottomHalf1.setText(recipes[currentRecipe].ingredients[0].bottomHalf.toString())
            units1.setText(recipes[currentRecipe].ingredients[0].unit)
        }
        if(recipes[currentRecipe].ingredients[1].ingredient != "string"){
            ingredient2.setText(recipes[currentRecipe].ingredients[1].ingredient)
            wholeNum2.setText(recipes[currentRecipe].ingredients[1].wholeNum.toString())
            topHalf2.setText(recipes[currentRecipe].ingredients[1].topHalf.toString())
            bottomHalf2.setText(recipes[currentRecipe].ingredients[1].bottomHalf.toString())
            units2.setText(recipes[currentRecipe].ingredients[1].unit)
        }
        if(recipes[currentRecipe].ingredients[2].ingredient != "string"){
            ingredient3.setText(recipes[currentRecipe].ingredients[2].ingredient)
            wholeNum3.setText(recipes[currentRecipe].ingredients[2].wholeNum.toString())
            topHalf3.setText(recipes[currentRecipe].ingredients[2].topHalf.toString())
            bottomHalf3.setText(recipes[currentRecipe].ingredients[2].bottomHalf.toString())
            units3.setText(recipes[currentRecipe].ingredients[2].unit)
        }
        if(recipes[currentRecipe].ingredients[3].ingredient != "string"){
            ingredient4.setText(recipes[currentRecipe].ingredients[3].ingredient)
            wholeNum4.setText(recipes[currentRecipe].ingredients[3].wholeNum.toString())
            topHalf4.setText(recipes[currentRecipe].ingredients[3].topHalf.toString())
            bottomHalf4.setText(recipes[currentRecipe].ingredients[3].bottomHalf.toString())
            units4.setText(recipes[currentRecipe].ingredients[3].unit)
        }
        if(recipes[currentRecipe].ingredients[4].ingredient != "string"){
            ingredient5.setText(recipes[currentRecipe].ingredients[4].ingredient)
            wholeNum5.setText(recipes[currentRecipe].ingredients[4].wholeNum.toString())
            topHalf5.setText(recipes[currentRecipe].ingredients[4].topHalf.toString())
            bottomHalf5.setText(recipes[currentRecipe].ingredients[4].bottomHalf.toString())
            units5.setText(recipes[currentRecipe].ingredients[4].unit)
        }
        if(recipes[currentRecipe].ingredients[5].ingredient != "string"){
            ingredient6.setText(recipes[currentRecipe].ingredients[5].ingredient)
            wholeNum6.setText(recipes[currentRecipe].ingredients[5].wholeNum.toString())
            topHalf6.setText(recipes[currentRecipe].ingredients[5].topHalf.toString())
            bottomHalf6.setText(recipes[currentRecipe].ingredients[5].bottomHalf.toString())
            units6.setText(recipes[currentRecipe].ingredients[5].unit)
        }
        if(recipes[currentRecipe].ingredients[6].ingredient != "string"){
            ingredient7.setText(recipes[currentRecipe].ingredients[6].ingredient)
            wholeNum7.setText(recipes[currentRecipe].ingredients[6].wholeNum.toString())
            topHalf7.setText(recipes[currentRecipe].ingredients[6].topHalf.toString())
            bottomHalf7.setText(recipes[currentRecipe].ingredients[6].bottomHalf.toString())
            units7.setText(recipes[currentRecipe].ingredients[6].unit)
        }
        if(recipes[currentRecipe].ingredients[7].ingredient != "string"){
            ingredient8.setText(recipes[currentRecipe].ingredients[7].ingredient)
            wholeNum8.setText(recipes[currentRecipe].ingredients[7].wholeNum.toString())
            topHalf8.setText(recipes[currentRecipe].ingredients[7].topHalf.toString())
            bottomHalf8.setText(recipes[currentRecipe].ingredients[7].bottomHalf.toString())
            units8.setText(recipes[currentRecipe].ingredients[7].unit)
        }
        if(recipes[currentRecipe].ingredients[8].ingredient != "string"){
            ingredient9.setText(recipes[currentRecipe].ingredients[8].ingredient)
            wholeNum9.setText(recipes[currentRecipe].ingredients[8].wholeNum.toString())
            topHalf9.setText(recipes[currentRecipe].ingredients[8].topHalf.toString())
            bottomHalf9.setText(recipes[currentRecipe].ingredients[8].bottomHalf.toString())
            units9.setText(recipes[currentRecipe].ingredients[8].unit)
        }
        if(recipes[currentRecipe].ingredients[9].ingredient != "string"){
            ingredient10.setText(recipes[currentRecipe].ingredients[9].ingredient)
            wholeNum10.setText(recipes[currentRecipe].ingredients[9].wholeNum.toString())
            topHalf10.setText(recipes[currentRecipe].ingredients[9].topHalf.toString())
            bottomHalf10.setText(recipes[currentRecipe].ingredients[9].bottomHalf.toString())
            units10.setText(recipes[currentRecipe].ingredients[9].unit)
        }
        if(recipes[currentRecipe].ingredients[10].ingredient != "string"){
            ingredient11.setText(recipes[currentRecipe].ingredients[10].ingredient)
            wholeNum11.setText(recipes[currentRecipe].ingredients[10].wholeNum.toString())
            topHalf11.setText(recipes[currentRecipe].ingredients[10].topHalf.toString())
            bottomHalf11.setText(recipes[currentRecipe].ingredients[10].bottomHalf.toString())
            units11.setText(recipes[currentRecipe].ingredients[10].unit)
        }
        if(recipes[currentRecipe].ingredients[11].ingredient != "string"){
            ingredient12.setText(recipes[currentRecipe].ingredients[11].ingredient)
            wholeNum12.setText(recipes[currentRecipe].ingredients[11].wholeNum.toString())
            topHalf12.setText(recipes[currentRecipe].ingredients[11].topHalf.toString())
            bottomHalf12.setText(recipes[currentRecipe].ingredients[11].bottomHalf.toString())
            units12.setText(recipes[currentRecipe].ingredients[11].unit)
        }
        if(recipes[currentRecipe].ingredients[12].ingredient != "string"){
            ingredient13.setText(recipes[currentRecipe].ingredients[12].ingredient)
            wholeNum13.setText(recipes[currentRecipe].ingredients[12].wholeNum.toString())
            topHalf13.setText(recipes[currentRecipe].ingredients[12].topHalf.toString())
            bottomHalf13.setText(recipes[currentRecipe].ingredients[12].bottomHalf.toString())
            units13.setText(recipes[currentRecipe].ingredients[12].unit)
        }
        if(recipes[currentRecipe].ingredients[13].ingredient != "string"){
            ingredient14.setText(recipes[currentRecipe].ingredients[13].ingredient)
            wholeNum14.setText(recipes[currentRecipe].ingredients[13].wholeNum.toString())
            topHalf14.setText(recipes[currentRecipe].ingredients[13].topHalf.toString())
            bottomHalf14.setText(recipes[currentRecipe].ingredients[13].bottomHalf.toString())
            units14.setText(recipes[currentRecipe].ingredients[13].unit)
        }
        if(recipes[currentRecipe].ingredients[14].ingredient != "string"){
            ingredient15.setText(recipes[currentRecipe].ingredients[14].ingredient)
            wholeNum15.setText(recipes[currentRecipe].ingredients[14].wholeNum.toString())
            topHalf15.setText(recipes[currentRecipe].ingredients[14].topHalf.toString())
            bottomHalf15.setText(recipes[currentRecipe].ingredients[14].bottomHalf.toString())
            units15.setText(recipes[currentRecipe].ingredients[14].unit)
        }

//        gets directions so simply
        var directions = findViewById<TextView>(R.id.directions)
        directions.text = recipes[currentRecipe].directions

        val calculate: Button = findViewById(R.id.calculate)
        calculate.setOnClickListener(View.OnClickListener {
            scale.setText(scale.text.toString())
            var multiply = scale.text.toString().toFloat()/originalNum
            wholeNum1.setText((multiply * recipes[currentRecipe].ingredients[0].wholeNum.toString().toFloat()).toString())
            wholeNum2.setText((multiply * recipes[currentRecipe].ingredients[1].wholeNum.toString().toFloat()).toString())
            wholeNum3.setText((multiply * recipes[currentRecipe].ingredients[2].wholeNum.toString().toFloat()).toString())
            wholeNum4.setText((multiply * recipes[currentRecipe].ingredients[3].wholeNum.toString().toFloat()).toString())
            wholeNum5.setText((multiply * recipes[currentRecipe].ingredients[4].wholeNum.toString().toFloat()).toString())
            wholeNum6.setText((multiply * recipes[currentRecipe].ingredients[5].wholeNum.toString().toFloat()).toString())
            wholeNum7.setText((multiply * recipes[currentRecipe].ingredients[6].wholeNum.toString().toFloat()).toString())
            wholeNum8.setText((multiply * recipes[currentRecipe].ingredients[7].wholeNum.toString().toFloat()).toString())
            wholeNum9.setText((multiply * recipes[currentRecipe].ingredients[8].wholeNum.toString().toFloat()).toString())
            wholeNum10.setText((multiply * recipes[currentRecipe].ingredients[9].wholeNum.toString().toFloat()).toString())
            wholeNum11.setText((multiply * recipes[currentRecipe].ingredients[10].wholeNum.toString().toFloat()).toString())
            wholeNum12.setText((multiply * recipes[currentRecipe].ingredients[11].wholeNum.toString().toFloat()).toString())
            wholeNum13.setText((multiply * recipes[currentRecipe].ingredients[12].wholeNum.toString().toFloat()).toString())
            wholeNum14.setText((multiply * recipes[currentRecipe].ingredients[13].wholeNum.toString().toFloat()).toString())
            wholeNum15.setText((multiply * recipes[currentRecipe].ingredients[14].wholeNum.toString().toFloat()).toString())
            topHalf1.setText((multiply * recipes[currentRecipe].ingredients[0].topHalf.toString().toFloat()).toString())
            topHalf2.setText((multiply * recipes[currentRecipe].ingredients[1].topHalf.toString().toFloat()).toString())
            topHalf3.setText((multiply * recipes[currentRecipe].ingredients[2].topHalf.toString().toFloat()).toString())
            topHalf4.setText((multiply * recipes[currentRecipe].ingredients[3].topHalf.toString().toFloat()).toString())
            topHalf5.setText((multiply * recipes[currentRecipe].ingredients[4].topHalf.toString().toFloat()).toString())
            topHalf6.setText((multiply * recipes[currentRecipe].ingredients[5].topHalf.toString().toFloat()).toString())
            topHalf7.setText((multiply * recipes[currentRecipe].ingredients[6].topHalf.toString().toFloat()).toString())
            topHalf8.setText((multiply * recipes[currentRecipe].ingredients[7].topHalf.toString().toFloat()).toString())
            topHalf9.setText((multiply * recipes[currentRecipe].ingredients[8].topHalf.toString().toFloat()).toString())
            topHalf10.setText((multiply * recipes[currentRecipe].ingredients[9].topHalf.toString().toFloat()).toString())
            topHalf11.setText((multiply * recipes[currentRecipe].ingredients[10].topHalf.toString().toFloat()).toString())
            topHalf12.setText((multiply * recipes[currentRecipe].ingredients[11].topHalf.toString().toFloat()).toString())
            topHalf13.setText((multiply * recipes[currentRecipe].ingredients[12].topHalf.toString().toFloat()).toString())
            topHalf14.setText((multiply * recipes[currentRecipe].ingredients[13].topHalf.toString().toFloat()).toString())
            topHalf15.setText((multiply * recipes[currentRecipe].ingredients[14].topHalf.toString().toFloat()).toString())
        })
    }

    //    back button
    fun goBack(){
        val intent = Intent(this, YourRecipes::class.java).apply{}
        startActivity(intent)
    }
}