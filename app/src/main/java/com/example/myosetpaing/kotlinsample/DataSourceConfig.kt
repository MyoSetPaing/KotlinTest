package com.example.myosetpaing.kotlinsample

import retrofit2.Retrofit

class DataSourceConfig(val apiKey: String,
                       val apiSecret: String){

    class Builder(var apiKey: String,
                  var apiSecret: String){
        fun build()=DataSourceConfig(apiKey,apiSecret)

    }
    fun getRetrofit(): Retrofit{
        return RestAdapter.getretrofit(this)
    }

}