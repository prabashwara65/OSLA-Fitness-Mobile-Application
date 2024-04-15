package com.example.activity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SIgnUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val secondActButton = findViewById<TextView>(R.id.login22)
        secondActButton.setOnClickListener{
            val intent = Intent(this , LogIn::class.java)
            startActivity(intent)
        }
    }
}