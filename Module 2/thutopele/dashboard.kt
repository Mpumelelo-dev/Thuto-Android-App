package com.example.thutopele

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, ::class.java)
            startActivity(intent)
        }
    }