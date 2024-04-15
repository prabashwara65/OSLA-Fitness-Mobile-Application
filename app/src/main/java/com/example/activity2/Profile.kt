package com.example.activity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val secondActButton = findViewById<ImageView>(R.id.backToHome)
        secondActButton.setOnClickListener{
            val intent = Intent(this , Dashboard::class.java)
            startActivity(intent)
        }
    }
}