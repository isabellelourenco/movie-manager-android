package com.example.moviemanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button

class LoginScreen : AppCompatActivity() {

    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        val supportToolActivity = supportActionBar
        supportToolActivity?.title = "Login"
        buttonLogin = findViewById(R.id.buttonLogin)
        buttonLogin.setOnClickListener {
            startActivity(Intent(this@LoginScreen,HomeScreen::class.java))
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}