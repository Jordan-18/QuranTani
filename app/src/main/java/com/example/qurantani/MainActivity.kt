package com.example.qurantani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Mengubah Nama dari actionBar
        val actionBar = supportActionBar
        actionBar!!.title = "QuranTani"

//        ListView setting
        var listview = findViewById<ListView>(R.id.listview)

        var list =  mutableListOf<Model>()

//        add list img,title and desc
        list.add(Model("Anggur","Ayat Anggur",R.drawable.anggur))
        list.add(Model("Delima","Ayat Delima",R.drawable.delima))
        list.add(Model("Jahe","Ayat Jahe",R.drawable.jahe))
        list.add(Model("Kurma","Ayat Kurma",R.drawable.kurma))
        list.add(Model("Tin","Ayat Tin",R.drawable.tin))
        list.add(Model("Bawang","Ayat Bawang",R.drawable.bawang))

        list.add(Model("About Us","Penjelasan akan aplikasi ini ",R.drawable.ic_launcher_background))


        listview.adapter = MyAdapter2(this,R.layout.row,list)

//        set onclick setting
        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id ->
            if (position == 0){
                Toast.makeText(this@MainActivity,"kamu Ada di Anggur",Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(this@MainActivity,"kamu Ada di Delima",Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(this@MainActivity,"kamu Ada di Jahe",Toast.LENGTH_LONG).show()
            }
            if (position == 3){
                Toast.makeText(this@MainActivity,"kamu Ada di Kurma",Toast.LENGTH_LONG).show()
            }
            if (position == 4){
                Toast.makeText(this@MainActivity,"kamu Ada di Tin",Toast.LENGTH_LONG).show()
            }
            if (position == 5){
                Toast.makeText(this@MainActivity,"kamu Ada di Bawang",Toast.LENGTH_LONG).show()
            }
            if (position == 5){
                Toast.makeText(this@MainActivity,"kamu Ada di About Us",Toast.LENGTH_LONG).show()
            }

        }
    }
}