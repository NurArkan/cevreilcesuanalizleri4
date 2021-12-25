package com.su.cevreilcesuanalizleri.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.su.cevreilcesuanalizleri.model.WaterListResponce
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class WaterListViewModel : ViewModel() {

    private var WaterAPIService = com.su.cevreilcesuanalizleri.service.WaterAPIService()

    val waterListLivedata: MutableLiveData<WaterListResponce> = MutableLiveData<WaterListResponce>()

    @SuppressLint("CheckResult")
    fun getWaterList(){
    WaterAPIService.getWaterList()
        .subscribeOn(Schedulers.newThread())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(object : DisposableSingleObserver<WaterListResponce>() {
            override fun onSuccess(response: WaterListResponce) {
                waterListLivedata.value = response
        }

            override fun onError(e: Throwable) {
                e.printStackTrace()
        }
    })
    }


}