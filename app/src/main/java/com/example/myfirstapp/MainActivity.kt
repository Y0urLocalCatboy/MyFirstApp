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

class MainActivity : AppCompatActivity() {
    private var buttonNext: Button? = null
    val text = "Hello world! It's from MainActivity."

    private fun openSecondaryActivity() {
        val intent = Intent(this, Secondary::class.java)
        intent.putExtra("key", text)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textViewHello)
        textView.text = text



        buttonNext = findViewById(R.id.buttonNextScene)

        buttonNext?.setOnClickListener {
            openSecondaryActivity()
        }
    }
}
