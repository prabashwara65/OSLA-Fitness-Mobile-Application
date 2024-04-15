package com.example.activity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetStarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        val secondActButton = findViewById<Button>(R.id.getstarted)
        secondActButton.setOnClickListener{
            val intent = Intent(this , LogIn::class.java)
            startActivity(intent)
        }

    }
}