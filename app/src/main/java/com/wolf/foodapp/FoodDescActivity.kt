package com.wolf.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FoodDescActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_desc)

        var imageView:ImageView = findViewById(R.id.imageFoodName)
        var textName:TextView = findViewById(R.id.txtFoodName)
        var textDesc:TextView = findViewById(R.id.txtFoodDesc)

        var bundle: Bundle? = intent.extras
        imageView.setImageResource(bundle!!.getInt("image"))
        textName.text = bundle.getString("name")
        textDesc.text = bundle.getString("desc")
    }
}