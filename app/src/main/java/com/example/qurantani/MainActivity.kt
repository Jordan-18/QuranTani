package com.example.qurantani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Mengubah Nama dari actionBar
        val actionBar = supportActionBar
        actionBar!!.title = "QuranTani"


        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Anggur","Ayat Anggur",R.drawable.anggur))
        arrayList.add(Model("Delima","Ayat Delima",R.drawable.delima))
        arrayList.add(Model("Jahe","Ayat Jahe",R.drawable.jahe))
        arrayList.add(Model("Kurma","Ayat Kurma",R.drawable.kurma))
        arrayList.add(Model("Tin","Ayat Tin",R.drawable.tin))
        arrayList.add(Model("Bawang","Ayat Bawang",R.drawable.bawang))


        val MyAdapter = MyAdapter2(arrayList,this)

        Recycleview.layoutManager = LinearLayoutManager(this)
        Recycleview.adapter = MyAdapter

    }
}
