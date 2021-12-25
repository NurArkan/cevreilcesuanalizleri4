package com.su.cevreilcesuanalizleri.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.su.cevreilcesuanalizleri.R
import com.su.cevreilcesuanalizleri.adapter.WaterListAdapter
import com.su.cevreilcesuanalizleri.viewmodel.WaterListViewModel
import kotlinx.android.synthetic.main.activity_water_list.*
import kotlinx.android.synthetic.main.water_list_item_layout.*

class WaterListActivity : AppCompatActivity() {

    private var WaterListViewModel = WaterListViewModel()
    var waterAdapter = WaterListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_list)

        WaterListViewModel = ViewModelProvider(this) .get(WaterListViewModel::class.java)

        WaterListViewModel.getWaterList()

        WaterListViewModel.waterListLivedata.observe(this, { cevap->
            Toast.makeText(applicationContext, cevap[0].ilceAdi, Toast.LENGTH_LONG).show()
        })

        var waterList: ArrayList<String> = arrayListOf()
        waterList.add("2021 yılı değerleri")
        waterList.add("2020 yılı değerleri")
        waterList.add("2019 yılı değerleri")


        rv_waterlist.layoutManager = LinearLayoutManager(this,LinearLayoutManager. VERTICAL, false)
        rv_waterlist.adapter = waterAdapter

        waterAdapter.getData(waterList)


    }
}