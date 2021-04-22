package com.example.recipemakerv2

import android.content.Intent
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.view.OneShotPreDrawListener.add
import androidx.core.widget.addTextChangedListener

class YourRecipes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_recipes)

//        creates buttons and puts them into an array to simplify life
//        array
        var buttons = ArrayList<Button>()
//        loops through recipes creating and setting buttons
        for(num in 0..recipes.size-1){
            var button = Button(this)
            button.text = recipes[num].title
//            I figured out how to do layout adding for objects
//            fragments can be added
//            spinners are hard to do in fragments
            var layout = findViewById<LinearLayout>(R.id.rButtons)
            layout.addView(button)
            layout.invalidate()
//            sets a listener for the button and has recipe page set
            button.setOnClickListener(View.OnClickListener {
                goToRecipePage(num);
            })
//            adds buttons
            buttons.add(button)
        }

//        back button
        val button: Button = findViewById(R.id.backToHome)
        button.setOnClickListener(View.OnClickListener {
            goBackToHome();
        })

//        REVISED VERSION
//        gets search item
        val item = findViewById<EditText>(R.id.item)

        val beef = findViewById<RadioButton>(R.id.category1)
        val chicken = findViewById<RadioButton>(R.id.category2)
        val seafood = findViewById<RadioButton>(R.id.category3)
        val pasta = findViewById<RadioButton>(R.id.category4)
        val soup = findViewById<RadioButton>(R.id.category5)
        val salad = findViewById<RadioButton>(R.id.category6)
        val vegetable = findViewById<RadioButton>(R.id.category7)
        val vegan = findViewById<RadioButton>(R.id.category8)
        val dessert = findViewById<RadioButton>(R.id.category9)
        val other = findViewById<RadioButton>(R.id.category10)

        beef.setOnClickListener({
            filterRecipeList(buttons, beef.text.toString())
        })

        chicken.setOnClickListener({
            filterRecipeList(buttons, chicken.text.toString())
        })

        seafood.setOnClickListener({
            filterRecipeList(buttons, seafood.text.toString())
        })

        pasta.setOnClickListener({
            filterRecipeList(buttons, pasta.text.toString())
        })

        soup.setOnClickListener({
            filterRecipeList(buttons, soup.text.toString())
        })

        salad.setOnClickListener({
            filterRecipeList(buttons, salad.text.toString())
        })

        vegetable.setOnClickListener({
            filterRecipeList(buttons, vegetable.text.toString())
        })

        vegan.setOnClickListener({
            filterRecipeList(buttons, vegan.text.toString())
        })

        dessert.setOnClickListener({
            filterRecipeList(buttons, dessert.text.toString())
        })

        other.setOnClickListener({
            filterRecipeList(buttons, other.text.toString())
        })

        item.addTextChangedListener(object : TextWatcher{
            //            not using but required to be here
            override fun afterTextChanged(s: Editable?) {

            }

            //            not using but required to be here
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                var checked = "text"
                if (beef.isChecked) {
                    checked = beef.text.toString()
                }
                if (chicken.isChecked) {
                    checked = chicken.text.toString()
                }
                if (seafood.isChecked) {
                    checked = seafood.text.toString()
                }
                if (pasta.isChecked) {
                    checked = pasta.text.toString()
                }
                if (soup.isChecked) {
                    checked = soup.text.toString()
                }
                if (salad.isChecked) {
                    checked = salad.text.toString()
                }
                if (vegetable.isChecked) {
                    checked = vegetable.text.toString()
                }
                if (vegan.isChecked) {
                    checked = vegan.text.toString()
                }
                if (dessert.isChecked) {
                    checked = dessert.text.toString()
                }
                if (other.isChecked) {
                    checked = other.text.toString()
                }
                if(checked != "text"){
                    //            test lines
                    Log.d("item checked", checked.toUpperCase())
                    Log.d("item cat", recipes[0].category.toUpperCase())

//            TODO FILTER INSTEAD OF BUTTON SEARCH
                    for (index in 0..recipes.size - 1) {
                        item.text.toString().toUpperCase()
//                Matches recipe names to search typed in
                        if (( recipes[index].title.toUpperCase().contains(item.text.toString().toUpperCase())
                                    && recipes[index].category.toUpperCase() == checked.toUpperCase())
                            || recipes[index].category.toUpperCase() == checked.toUpperCase()
                            && checkIngredients(item, recipes[index]) == true
                        ) {
//                    Test lines not important
                            Log.d("item", item.text.toString().toUpperCase())
                            Log.d("a", recipes[index].title)
                            Log.d("a", recipes[index].category)
                            Log.d("checked", checked.toUpperCase())
//                    reveals any buttons that are hidden that apply to search
                            showButtons(buttons, index)
                        } else {
                            //                    method for hiding buttons
                            hideButtons(buttons, index)
                        }
                    }
                }else{
                    for (index in 0..recipes.size - 1) {
                        item.text.toString().toUpperCase()
//                Matches recipe names to search typed in
                        if ( recipes[index].title.toUpperCase().contains(item.text.toString().toUpperCase())
                            || checkIngredients(item, recipes[index]) == true
                        ) {
//                    Test lines not important
                            Log.d("item", item.text.toString().toUpperCase())
                            Log.d("a", recipes[index].title)
                            Log.d("a", recipes[index].category)
                            Log.d("checked", checked.toUpperCase())
//                    reveals any buttons that are hidden that apply to search
                            showButtons(buttons, index)
                        } else {
                            //                    method for hiding buttons
                            hideButtons(buttons, index)
                        }
                    }
                }
            }
        })
    }

    //    back to home
    fun goBackToHome(){
        val intent = Intent(this, HomePage::class.java).apply{}
        startActivity(intent)
    }

    //    goes to specific page
//    takes index from setbuttontitle
    fun goToRecipePage(rI:Int) {
//    saves to global
        currentRecipe = rI
//    goes to page
        val intent = Intent(this, RecipePage::class.java).apply{
        }
        startActivity(intent)
    }

    //    hides a button
    fun hideButtons(rB:List<Button>, index:Int){
        rB[index].visibility = View.INVISIBLE
    }

    //    shows a button
    fun showButtons(rB:List<Button>, index:Int){
        rB[index].visibility = View.VISIBLE
    }

    //    checks ingredients
    fun checkIngredients(item: EditText, r:Recipe): Boolean {
//    uses a boolean loops through the ingredients and sets to true if button needs to be shown
        var check = false
        for(ingredientindex in 0..r.ingredients.size-1){
            if(r.ingredients[ingredientindex].ingredient.toUpperCase().contains(item.text.toString().toUpperCase())){
                check = true
            }
        }
        return check
    }

    fun filterRecipeList(rB:List<Button>, cat:String): Boolean {
        for (index in 0..recipes.size - 1) {
            if(recipes[index].category == cat){
                showButtons(rB, index)
            }else{
                hideButtons(rB, index)
            }
        }
        return true
    }
}