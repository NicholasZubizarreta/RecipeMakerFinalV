package com.example.recipemakerv2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

//input by text page
//word to describe this page complicated
class InputByTextPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_by_text_page)

//        back button
        val button: Button = findViewById(R.id.backAPage)
        button.setOnClickListener(View.OnClickListener {
            goBackAPage();
        })

//        TODO Do Spinners in Fragment instead of here
        //borrowed and learned from geeksforgeeks
//        drop down lists
//        goes on for quite awhile
        val units = resources.getStringArray(R.array.units)
        val units1 = findViewById<Spinner>(R.id.units1)
        if(units1 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units1.adapter = adapter
        }

        units1.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units2 = findViewById<Spinner>(R.id.units2)
        if(units2 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units2.adapter = adapter
        }

        units2.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units3 = findViewById<Spinner>(R.id.units3)
        if(units3 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units3.adapter = adapter
        }

        units3.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units4 = findViewById<Spinner>(R.id.units4)
        if(units4 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units4.adapter = adapter
        }

        units4.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units5 = findViewById<Spinner>(R.id.units5)
        if(units5 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units5.adapter = adapter
        }

        units5.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units6 = findViewById<Spinner>(R.id.units6)
        if(units6 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units6.adapter = adapter
        }

        units6.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units7 = findViewById<Spinner>(R.id.units7)
        if(units7 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units7.adapter = adapter
        }

        units7.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units8 = findViewById<Spinner>(R.id.units8)
        if(units8 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units8.adapter = adapter
        }

        units8.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units9 = findViewById<Spinner>(R.id.units9)
        if(units9 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units9.adapter = adapter
        }

        units9.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units10 = findViewById<Spinner>(R.id.units10)
        if(units10 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units10.adapter = adapter
        }

        units10.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units11 = findViewById<Spinner>(R.id.units11)
        if(units11 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units11.adapter = adapter
        }

        units11.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units12 = findViewById<Spinner>(R.id.units12)
        if(units12 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units12.adapter = adapter
        }

        units12.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units13 = findViewById<Spinner>(R.id.units13)
        if(units13 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units13.adapter = adapter
        }

        units13.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units14 = findViewById<Spinner>(R.id.units14)
        if(units14 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units14.adapter = adapter
        }

        units14.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

        val units15 = findViewById<Spinner>(R.id.units15)
        if(units15 != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            units15.adapter = adapter
        }

        units15.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@InputByTextPage, getString(R.string.selected_item) + " " +
                        "" + units[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

//        switches pages to the recipes page
        val button0: Button = findViewById(R.id.createRecipe)
        button0.setOnClickListener(View.OnClickListener {
            RecipePage();
        })

    }

    //    goes back a page
    fun goBackAPage(){
        val intent = Intent(this, CreatingRecipeOptions::class.java).apply{}
        startActivity(intent)
    }

    //    creates recipe
    fun RecipePage(){
//        fetching categories from checkboxes
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

//    creates an array of categories for recipes
        val categories = arrayListOf<String>("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")
//    keeps track of how many categories have been changed
        var cIndex=0

//    checking the check boxes
        if(beef.isChecked){
            categories.set(cIndex, beef.text.toString())
            cIndex++
        }
        if(chicken.isChecked){
            categories.set(cIndex, chicken.text.toString())
            cIndex++
        }
        if(seafood.isChecked){
            categories.set(cIndex, seafood.text.toString())
            cIndex++
        }
        if(pasta.isChecked){
            categories.set(cIndex, pasta.text.toString())
            cIndex++
        }
        if(soup.isChecked){
            categories.set(cIndex, soup.text.toString())
            cIndex++
        }
        if(salad.isChecked){
            categories.set(cIndex, salad.text.toString())
            cIndex++
        }
        if(vegetable.isChecked){
            categories.set(cIndex, vegetable.text.toString())
            cIndex++
        }
        if(vegan.isChecked){
            categories.set(cIndex, vegan.text.toString())
            cIndex++
        }
        if(dessert.isChecked){
            categories.set(cIndex, dessert.text.toString())
            cIndex++
        }
        if(other.isChecked){
            categories.set(cIndex, other.text.toString())
            cIndex++
        }

//        title
        val title = findViewById<EditText>(R.id.titleName).text.toString()

//        number of servings
        val servings = findViewById<EditText>(R.id.scale).text.toString().toInt()

//    TODO FIX THIS TO BE SIMPLIER
//        ingredients
//    this took awhile
//    array of ingredients with place holders
        val ingredients = arrayListOf<Ingredient>(Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"), Ingredient(0,0,0, "test", "string"))
//    index of ingredients
        var iNum = 0
//    ingredient names
        val ingredient1 = findViewById<EditText>(R.id.ingredient1).text.toString()
        val ingredient2 = findViewById<EditText>(R.id.ingredient2).text.toString()
        val ingredient3 = findViewById<EditText>(R.id.ingredient3).text.toString()
        val ingredient4 = findViewById<EditText>(R.id.ingredient4).text.toString()
        val ingredient5 = findViewById<EditText>(R.id.ingredient5).text.toString()
        val ingredient6 = findViewById<EditText>(R.id.ingredient6).text.toString()
        val ingredient7 = findViewById<EditText>(R.id.ingredient7).text.toString()
        val ingredient8 = findViewById<EditText>(R.id.ingredient8).text.toString()
        val ingredient9 = findViewById<EditText>(R.id.ingredient9).text.toString()
        val ingredient10 = findViewById<EditText>(R.id.ingredient10).text.toString()
        val ingredient11 = findViewById<EditText>(R.id.ingredient11).text.toString()
        val ingredient12 = findViewById<EditText>(R.id.ingredient12).text.toString()
        val ingredient13 = findViewById<EditText>(R.id.ingredient13).text.toString()
        val ingredient14 = findViewById<EditText>(R.id.ingredient14).text.toString()
        val ingredient15 = findViewById<EditText>(R.id.ingredient15).text.toString()
//whole numbers
        var wholeNum1 = findViewById<EditText>(R.id.wholeNumber1).text.toString().toInt()
        var wholeNum2 = findViewById<EditText>(R.id.wholeNumber2).text.toString().toInt()
        var wholeNum3 = findViewById<EditText>(R.id.wholeNumber3).text.toString().toInt()
        var wholeNum4 = findViewById<EditText>(R.id.wholeNumber4).text.toString().toInt()
        var wholeNum5 = findViewById<EditText>(R.id.wholeNumber5).text.toString().toInt()
        var wholeNum6 = findViewById<EditText>(R.id.wholeNumber6).text.toString().toInt()
        var wholeNum7 = findViewById<EditText>(R.id.wholeNumber7).text.toString().toInt()
        var wholeNum8 = findViewById<EditText>(R.id.wholeNumber8).text.toString().toInt()
        var wholeNum9 = findViewById<EditText>(R.id.wholeNumber9).text.toString().toInt()
        var wholeNum10 = findViewById<EditText>(R.id.wholeNumber10).text.toString().toInt()
        var wholeNum11 = findViewById<EditText>(R.id.wholeNumber11).text.toString().toInt()
        var wholeNum12 = findViewById<EditText>(R.id.wholeNumber12).text.toString().toInt()
        var wholeNum13 = findViewById<EditText>(R.id.wholeNumber13).text.toString().toInt()
        var wholeNum14 = findViewById<EditText>(R.id.wholeNumber14).text.toString().toInt()
        var wholeNum15 = findViewById<EditText>(R.id.wholeNumber15).text.toString().toInt()
//    fractions
//    top
        var topHalf1 = findViewById<EditText>(R.id.topHalf1).text.toString().toInt()
        var topHalf2 = findViewById<EditText>(R.id.topHalf2).text.toString().toInt()
        var topHalf3 = findViewById<EditText>(R.id.topHalf3).text.toString().toInt()
        var topHalf4 = findViewById<EditText>(R.id.topHalf4).text.toString().toInt()
        var topHalf5 = findViewById<EditText>(R.id.topHalf5).text.toString().toInt()
        var topHalf6 = findViewById<EditText>(R.id.topHalf6).text.toString().toInt()
        var topHalf7 = findViewById<EditText>(R.id.topHalf7).text.toString().toInt()
        var topHalf8 = findViewById<EditText>(R.id.topHalf8).text.toString().toInt()
        var topHalf9 = findViewById<EditText>(R.id.topHalf9).text.toString().toInt()
        var topHalf10 = findViewById<EditText>(R.id.topHalf10).text.toString().toInt()
        var topHalf11 = findViewById<EditText>(R.id.topHalf11).text.toString().toInt()
        var topHalf12 = findViewById<EditText>(R.id.topHalf12).text.toString().toInt()
        var topHalf13 = findViewById<EditText>(R.id.topHalf13).text.toString().toInt()
        var topHalf14 = findViewById<EditText>(R.id.topHalf14).text.toString().toInt()
        var topHalf15 = findViewById<EditText>(R.id.topHalf15).text.toString().toInt()
//bottom
        var bottomHalf1 = findViewById<EditText>(R.id.bottomHalf1).text.toString().toInt()
        var bottomHalf2 = findViewById<EditText>(R.id.bottomHalf2).text.toString().toInt()
        var bottomHalf3 = findViewById<EditText>(R.id.bottomHalf3).text.toString().toInt()
        var bottomHalf4 = findViewById<EditText>(R.id.bottomHalf4).text.toString().toInt()
        var bottomHalf5 = findViewById<EditText>(R.id.bottomHalf5).text.toString().toInt()
        var bottomHalf6 = findViewById<EditText>(R.id.bottomHalf6).text.toString().toInt()
        var bottomHalf7 = findViewById<EditText>(R.id.bottomHalf7).text.toString().toInt()
        var bottomHalf8 = findViewById<EditText>(R.id.bottomHalf8).text.toString().toInt()
        var bottomHalf9 = findViewById<EditText>(R.id.bottomHalf9).text.toString().toInt()
        var bottomHalf10 = findViewById<EditText>(R.id.bottomHalf10).text.toString().toInt()
        var bottomHalf11 = findViewById<EditText>(R.id.bottomHalf11).text.toString().toInt()
        var bottomHalf12 = findViewById<EditText>(R.id.bottomHalf12).text.toString().toInt()
        var bottomHalf13 = findViewById<EditText>(R.id.bottomHalf13).text.toString().toInt()
        var bottomHalf14 = findViewById<EditText>(R.id.bottomHalf14).text.toString().toInt()
        var bottomHalf15 = findViewById<EditText>(R.id.bottomHalf15).text.toString().toInt()
//drop down lists (spinners)
        var units1 = findViewById<Spinner>(R.id.units1).selectedItem.toString()
        var units2 = findViewById<Spinner>(R.id.units2).selectedItem.toString()
        var units3 = findViewById<Spinner>(R.id.units3).selectedItem.toString()
        var units4 = findViewById<Spinner>(R.id.units4).selectedItem.toString()
        var units5 = findViewById<Spinner>(R.id.units5).selectedItem.toString()
        var units6 = findViewById<Spinner>(R.id.units6).selectedItem.toString()
        var units7 = findViewById<Spinner>(R.id.units7).selectedItem.toString()
        var units8 = findViewById<Spinner>(R.id.units8).selectedItem.toString()
        var units9 = findViewById<Spinner>(R.id.units9).selectedItem.toString()
        var units10 = findViewById<Spinner>(R.id.units10).selectedItem.toString()
        var units11 = findViewById<Spinner>(R.id.units11).selectedItem.toString()
        var units12 = findViewById<Spinner>(R.id.units12).selectedItem.toString()
        var units13 = findViewById<Spinner>(R.id.units13).selectedItem.toString()
        var units14 = findViewById<Spinner>(R.id.units14).selectedItem.toString()
        var units15 = findViewById<Spinner>(R.id.units15).selectedItem.toString()

//    checking the ingredient rows and creating actual ingredients
        if(ingredient1.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum1, topHalf1, bottomHalf1, units1, ingredient1))
            iNum++
        }

        if(ingredient2.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum2, topHalf2, bottomHalf2, units2, ingredient2))
            iNum++
        }

        if(ingredient3.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum3, topHalf3, bottomHalf3, units3, ingredient3))
            iNum++
        }

        if(ingredient4.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum4, topHalf4, bottomHalf4, units4, ingredient4))
            iNum++
        }

        if(ingredient5.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum5, topHalf5, bottomHalf5, units5, ingredient5))
            iNum++
        }

        if(ingredient6.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum6, topHalf6, bottomHalf6, units6, ingredient6))
            iNum++
        }

        if(ingredient7.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum7, topHalf7, bottomHalf7, units7, ingredient7))
            iNum++
        }

        if(ingredient8.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum8, topHalf8, bottomHalf8, units8, ingredient8))
            iNum++
        }

        if(ingredient9.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum9, topHalf9, bottomHalf9, units9, ingredient9))
            iNum++
        }

        if(ingredient10.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum10, topHalf10, bottomHalf10, units10, ingredient10))
            iNum++
        }

        if(ingredient11.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum11, topHalf11, bottomHalf11, units11, ingredient11))
            iNum++
        }

        if(ingredient12.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum12, topHalf12, bottomHalf12, units12, ingredient12))
            iNum++
        }

        if(ingredient13.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum13, topHalf13, bottomHalf13, units13, ingredient13))
            iNum++
        }

        if(ingredient14.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum14, topHalf14, bottomHalf14, units14, ingredient14))
            iNum++
        }

        if(ingredient15.isNullOrEmpty() == false){
            ingredients.set(iNum, Ingredient(wholeNum15, topHalf15, bottomHalf15, units15, ingredient15))
            iNum++
        }

//    getting directions
        val directions = findViewById<EditText>(R.id.directions).text.toString()

//    creating recipe
//    saves to global array recipes
        recipes.add(Recipe(categories, cIndex, title, servings, ingredients, iNum, directions))
        a = a+1

//    intent goes to your recipes
        val intent = Intent(this, YourRecipes::class.java).apply{
        }
        startActivity(intent)
    }

}