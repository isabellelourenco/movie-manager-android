package com.example.moviemanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.core.content.ContextCompat

class CadScreen : AppCompatActivity() {

    private lateinit var buttonCad: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_screen)

        val display = supportActionBar
        display?.title = "Cadastro"
        if (display != null) {
            display.setDisplayHomeAsUpEnabled(true)
        }

        buttonCad = findViewById(R.id.buttonLogin)
        buttonCad.setOnClickListener {
            startActivity(Intent(this@CadScreen,HomeScreen::class.java))
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