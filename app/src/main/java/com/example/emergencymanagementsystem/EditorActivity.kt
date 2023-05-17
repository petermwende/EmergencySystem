package com.example.emergencymanagementsystem

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class EditorActivity:AppCompatActivity(){
    lateinit var buttondial:Button
    lateinit var buttoncall:Button
    lateinit var buttonsms:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)

        buttoncall=findViewById(R.id.Btn_call)
        buttondial=findViewById(R.id.Btn_dial)
        buttonsms=findViewById(R.id.Btn_sms)

        buttonsms.setOnClickListener {
            val uri = Uri.parse("smsto:911")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("Hello", "I need help please")
            startActivity(intent)
        }
        buttoncall.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tell:911"))

            if (ContextCompat.checkSelfPermission(
                    this@EditorActivity,
                    android.Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
            ){
                ActivityCompat.requestPermissions(
                    this@EditorActivity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            }else{
                startActivity(intent)
            }
        }
        buttondial.setOnClickListener {
            val phone="911"
            val intent=Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",phone,null))
            startActivity(intent)
        }
    }
}