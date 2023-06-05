package com.example.zahraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//declaring variables
    lateinit var toastbutton: Button
    lateinit var toastbutton2: Button
    lateinit var myform: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //finding view by id
        toastbutton=findViewById(R.id.button1)
        toastbutton=findViewById(R.id.button2)
        myform=findViewById(R.id.button3)
            toastbutton.setOnClickListener {
                Toast.makeText(applicationContext, "Successful", Toast.LENGTH_LONG).show()
            }

                toastbutton2.setOnClickListener {
                    Toast.makeText(applicationContext,"Successful",Toast.LENGTH_LONG).show()
                }
        myform.setOnClickListener {
            Toast.makeText(applicationContext,"Fill in",Toast.LENGTH_LONG).show()
            var form= Intent(this,FormActivity::class.java)
            startActivity(form)
        }


                
    }
}