package com.hendev.sayacdeneme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = getSharedPreferences("EntryCounter",Context.MODE_PRIVATE)
        val editor=sp.edit()

        var sayac = sp.getInt("counter",0)            //Once Oku
        editor.putInt("counter",++sayac).apply()                    //Sonra Arttır

        txtAcilis.text = "Açılış Sayacı : $sayac"
    }
}