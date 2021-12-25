package com.su.cevreilcesuanalizleri

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.su.cevreilcesuanalizleri.view.WaterListActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstamceState: Bundle?) {
                super.onCreate(savedInstamceState)
                setContentView(R.layout.activity_main)

                button.setOnClickListener {
                    val intent = Intent(this,WaterListActivity::class.java)
                    startActivity(intent)
                }



                }
}