package com.example.cakesapimvvm.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cakesapimvvm.R
import kotlinx.android.synthetic.main.item_layout.view.*

class CustomViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    val itemTitle: TextView
    val itemDesc: TextView
    val itemImage: ImageView
    init {
        itemTitle =
            itemView.findViewById(R.id.tv_item_title)
        itemDesc =
            itemView.findViewById(R.id.tv_item_desc)
        itemImage =
            itemView.findViewById(R.id.iv_item_cake)
    }
}