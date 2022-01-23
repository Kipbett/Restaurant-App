package com.wolf.foodapp

class Food {
    var food_name:String? = null
    var food_desc:String? = null
    var food_img:Int? = null

    constructor(food_name:String, food_desc:String, food_img:Int){
        this.food_name = food_name
        this.food_desc = food_desc
        this.food_img = food_img
    }

}