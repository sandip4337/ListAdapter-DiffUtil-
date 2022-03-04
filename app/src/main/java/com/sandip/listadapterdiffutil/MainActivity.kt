package com.sandip.listadapterdiffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.programminglist)
        val adapter = ProgrammingAdapter()

        val p1 = programmingitem(1,bgcolor.getIcon(),"J","JAVA")
        val p2 = programmingitem(2,bgcolor.getIcon(),"K","KOTLIN")
        val p3 = programmingitem(3,bgcolor.getIcon(),"A","ANDROID")

        adapter.submitList(listOf(p1,p2,p3))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

        Handler(Looper.getMainLooper()).postDelayed({

            val p2 = programmingitem(2,bgcolor.getIcon(),"K","KOTLIN")
            val p3 = programmingitem(3,bgcolor.getIcon(),"P","PYTHON")
            val p4 = programmingitem(4,bgcolor.getIcon(),"C++","C++")
            val p5 = programmingitem(5,bgcolor.getIcon(),"C","C")
            val p6 = programmingitem(6,bgcolor.getIcon(),"JV","JAVASCRIPT")

            adapter.submitList(listOf(p2,p3,p4,p5,p6))
        },4000)
    }
}