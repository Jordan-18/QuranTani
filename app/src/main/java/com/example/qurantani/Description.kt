package com.example.qurantani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ExpandableListView
import androidx.appcompat.app.ActionBar
import androidx.core.view.isVisible
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
        val aMakna = intent.getStringExtra("iMakna")
        val aImageView = intent.getIntExtra("iImageView", 0)

        val aExmanfaat = intent.getStringExtra("iExmanfaat")
        val aExhama = intent.getStringExtra("iExhama")
        val aExpenanaman = intent.getStringExtra("iExpenanaman")
        val aExPH = intent.getStringExtra("iExPH")
        val aExPC = intent.getStringExtra("iExPC")

        actionBar.setTitle(aTitle)
        d_title.text = aTitle
        d_desc.text = aDesc
        d_makna.text = aMakna
        img_row.setImageResource(aImageView)

        exmanfaat_desctxt.text = aExmanfaat
        exhama_desctxt.text = aExhama
        expenanaman_desctxt.text = aExpenanaman
        exPH_desctxt.text = aExPH
        exPC_desctxt.text = aExPC

//        end

//        berganti ayat dengan makna
        d_makna.visibility = View.GONE
        d_desc.setOnClickListener {
            if (d_makna.isVisible){
                d_makna.visibility =View.GONE
            }else {
                d_makna.visibility =View.VISIBLE
                d_desc.visibility = View.GONE
            }
        }
        d_makna.setOnClickListener {
            if (d_desc.isVisible){
                d_desc.visibility=View.GONE
            }else{
                d_desc.visibility =View.VISIBLE
                d_makna.visibility = View.GONE
            }
        }
//        end pergantian

//        hide and show ayat
        img_hide.visibility = View.GONE
        img_show.setOnClickListener {
                img_hide.visibility =View.VISIBLE
                d_desc.visibility = View.GONE
                img_show.visibility = View.GONE
        }
        img_hide.setOnClickListener {
                img_hide.visibility = View.GONE
                d_desc.visibility = View.VISIBLE
                img_show.visibility = View.VISIBLE
        }
//        selesai hide n show ayat

//        hide and show
        exmanfaat_layout.visibility = View.GONE
        linear_desc1.setOnClickListener {
            if (exmanfaat_layout.isVisible){
                exmanfaat_layout.visibility = View.GONE
            }else exmanfaat_layout.visibility = View.VISIBLE
        }


        exhama_layout.visibility = View.GONE
        linear_desc2.setOnClickListener {
            if (exhama_layout.isVisible){
                exhama_layout.visibility = View.GONE
            }else exhama_layout.visibility = View.VISIBLE
        }

        expenanaman_layout.visibility = View.GONE
        linear_desc3.setOnClickListener {
            if (expenanaman_layout.isVisible){
                expenanaman_layout.visibility = View.GONE
            }else expenanaman_layout.visibility = View.VISIBLE
        }

        exPH_layout.visibility = View.GONE
        linear_desc4.setOnClickListener {
            if (exPH_layout.isVisible){
                exPH_layout.visibility = View.GONE
            }else exPH_layout.visibility = View.VISIBLE
        }

        exPC_layout.visibility = View.GONE
        linear_desc5.setOnClickListener {
            if (exPC_layout.isVisible){
                exPC_layout.visibility = View.GONE
            }else exPC_layout.visibility = View.VISIBLE
        }

//        end hide and show
    }
}