package com.example.recipemakerv2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.SpinnerAdapter
import androidx.fragment.app.Fragment


// TODO Fragment Spinner link to String resources units
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val WHOLE_NUM = "wholeNum"
private const val TOP_HALF = "topHalf"
private const val BOTTOM_HALF = "bottomHalf"
private const val UNIT = "unit"
private const val INGREDIENT = "ingredient"
val units = arrayOf("unit")

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var wholeNum: Int? = null
    private var topHalf: Int? = null
    private var bottomHalf: Int? = null
    private var unit: String? = null
    private var ingredient: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            wholeNum = it.getInt(WHOLE_NUM)
            topHalf = it.getInt(TOP_HALF)
            bottomHalf = it.getInt(BOTTOM_HALF)
            unit = it.getString(UNIT)
            ingredient = it.getString(INGREDIENT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(wholeNum:Int, topHalf:Int, bottomHalf:Int, unit:String, ingredient: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putInt(WHOLE_NUM, wholeNum)
                    putInt(TOP_HALF, topHalf)
                    putInt(BOTTOM_HALF, bottomHalf)
                    putString(UNIT, unit)
                    putString(INGREDIENT, ingredient)
                }
            }
    }

}