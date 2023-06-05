package com.example.zahraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ImageActivity : AppCompatActivity() {
    lateinit var myapp:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        myapp=findViewById(R.id.myapp)

        myapp.setOnClickListener {
            var myapp= Intent(this,backgroundimage::class.java)
            startActivity(myapp)}
    }
}