package com.example.moviemanager


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstScreen : AppCompatActivity() {

    private lateinit var buttonLogin: Button
    private lateinit var buttonSign: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        buttonLogin = findViewById(R.id.buttonLogin)
        buttonLogin.setOnClickListener {
            startActivity(Intent(this@FirstScreen,LoginScreen::class.java))
        }

        buttonSign = findViewById(R.id.buttonSign)
        buttonSign.setOnClickListener {
            startActivity(Intent(this@FirstScreen,CadScreen::class.java))
        }

    }

}