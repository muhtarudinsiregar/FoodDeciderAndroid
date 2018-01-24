package com.example.ardin.fooddecider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburgers", "Pizza", "Mc Donaldo", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //action when click decide button
        decideBtn.setOnClickListener {
            //generate random food list
            val random = Random()
            val randomFood = random.nextInt(foodList.count())

            selectedFoodTxt.text = foodList[randomFood]
        }

        //action when click add food button
        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()

            foodList.add(newFood)
            addFoodTxt.text.clear()

            println(foodList)
        }
    }
}
