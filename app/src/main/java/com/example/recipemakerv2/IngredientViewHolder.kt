package com.example.recipemakerv2

import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.recyclerview.widget.RecyclerView

class IngredientViewHolder (view: View): RecyclerView.ViewHolder(view){
    var wholeNum = view.findViewById<View>(R.id.wholeNum) as EditText
    var unit = view.findViewById<View>(R.id.unit) as Spinner
    var ingredient = view.findViewById<View>(R.id.ingredient) as EditText
}
