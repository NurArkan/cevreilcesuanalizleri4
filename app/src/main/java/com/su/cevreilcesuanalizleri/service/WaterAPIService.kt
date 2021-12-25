package com.su.cevreilcesuanalizleri.service

import com.su.cevreilcesuanalizleri.model.WaterListResponce
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class WaterAPIService {

    val baseUrl = "https://openapi.izmir.bel.tr/api/"

    var retrofitApi = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(WaterAPI::class.java)

    fun getWaterList() : Single<WaterListResponce> {
        return retrofitApi.getGameTypeList()
    }

}