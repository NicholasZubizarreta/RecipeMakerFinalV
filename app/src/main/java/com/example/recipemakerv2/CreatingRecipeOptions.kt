package com.example.recipemakerv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
//selecting option for how you create recipe page
class CreatingRecipeOptions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creating_recipe_options)

//        back button to escape the page
        val button: Button = findViewById(R.id.backToHome)
        button.setOnClickListener(View.OnClickListener {
            goBackToHome();
        })

//        button that takes you to a page where you can fill in everything
        val button0: Button = findViewById(R.id.input)
        button0.setOnClickListener(View.OnClickListener {
            goToInputPage();
        })

//        TODO SAVE PICTURE LAST
//        TODO BUTTON FOR GOING TO INPUT BY PICTURE
//        TODO SCANNING PICTURES FOR INFORMATION
//        TODO FILLING OUT INFORMATION
//        TODO SIMPLY STORING PICTURE
//        TODO HAVING RECIPE CREATED
//        TODO BUTTON FOR INPUTTING FROM INTERNET
//        TODO ALLOWING INTERNET SEARCHES AND IMPORTS
//        TODO SCANNING PAGE FOR INFORMATION
//        TODO FILLING OUT INFORMATION
    }

    //    goes back to home in this case
    fun goBackToHome(){
        val intent = Intent(this, HomePage::class.java).apply{}
        startActivity(intent)
    }

    //    takes you to the input by text page
    fun goToInputPage(){
        val intent = Intent(this, InputByTextPage::class.java).apply{}
        startActivity(intent)
    }
}