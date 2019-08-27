package com.example.cakesapimvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cakesapimvvm.R
import com.example.cakesapimvvm.viewmodel.CustomViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager =
            LinearLayoutManager(this)

        val viewModel = ViewModelProvider(this)
            .get(CustomViewModel::class.java)

        viewModel.getData().observe(this,
            Observer {
                val adapter = CustomAdapter(it)
                recyclerView.adapter = adapter
            })
    }
}
