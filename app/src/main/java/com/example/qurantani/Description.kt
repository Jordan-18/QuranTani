package com.example.qurantani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ExpandableListView
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_description.*

class Description : AppCompatActivity() {

    private lateinit var listViewAdapter: ExpandableListViewAdapter
    private lateinit var advantagelist: List<String>



    private lateinit var subadvantagelist: HashMap<String, List<String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val actionBar:ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        val intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aDesc = intent.getStringExtra("iDesc")
        val aImageView = intent.getIntExtra("iImageView",0)

        actionBar.setTitle(aTitle)
        d_title.text = aTitle
        d_desc.text = aDesc
        img_row.setImageResource(aImageView)

        showList()

//        advantage start
        listViewAdapter = ExpandableListViewAdapter(this,advantagelist,subadvantagelist)
        eListView.setAdapter(listViewAdapter)
    }


    private fun showList() {
        advantagelist = ArrayList()
        subadvantagelist = HashMap()

        (advantagelist as ArrayList<String>).add("Manfaat")
        (advantagelist as ArrayList<String>).add("Penanaman")
        (advantagelist as ArrayList<String>).add("Hama")
        (advantagelist as ArrayList<String>).add("Pengendalian Hama")
        (advantagelist as ArrayList<String>).add("Pencacatan Penanaman")



        val subadvantage1 : MutableList<String> = ArrayList()
        subadvantage1.add("O Manfaat 01")
        subadvantage1.add("O Manfaat 02")
        subadvantage1.add("O Manfaat 03")

        val subadvantage2 : MutableList<String> = ArrayList()
        subadvantage2.add("O Penanaman 01")
        subadvantage2.add("O Penanaman 02")
        subadvantage2.add("O Penanaman 03")

        val subadvantage3 : MutableList<String> = ArrayList()
        subadvantage3.add("O Hama 01")
        subadvantage3.add("O Hama 02")
        subadvantage3.add("O Hama 03")

        val subadvantage4 : MutableList<String> = ArrayList()
        subadvantage4.add("O Pengendalian Hama 01")
        subadvantage4.add("O Pengendalian Hama 02")
        subadvantage4.add("O Pengendalian Hama 03")

        val subadvantage5 : MutableList<String> = ArrayList()
        subadvantage5.add("O Pencacatan Tanaman 01")
        subadvantage5.add("O Pencatatan Tanaman 02")
        subadvantage5.add("O Pencatatan Tanaman 03")


        subadvantagelist[advantagelist[0]] = subadvantage1
        subadvantagelist[advantagelist[1]] = subadvantage2
        subadvantagelist[advantagelist[2]] = subadvantage3
        subadvantagelist[advantagelist[3]] = subadvantage4
        subadvantagelist[advantagelist[4]] = subadvantage5

    }
}