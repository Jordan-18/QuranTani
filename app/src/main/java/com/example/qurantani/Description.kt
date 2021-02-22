package com.example.qurantani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ExpandableListView
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_description.*

class Description : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)


//        Mengambil data dari mainactivity

        val intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aDesc = intent.getStringExtra("iDesc")
        val aImageView = intent.getIntExtra("iImageView", 0)

        val aExmanfaat = intent.getStringExtra("iExmanfaat")
        val aExhama = intent.getStringExtra("iExhama")
        val aExpenanaman = intent.getStringExtra("iExpenanaman")
        val aExPH = intent.getStringExtra("iExPH")
        val aExPC = intent.getStringExtra("iExPC")

        actionBar.setTitle(aTitle)
        d_title.text = aTitle
        d_desc.text = aDesc
        img_row.setImageResource(aImageView)

        exmanfaat_desctxt.text = aExmanfaat
        exhama_desctxt.text = aExhama
        expenanaman_desctxt.text = aExpenanaman
        exPH_desctxt.text = aExPH
        exPC_desctxt.text = aExPC

//        end
    }
}