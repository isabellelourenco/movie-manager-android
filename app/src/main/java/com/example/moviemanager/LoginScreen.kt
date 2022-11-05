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

        //implementação do botão de voltar na toolbar
        val display = supportActionBar
        display?.title = "Login"
        if (display != null) {
            display.setDisplayHomeAsUpEnabled(true)
        }

        //implementação para o clique no botão login levar até a página home do aplicativo
        val supportToolActivity = supportActionBar
        supportToolActivity?.title = "Login"
        buttonLogin = findViewById(R.id.buttonLogin)
        buttonLogin.setOnClickListener {
            startActivity(Intent(this@LoginScreen,HomeScreen::class.java))
        }
    }

    //funcao implementada para funcionamento do botão de voltar da toolbar
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