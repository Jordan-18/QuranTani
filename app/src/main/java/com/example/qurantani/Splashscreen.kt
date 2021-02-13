package com.example.qurantani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class Splashscreen : AppCompatActivity() {

    val SPLASH_SCREEN = 5000

    private lateinit var topanimetion: Animation
    private lateinit var bottomanimetion: Animation

    private lateinit var imageView: ImageView
    private lateinit var progres: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // hide status bar
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splashscreen)

        val actionBar = supportActionBar
        actionBar!!.hide()

//        create anim to animated

        topanimetion = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomanimetion = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        imageView = findViewById(R.id.sp_img)
        progres = findViewById(R.id.progres_bar)

        imageView.animation = topanimetion

    Handler().postDelayed({
        val intent = Intent(this,Welcome_Screen::class.java)
        startActivity(intent)
        finish()
    },SPLASH_SCREEN.toLong())
    }
}