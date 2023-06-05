package com.example.zahraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormActivity : AppCompatActivity() {
    lateinit var nxt: Button
    lateinit var simt:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        nxt=findViewById(R.id.button)
        simt=findViewById(R.id.button5)

        nxt.setOnClickListener {
            var mynext=Intent(this,FeedbackActivity::class.java)
            startActivity(mynext)
        }
        simt.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
    }
}}