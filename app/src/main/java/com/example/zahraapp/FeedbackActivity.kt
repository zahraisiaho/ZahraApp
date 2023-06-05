package com.example.zahraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FeedbackActivity : AppCompatActivity() {
    lateinit var contact:Button
    lateinit var images:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        contact=findViewById(R.id.button4)
        images=findViewById(R.id.button6)

        contact.setOnClickListener {
            var contact= Intent(this,MainActivity2::class.java)
            startActivity(contact)}


        images.setOnClickListener {
            val imgintent= Intent(this,ImageActivity::class.java)
            startActivity(imgintent)
        }


    }
}