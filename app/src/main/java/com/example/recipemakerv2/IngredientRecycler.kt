package com.example.recipemakerv2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import androidx.recyclerview.widget.RecyclerView

class IngredientRecycler : RecyclerView.Adapter<IngredientViewHolder>(){

    var ingredientManager: IngredientManager = IngredientManager()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        /*
        Note that here, we pass the custom layout that comprises this "row" (see
        layout/row_item.xml), and "inflate" it, which basically allows it to be drawn
         */
        val contactView: View = inflater.inflate(R.layout.i_row_item, parent, false)

        /*
        In the RecordViewHolder class, we'll store the actual components, so there's a
        single common place to access them and make changes and such
         */
        return IngredientViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: IngredientViewHolder, position: Int) {
        //Grab a Record by its index...
        val record: Ingredient? = IngredientManager().getInstance()?.ingredients?.get(position)

        //Adjust the components of this row based on the Record's properties...
        if (record != null) {
            holder.wholeNum.setText(record.wholeNum)
        }
        val unit: Spinner = holder.unit
        if (record != null) {
            holder.ingredient.setText(record.ingredient)
        }
    }

    override fun getItemCount(): Int {
        return IngredientManager().ingredients.size
    }
}
