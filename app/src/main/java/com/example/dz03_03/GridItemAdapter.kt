package com.example.dz03_03

import android.content.Context
import android.media.Image
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridItemAdapter(
    private val context: Context,
    private val arrayList: ArrayList<GridItem>):BaseAdapter() {
    override fun getCount(): Int {
    return arrayList.size
    }

    override fun getItem(p0: Int): Any {
        return arrayList[p0]
    }

    override fun getItemId(p0: Int): Long {
      return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
       var view = View.inflate(context, R.layout.grid_item_list, null)

        val icons:ImageView = view.findViewById(R.id.icons)
        val names:TextView = view.findViewById(R.id.name_text)
        val gridItem:GridItem = arrayList[p0]

        icons.setImageResource(gridItem.icon)
        names.text = gridItem.name

        return view
    }
}