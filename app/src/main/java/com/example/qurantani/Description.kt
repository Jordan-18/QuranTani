package com.example.qurantani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ExpandableListView
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_description.*

class Description : AppCompatActivity() {

    val versionList = ArrayList<Versions>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        initData()
        setRecyclerView()

        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)


//        Mengambil data dari mainactivity

        val intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aDesc = intent.getStringExtra("iDesc")
        val aImageView = intent.getIntExtra("iImageView", 0)

        actionBar.setTitle(aTitle)
        d_title.text = aTitle
        d_desc.text = aDesc
        img_row.setImageResource(aImageView)

//        end
    }

    private fun setRecyclerView(){
        val versionAdapter = VersionAdapter(versionList)
        desc_recycleView.adapter = versionAdapter
        desc_recycleView.setHasFixedSize(true)
    }

    private fun initData(){
        versionList.add(Versions(
                "Manfaat",
                "Ini adalah Menfaat dari Buah ini"
        ))
        versionList.add(Versions(
                "Penanaman",
                "Ini adalah penanaman dari Buah ini"
        ))
        versionList.add(Versions(
                "Hama",
                "Ini adalah Hama dari Buah ini"
        ))
        versionList.add(Versions(
                "Penanganan Hama",
                "Ini adalah cara penanagana Hama dari Buah ini"
        ))
        versionList.add(Versions(
                "Pencatatan Penanaman",
                "Ini adalah Pencatatan penanaman dari Buah ini"
        ))
    }
}