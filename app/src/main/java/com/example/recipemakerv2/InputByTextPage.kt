package com.example.recipemakerv2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

//input by text page
//word to describe this page complicated
class InputByTextPage : AppCompatActivity(), View.OnClickListener{
    var ingredients = arrayListOf<Ingredient>()
    var rows = arrayListOf<Ingredients>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_by_text_page)

        val add: Button = findViewById(R.id.addIngredient)
        add.setOnClickListener(View.OnClickListener {
           onClick(add)


        })

//        back button
        val button: Button = findViewById(R.id.backAPage)
        button.setOnClickListener(View.OnClickListener {
            goBackAPage();
        })

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

//        setting ingredients
        for(count in 0..rows.size-1){
            if(rows[count].wholeNum.text.isNullOrEmpty() == false){
                ingredients[count].wholeNum = rows[count].wholeNum.text.toString().toFloat()
            }
            rows[count].unit.onItemSelectedListener = object :
                    AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    ingredients[count].unit = rows[count].unit.selectedItem.toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    ingredients[count].unit = "Cups"
                }
            }
            if( rows[count].ingredient.text.isNullOrEmpty() == false) {
                ingredients[count].ingredient = rows[count].ingredient.text.toString()
            }
        }

        //database handler adds ingredients
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
        ingredients.add(Ingredient("0".toFloat(), "cups", "sample"))
        var layout = findViewById<LinearLayout>(R.id.iLayout)
        var row = LinearLayout(this)
        var wholeNum = EditText(this)
        wholeNum.hint = "# of units"
//        wholeNum.addTextChangedListener(){
//            ingredients[ingredients.size-1].wholeNum = wholeNum.text.toString().toFloat()
//        }
        val units = resources.getStringArray(R.array.units)
        var unit = Spinner(this)
        if(unit != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
            unit.adapter = adapter
        }
//
//        unit.onItemSelectedListener = object :
//                AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                ingredients[ingredients.size-1].unit = unit.selectedItem.toString()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                ingredients[ingredients.size-1].unit = "Cups"
//            }
//        }
        var ingredient = EditText(this)
        ingredient.hint = "ingredient name"
//        ingredient.addTextChangedListener(){
//            ingredients[ingredients.size-1].ingredient = ingredient.text.toString()
//        }
        row.addView(wholeNum, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        row.addView(unit, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        row.addView(ingredient, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        row.invalidate()
        rows.add(Ingredients(wholeNum, unit, ingredient))
        layout.addView(row, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        layout.invalidate()
    }
}