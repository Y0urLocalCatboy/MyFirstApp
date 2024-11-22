package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Secondary : AppCompatActivity() {
    private var buttonBack: Button? = null

    private fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        val message = intent.getStringExtra("key") // Retrieve the data using the same key
        val textView = findViewById<TextView>(R.id.textViewSecond)
        textView.text = message ?: "No message received"

        buttonBack = findViewById(R.id.buttonToFirst)

        buttonBack?.setOnClickListener { openMainActivity() }
    }
    }
