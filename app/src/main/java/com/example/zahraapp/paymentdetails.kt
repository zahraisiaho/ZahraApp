package com.example.zahraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class paymentdetails : AppCompatActivity() {
    lateinit var pay:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paymentdetails)
        pay=findViewById(R.id.Pay)

        pay.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
    }
}