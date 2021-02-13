package com.example.qurantani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_description.*

class Description : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val actionBar:ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        val intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aImageView = intent.getIntExtra("iImageView",0)

        actionBar.setTitle(aTitle)
        d_title.text = aTitle
        img_row.setImageResource(aImageView)
    }
}