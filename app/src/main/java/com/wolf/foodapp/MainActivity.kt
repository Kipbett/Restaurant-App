package com.wolf.foodapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var listOfFood = ArrayList<Food>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gridView:GridView =findViewById(R.id.food_grid)

        listOfFood.add(Food("Asaparagus", "Very Delicious", R.drawable.asparagus))
        listOfFood.add(Food("Cake", "Very Delicious", R.drawable.cake))
        listOfFood.add(Food("Grapes", "Very Delicious", R.drawable.grapes))
        listOfFood.add(Food("Hamburger", "Very Delicious", R.drawable.hamburger))
        listOfFood.add(Food("Meat", "Very Delicious", R.drawable.meat))
        listOfFood.add(Food("Pancakes", "Very Delicious", R.drawable.pancakes))
        listOfFood.add(Food("Salmon", "Very Delicious", R.drawable.salmon))
        listOfFood.add(Food("Asaparagus", "Very Delicious", R.drawable.asparagus))

        var adaptor = FoodAdaptor(this, listOfFood)
        gridView.adapter = adaptor

    }

    class FoodAdaptor:BaseAdapter {

        var context:Context? = null
        var listOfFood = ArrayList<Food>()

        constructor(context:Context, listOfFood: ArrayList<Food>):super(){
            this.context = context
            this.listOfFood = listOfFood

        }
        override fun getCount(): Int {
            return listOfFood.size
        }

        override fun getItem(p0: Int): Any {
            return listOfFood[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var food = listOfFood[p0]
            var inflator = LayoutInflater.from(context)
            var foodView = inflator.inflate(R.layout.food_view, null)

            var foodImage:ImageView = foodView.findViewById(R.id.imageFoodName)
            var foodName:TextView = foodView.findViewById(R.id.textFoodName)

            foodImage.setImageResource(food.food_img)
            foodName.text = food.food_name

            return foodView
        }
    }
}