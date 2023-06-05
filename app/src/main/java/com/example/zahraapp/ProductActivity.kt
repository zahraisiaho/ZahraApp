package com.example.zahraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProductActivity : AppCompatActivity() {
    lateinit var image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        image=findViewById(R.id.image1)

        image.setOnClickListener {
            val myintent=Intent(this,paymentdetails::class.java)
            startActivity(myintent)
        }

    }
}