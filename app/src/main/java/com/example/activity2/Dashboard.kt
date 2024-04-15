package com.example.activity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val secondActButton = findViewById<TextView>(R.id.profile)
        secondActButton.setOnClickListener{
            val intent = Intent(this , Profile::class.java)
            startActivity(intent)
        }
    }
}