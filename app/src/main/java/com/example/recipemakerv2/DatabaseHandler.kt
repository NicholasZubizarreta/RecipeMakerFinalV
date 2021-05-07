package com.example.recipemakerv2

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import kotlin.collections.ArrayList

//Modified example from Eyehunt
//What I'm doing for saving is a modified version of what they did
/**
 *
 *
val DROP_TABLE = "DROP TABLE $TABLE_NAME "
db?.execSQL(DROP_TABLE)

val I_DROP_TABLE = "DROP TABLE $I_TABLE_NAME "
db?.execSQL(I_DROP_TABLE)

val CREATE_TABLE = "CREATE TABLE $TABLE_NAME " +
"($ID Integer PRIMARY KEY, $CATEGORY TEXT, $TITLE TEXT, $SERVINGS Integer, $DIRECTIONS TEXT)"
db?.execSQL(CREATE_TABLE)
val CREATE_TABLE2 = "CREATE TABLE $I_TABLE_NAME " +
"($INGRED_ID Integer PRIMARY KEY, $RECIPE_ID Integer, $WHOLE_NUM Integer, $UNIT TEXT, $INGREDIENT TEXT)"
db?.execSQL(CREATE_TABLE2)
 * Created by Eyehunt Team on 07/06/18.
 */
class DatabaseHandler(context: Context) :
        SQLiteOpenHelper(context, DB_NAME, null, DB_VERSIOM) {


    override fun onCreate(db: SQLiteDatabase?) {

      //  val DROPCREATE_TABLE = "CREATE TABLE $TABLE_NAME " +

        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME " +
               "($ID Integer PRIMARY KEY, $CATEGORY TEXT, $TITLE TEXT, $SERVINGS Integer, $DIRECTIONS TEXT)"

        db?.execSQL(CREATE_TABLE)
        val CREATE_TABLE2 = "CREATE TABLE $I_TABLE_NAME " +
                "($INGRED_ID Integer PRIMARY KEY, $RECIPE_ID Integer, $WHOLE_NUM Float, $UNIT TEXT, $INGREDIENT TEXT)"
       db?.execSQL(CREATE_TABLE2) }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        // Called when the database needs to be upgraded
    }

    //Inserting (Creating) data
    fun addRecipe(recipe: Recipes): Boolean {
        //Create and/or open a database that will be used for reading and writing.
        val db = this.writableDatabase
        val values = ContentValues()

        values.put(CATEGORY, recipe.category)
        values.put(TITLE, recipe.title)
        values.put(SERVINGS, recipe.servings)
        values.put(DIRECTIONS, recipe.directions)
        val _success = db.insert(TABLE_NAME, null, values)
        db.close()
        a= _success.toInt()
        Log.v("InsertedID", "$_success")
        return (Integer.parseInt("$_success") != -1)
    }

//    val CREATE_TABLE2 = "CREATE TABLE $I_TABLE_NAME " +
//            "($INGRED_ID Integer PRIMARY KEY, $RECIPE_ID Integer, $WHOLE_NUM Integer, $UNIT TEXT, $INGREDIENT TEXT)"
    fun addIngredients(ingredient : ArrayList<Ingredient>): Boolean {
        //Create and/or open a database that will be used for reading and writing.
        val db = this.writableDatabase
        val values = ContentValues()
    val _success = 0
        for(num in 0..ingredient.size-1) {
            values.put(RECIPE_ID, a)
            values.put(WHOLE_NUM, ingredient[num].wholeNum)
            values.put(UNIT, ingredient[num].unit)
            values.put(INGREDIENT, ingredient[num].ingredient)
// have to save each ingredient
            db.insert(I_TABLE_NAME, null, values)
        }

        db.close()
        Log.v("InsertedID", "$_success")
        return (Integer.parseInt("$_success") != -1)
    }
    //get all recipes
    fun getAllRecipes(){
 //       var allRecipes: List<Recipe> = arrayListOf<Recipe>();
        val db = readableDatabase


        val selectALLQuery = "SELECT * FROM $TABLE_NAME"
        val cursor = db.rawQuery(selectALLQuery, null)
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                do {
                    var id = cursor.getString(cursor.getColumnIndex(ID)).toInt()
                    var category = cursor.getString(cursor.getColumnIndex(CATEGORY))
                    var title = cursor.getString(cursor.getColumnIndex(TITLE))
                    var servings = cursor.getString(cursor.getColumnIndex(SERVINGS)).toInt()
                    var directions = cursor.getString(cursor.getColumnIndex(DIRECTIONS))

                    val selectIngredientQuery = "SELECT * FROM $I_TABLE_NAME"
                    val ingredientscursor = db.rawQuery(selectIngredientQuery, null)
                    val ingredients = arrayListOf<Ingredient>()
                    if (ingredientscursor != null) {
                        if (ingredientscursor.moveToFirst()) {
                            do {

                                var ingredientid = ingredientscursor.getString(ingredientscursor.getColumnIndex(INGRED_ID))
                                var recipe_id = ingredientscursor.getString(ingredientscursor.getColumnIndex(RECIPE_ID)).toInt()
                                var whole_num = ingredientscursor.getString(ingredientscursor.getColumnIndex(WHOLE_NUM)).toFloat()
                                var unit = ingredientscursor.getString(ingredientscursor.getColumnIndex(UNIT))
                                var ingredient = ingredientscursor.getString(ingredientscursor.getColumnIndex(INGREDIENT))
                                if (recipe_id == id) {
                                    ingredients.add(Ingredient(whole_num, unit, ingredient))
                                }
                            } while (ingredientscursor.moveToNext())
                        }
                    }
                    ingredientscursor.close()
                    recipes.add(Recipe(category, title, servings, ingredients, directions))
                } while (cursor.moveToNext())
            }
        }
        cursor.close()
        db.close()
    }


    companion object {
        private val DB_NAME = "RecipesDB"
        private val DB_VERSIOM = 1;
        private val TABLE_NAME = "myrecipes"
        private val ID = "id"
        private val CATEGORY = "category"
        private val TITLE = "title"
        private val SERVINGS = "servings"
        private val DIRECTIONS = "directions"
        private val I_TABLE_NAME = "myingredients"
        private val INGRED_ID = "ingred_id"
        private val WHOLE_NUM = "wholeNum"
        private val UNIT = "unit"
        private val INGREDIENT = "ingredient"
        private val RECIPE_ID = "id"

    }
}