package com.example.zahraapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    //DECLARING VARIABLES
    lateinit var sms:Button
    lateinit var email:Button
    lateinit var share:Button
    lateinit var camera:Button
    lateinit var stk:Button
    lateinit var call:Button
    lateinit var products:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //finding view by id
        sms=findViewById(R.id.btnSms)
        email=findViewById(R.id.btnEmail)
        share=findViewById(R.id.btnShare)
        camera=findViewById(R.id.btnCamera)
        stk=findViewById(R.id.btnStk)
        call=findViewById(R.id.btnCall)
        products=findViewById(R.id.products)

        //intent
        //sms
        sms.setOnClickListener {
            val uri = Uri.parse("smsto:0712991347")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Hi Zahra...")
            startActivity(intent)
        }

        //email
        email.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","angela.khasandi@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear Madam...")
            startActivity(Intent.createChooser(emailIntent,"Send email..."))

        }

        //share
        share.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"https://github.com/zahraisiaho?tab=repositories")
            startActivity(shareIntent)
        }

        //camera
        camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent,1)
        }

        //stk
        stk.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }

        //call
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:"+"0712991347")
            startActivity(dialIntent)
        }
        //products
        products.setOnClickListener {
            val pintent= Intent(this,ProductActivity::class.java)
            startActivity(pintent)
        }

    }
}