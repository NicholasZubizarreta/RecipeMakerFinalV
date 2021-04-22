package com.example.recipemakerv2

import android.app.ActionBar
import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.*
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.OneShotPreDrawListener.add

//global variables which do different things
//a is just an index for creating recipes
var a=0
//list of recipes
var recipes = arrayListOf<Recipe>()
//current recipe index for if you create a recipe and go to the page
var currentRecipe = 0
//database handler
var dbHandler: DatabaseHandler? = null
var notloaded = 0
//default home page
class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

//        database handler
        dbHandler = DatabaseHandler(this)

 //       recipes =
        if ( notloaded == 0 ) {
            dbHandler!!.getAllRecipes()
            notloaded = 1
        }
        val button: Button = findViewById(R.id.inputNewRecipe)
        button.setOnClickListener(View.OnClickListener {
            goToCreateOptions();
        })

//        goes to your recipes
        val button0: Button = findViewById(R.id.searchYourRecipes)
        button0.setOnClickListener(View.OnClickListener {
            searchRecipes();
        })

    }

    //    create options
    fun goToCreateOptions(){
        val intent = Intent(this, CreatingRecipeOptions::class.java).apply{}
        startActivity(intent)
    }

    //    your recipes
    fun searchRecipes(){
        val intent = Intent(this, YourRecipes::class.java).apply{}
        startActivity(intent)
    }
}