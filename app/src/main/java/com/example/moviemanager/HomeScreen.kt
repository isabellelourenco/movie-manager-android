package com.example.moviemanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class HomeScreen : AppCompatActivity() {

    private lateinit var buttonList: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        buttonList = findViewById(R.id.buttonList)
        buttonList.setOnClickListener {
            startActivity(Intent(this@HomeScreen,DetailScreen::class.java))
        }
    }
}