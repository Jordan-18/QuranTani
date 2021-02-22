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

        arrayList.add(Model(
                "Anggur",
                "Ayat Anggur",
                "Manfaat Anggur",
                "Hama Anggur",
                "Cara Penanaman Anggur",
                "Penanganan Hama Anggur",
                "Pencatatan Anggur",
                R.drawable.anggur))

        arrayList.add(Model(
                "Delima",
                "Ayat Delima",
                "Manfaat Delima",
                "Hama Delima",
                "Cara Penanaman Delima",
                "Penanganan Hama Delima",
                "Pencatatan Delima",
                R.drawable.delima))

        arrayList.add(Model(
                "Jahe",
                "Ayat Jahe",
                "Manfaat Jahe",
                "Hama Jahe",
                "Cara Penanaman Jahe",
                "Penanganan Hama jahe",
                "Pencatatan Jahe",
                R.drawable.jahe))

        arrayList.add(Model(
                "Kurma",
                "Ayat Kurma",
                "Manfaat Kurma",
                "Hama Kurma",
                "Cara Penanaman Kurma",
                "Penanganan Hama Kurma",
                "Pencatatan Kurma",
                R.drawable.kurma))

        arrayList.add(Model(
                "Tin",
                "Ayat Tin",
                "Manfaat Tin",
                "Hama Tin",
                "Cara Penanaman Tin",
                "Penanganan Hama Tin",
                "Pencatatan Tin",
                R.drawable.tin))

        arrayList.add(Model(
                "Bawang",
                "Ayat Bawang",
                "Manfaat Bawang",
                "Hama Bawang",
                "Cara Penanaman Bawang",
                "Penanganan Hama Bawang",
                "Pencatatan Bawang",
                R.drawable.bawang))


        val MyAdapter = MyAdapter2(arrayList,this)

        Recycleview.layoutManager = LinearLayoutManager(this)
        Recycleview.adapter = MyAdapter

    }
}
