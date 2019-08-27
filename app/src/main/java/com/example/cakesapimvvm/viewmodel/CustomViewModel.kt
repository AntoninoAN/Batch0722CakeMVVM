package com.example.cakesapimvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cakesapimvvm.model.ApiInterface
import com.example.cakesapimvvm.model.CakeDataClass
import com.example.cakesapimvvm.model.Network
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CustomViewModel : ViewModel() {

    private lateinit var data
            : LiveData<ArrayList<CakeDataClass>>

    init {
        initRetrofit()
    }

    fun getData() : LiveData<ArrayList<CakeDataClass>> {
        return data
    }

    private fun initRetrofit(){
        data = Network.initRetrofit()
    }
}