package com.su.cevreilcesuanalizleri.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.su.cevreilcesuanalizleri.R
import kotlinx.android.synthetic.main.water_list_item_layout.view.*

class WaterListAdapter: RecyclerView.Adapter<WaterListAdapter.WaterListHolder>() {

    var waterList: ArrayList<String> = arrayListOf()

    //tasarım verilecek kısım
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WaterListAdapter.WaterListHolder =
        WaterListHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.water_list_item_layout, parent, false)
        )

    override fun onBindViewHolder(holder: WaterListAdapter.WaterListHolder, position: Int) {
        //detayın verılecegı kısım
        holder.bind(waterList[position])
    }

    override fun getItemCount(): Int = waterList.size

    inner class WaterListHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(isim: String) {
            itemView.rv_waterlistt.text = isim
        }
    }

    fun getData(waterResponse: ArrayList<String>){
        waterList.addAll(waterResponse)
        notifyDataSetChanged()
    }
}