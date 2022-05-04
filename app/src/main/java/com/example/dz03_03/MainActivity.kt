package com.example.dz03_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val arrayList:ArrayList<GridItem> = arrayListOf(
            GridItem(R.drawable.calcata, "Calcata"),
            GridItem(R.drawable.download, "Item 3"),
            GridItem(R.drawable.batman, "Batman"),
            GridItem(R.drawable.google, "Google")
        )

        val gridView = findViewById<GridView>(R.id.gridView)
        gridView.adapter = GridItemAdapter(applicationContext, arrayList)

    }


}