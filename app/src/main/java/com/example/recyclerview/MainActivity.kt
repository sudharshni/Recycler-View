package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerview:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview = findViewById(R.id.recyclerview)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<itemlist>()


        for (i in 1..20) {
            data.add(itemlist(R.drawable.ic_launcher_foreground, "Item " + i))
        }
        val adapter = Adapterclass(data)

        adapter.setOnClickListener(object :
            Adapterclass.OnClickListener {
            override fun onClick11(position: Int, model: itemlist) {
                              Toast.makeText(this@MainActivity,"Clicked item: $model",Toast.LENGTH_LONG).show()
            }

            override fun onClick(v: View?) {
                TODO("Not yet implemented")
            }


        })
        recyclerview.adapter = adapter
    }

}