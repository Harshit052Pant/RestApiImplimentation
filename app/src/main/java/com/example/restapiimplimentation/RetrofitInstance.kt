package com.example.restapiimplimentation

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    private lateinit var retrofit:Retrofit
    private var BASEURL:String= ""

    public fun getRetrofit():Retrofit{

        if(retrofit == null){
            retrofit = Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build()
        }
        return retrofit
    }


}