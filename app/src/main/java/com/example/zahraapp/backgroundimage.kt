package com.example.zahraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class backgroundimage : AppCompatActivity() {
    lateinit var circular:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backgroundimage)
        circular=findViewById(R.id.circular)

        circular.setOnClickListener {
            var circle= Intent(this,CitcularImageActivity::class.java)
            startActivity(circle)}
    }
}