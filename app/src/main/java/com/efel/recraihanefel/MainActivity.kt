package com.efel.recraihanefel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//rec mainActivity
class MainActivity : AppCompatActivity() {
    lateinit var recFood:RecyclerView
    lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recFood=findViewById(R.id.recFood)
        initFoodData()
        addFoodData()
    }

    private fun addFoodData() {
        val data = Data.createDataFood()
        foodAdapter.submitList(data)
    }

    private fun initFoodData() {
        recFood.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            val topSpace = SpacingDecoration(30)
            addItemDecoration(topSpace)
            foodAdapter=FoodAdapter()
            adapter=foodAdapter
        }
    }
}