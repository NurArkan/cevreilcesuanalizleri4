package com.su.cevreilcesuanalizleri.service

import com.su.cevreilcesuanalizleri.model.WaterListResponce
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface WaterAPI {

    companion object{
        const val WATERS ="izsu/cevreilcesuanalizleri"
        //WATERS:GAME_TYPE
    }

    @GET(WATERS)
    fun getGameTypeList() : Single<WaterListResponce>


}