package com.example.customlistview

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val name = arrayListOf<String>( "cristiano Ronaldo", "Karim Benzema", "Vinicius", "", "Mbappe")
    val desc = arrayListOf<String>(
        "Greatest of all time",
        "Greatest of all time",
        "Greatest of all time",
        "Greatest of all time",
        "Greatest of all time",
    )
    val imageId = arrayListOf<Int>(
        R.drawable.cr7,
        R.drawable.karim,
        R.drawable.vini,
        R.drawable.mbappe,
    )

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val myListAdapter = item_layout(this, name,desc,imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "You clicked on" + name[position], Toast.
            LENGTH_SHORT).show()
        }

    }
}