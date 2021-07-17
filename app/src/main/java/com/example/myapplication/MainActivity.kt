package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView : RecyclerView = findViewById(R.id.recycler)

        val item = Item("Anton")

        val items : ArrayList<Item> = ArrayList()
        items.add(item)
        items.add(Item("SERGEY"))
        val adapter = ItemAdapter (applicationContext, items)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        
    }
}