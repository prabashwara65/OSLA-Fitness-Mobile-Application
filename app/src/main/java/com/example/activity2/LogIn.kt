package com.example.activity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val FirstActButton = findViewById<TextView>(R.id.registerInLogin)
        FirstActButton.setOnClickListener{
            val intent = Intent(this , SIgnUp::class.java)
            startActivity(intent)
        }

        val secondActButton = findViewById<TextView>(R.id.logInINLogin)
        secondActButton.setOnClickListener{
            val intent = Intent(this , Dashboard::class.java)
            startActivity(intent)
        }



    }
}