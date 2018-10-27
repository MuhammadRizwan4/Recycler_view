package com.example.muhammadrizwan.recycler_view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.widget.GridLayout
import android.widget.ListAdapter


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array = ArrayList<String>()
        array.add("Kotlin")
        array.add("Java")
        array.add("Android Studio")
        var RecyclerView = findViewById<RecyclerView>(R.id.RV)
        var adapter = ListAdapter(this,array)
        RecyclerView.layoutManager = GridLayoutManager(this,1)
        RecyclerView.adapter = adapter

    }
}
