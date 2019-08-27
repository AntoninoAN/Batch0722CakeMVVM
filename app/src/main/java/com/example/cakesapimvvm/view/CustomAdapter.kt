package com.example.cakesapimvvm.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cakesapimvvm.R
import com.example.cakesapimvvm.model.CakeDataClass
import com.squareup.picasso.Picasso

class CustomAdapter(val dataSet : ArrayList<CakeDataClass>): RecyclerView.Adapter<CustomViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater
            .from(parent.context).inflate(R.layout.item_layout,
                parent,
                false))
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.itemTitle.text = dataSet[position].title
        holder.itemDesc.text = dataSet[position].desc
        Picasso.get().load(dataSet[position].image)
            .into(holder.itemImage)
    }
}