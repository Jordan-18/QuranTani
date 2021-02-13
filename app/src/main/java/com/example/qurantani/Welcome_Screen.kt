package com.example.qurantani

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_welcome__screen.*

class Welcome_Screen : AppCompatActivity() {

    private lateinit var myAdapter: MyAdapter
    private lateinit var dotsTV: Array<TextView?>
    private lateinit var layouts: IntArray


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome__screen)

        if (!isFirsttimeappstart()){
            setAplikasistatus(false)
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        val actionBar:ActionBar? = supportActionBar
        actionBar!!.hide()

        statusbarTransparant()

        btn_next.setOnClickListener {
            val currentPage: Int = viewpager.currentItem + 1

            if (currentPage < layouts.size){
                viewpager.currentItem = currentPage
            }
            else{
                setAplikasistatus(false)
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }
        }

        btn_skip.setOnClickListener {
            setAplikasistatus(false)
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        layouts = intArrayOf(R.layout.slide1,R.layout.slide2,R.layout.slide3)
        myAdapter = MyAdapter(layouts,applicationContext)
        viewpager.adapter = myAdapter
        viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                if (position == layouts.size - 1){
                    btn_next.text = "Start"
                    btn_skip.visibility = View.GONE
                }
                else {
                    btn_next.text = "Next"
                    btn_skip.visibility = View.VISIBLE
                }
                setDots(position)
            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })
        setDots(0)

    }

    private fun isFirsttimeappstart():Boolean{
        val pref = applicationContext.getSharedPreferences("Slider App",Context.MODE_PRIVATE)
        return pref.getBoolean("APP_START",true)
    }

    private fun setAplikasistatus(status:Boolean){
        val pref = applicationContext.getSharedPreferences("Slider App",Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = pref.edit()
        editor.putBoolean("APP_START",status)
        editor.apply()
    }

    private fun statusbarTransparant() {
        if (Build.VERSION.SDK_INT >= 21){
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_FULLSCREEN
            val window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }
    }

    private fun setDots(page: Int){
        dotslayout.removeAllViews()
        dotsTV = arrayOfNulls(layouts.size)

        for (i in dotsTV.indices){
            dotsTV[i] = TextView(this)
            dotsTV[i]!!.text = Html.fromHtml("&#8226")
            dotsTV[i]!!.textSize = 30f
            dotsTV[i]!!.setTextColor(Color.parseColor("#a9b4bb"))
            dotslayout.addView(dotsTV[i])
        }
        if (dotsTV.isNotEmpty()){
            dotsTV[page]!!.setTextColor(Color.parseColor("#ffffff"))
        }
    }

}