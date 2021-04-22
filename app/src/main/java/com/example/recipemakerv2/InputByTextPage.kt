package com.example.recipemakerv2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//input by text page
//word to describe this page complicated
class InputByTextPage : AppCompatActivity(), View.OnClickListener{

    var recordManager: IngredientManager? = IngredientManager().getInstance()

    var ingredientListRecyclerView: RecyclerView? = null
    var ingredientRecycler: IngredientRecycler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_by_text_page)

        ingredientListRecyclerView = findViewById(R.id.iRecycler)

        val add: Button = findViewById(R.id.AddThing)
        add.setOnClickListener(View.OnClickListener {
           onClick(add)
        })

        ingredientRecycler = IngredientRecycler()
        ingredientListRecyclerView!!.setAdapter(ingredientRecycler)
        ingredientListRecyclerView!!.setLayoutManager(LinearLayoutManager(this))

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

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //No Idea
            }
        }

//        switches pages to the recipes page
//        db saving
        val button0: Button = findViewById(R.id.createRecipe)
        button0.setOnClickListener(View.OnClickListener {
            if (validation()) {
                val recipe: Recipes = Recipes()
                var success: Boolean = false
                recipe.category = checkCategory()
                recipe.title = findViewById<EditText>(R.id.titleName).text.toString()
                recipe.servings = findViewById<EditText>(R.id.scale).text.toString().toInt()
                recipe.directions = findViewById<EditText>(R.id.directions).text.toString()

                success = dbHandler!!.addRecipe(recipe)

                RecipePage();
            }

        })

    }

    //    goes back a page
    fun goBackAPage(){
        val intent = Intent(this, CreatingRecipeOptions::class.java).apply{}
        startActivity(intent)
    }

    //    creates recipe
    fun RecipePage() {

        val category = checkCategory()

//        title
        val title = findViewById<EditText>(R.id.titleName).text.toString()

//        number of servings
        val servings = findViewById<EditText>(R.id.scale).text.toString().toInt()

//    TODO FIX THIS TO BE SIMPLIER
//        ingredients
//    this took awhile
//    array of ingredients with place holders
        val ingredients = arrayListOf<Ingredient>()
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
            ingredients.add(Ingredient(wholeNum1, units1, ingredient1))
        }

        if(ingredient2.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum2, units2, ingredient2))
        }

        if(ingredient3.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum3, units3, ingredient3))
        }

        if(ingredient4.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum4, units4, ingredient4))
        }

        if(ingredient5.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum5, units5, ingredient5))
        }

        if(ingredient6.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum6, units6, ingredient6))
        }

        if(ingredient7.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum7, units7, ingredient7))
        }

        if(ingredient8.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum8, units8, ingredient8))
        }

        if(ingredient9.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum9, units9, ingredient9))
        }

        if(ingredient10.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum10, units10, ingredient10))
        }

        if(ingredient11.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum11, units11, ingredient11))
        }

        if(ingredient12.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum12, units12, ingredient12))
        }

        if(ingredient13.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum13, units13, ingredient13))
        }

        if(ingredient14.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum14, units14, ingredient14))
        }

        if(ingredient15.isNullOrEmpty() == false){
            ingredients.add(Ingredient(wholeNum15, units15, ingredient15))
        }

        dbHandler!!.addIngredients(ingredients)

//    getting directions
        val directions = findViewById<EditText>(R.id.directions).text.toString()

//    creating recipe
//    saves to global array recipes
        recipes.add(Recipe(category, title, servings, ingredients, directions))
        a = a+1

//    intent goes to your recipes
        val intent = Intent(this, InputByTextPage::class.java).apply{
        }
        startActivity(intent)
    }

    fun validation(): Boolean{
        val category = checkCategory()
        val title = findViewById<EditText>(R.id.titleName).text.toString()
        val servings = findViewById<EditText>(R.id.scale).text.toString().toInt()
        val directions = findViewById<EditText>(R.id.directions).text.toString()
        var validate = false

        if (!category.equals("") &&
                !title.equals("") &&
                !servings.equals(0) &&
                !directions.equals("")){
            validate = true
        }else{
            validate = false
            val toast = Toast.makeText(this,"Fill all details, category, title, servings, directions", Toast.LENGTH_LONG).show()
        }

        return validate
    }

    fun checkCategory(): String{
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

//    checking the check boxes
        if(beef.isChecked){
            return beef.text.toString()
        }
        if(chicken.isChecked){
            return chicken.text.toString()
        }
        if(seafood.isChecked){
            return seafood.text.toString()
        }
        if(pasta.isChecked){
            return pasta.text.toString()
        }
        if(soup.isChecked){
            return soup.text.toString()
        }
        if(salad.isChecked){
            return salad.text.toString()
        }
        if(vegetable.isChecked){
            return vegetable.text.toString()
        }
        if(vegan.isChecked){
            return vegan.text.toString()
        }
        if(dessert.isChecked){
            return dessert.text.toString()
        }
        if(other.isChecked){
            return other.text.toString()
        }
        return "Nothing";
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.AddThing -> {
                recordManager?.addSampleDatatoFront()
                ingredientRecycler?.notifyItemInserted(0)
                Log.d("added an item!", "" + (recordManager?.ingredients?.get(0) ))
            }
            else ->                 /*
                You can use this for larger changes to the data, for example sorting.
                However, be aware: you should always change the original List.
                If you re-declare the List, it can break the recycler
                 */ingredientRecycler?.notifyDataSetChanged()
        }
    }
}