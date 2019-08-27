package com.example.cakesapimvvm.model

import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Network {

    companion object{
        fun initRetrofit() :
                MutableLiveData<ArrayList<CakeDataClass>>{
            val mutableLiveData =
                MutableLiveData<ArrayList<CakeDataClass>>()
            val retrofit = Retrofit.Builder()
                .baseUrl("https://gist.githubusercontent.com/hart88/198f29ec5114a3ec3460/raw/8dd19a88f9b8d24c23d9960f3300d0c917a4f07c/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create(ApiInterface::class.java)
                .getCakes()
                .enqueue(object : Callback<ArrayList<CakeDataClass>> {
                    override fun onFailure(call: Call<ArrayList<CakeDataClass>>, t: Throwable) {

                    }

                    override fun onResponse(
                        call: Call<ArrayList<CakeDataClass>>,
                        response: Response<ArrayList<CakeDataClass>>
                    ) {
                        mutableLiveData.value = response.body()
                    }

                })
            return mutableLiveData
        }
    }
}