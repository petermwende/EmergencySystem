package com.example.emergencymanagementsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttonhome:Button
    lateinit var buttoneditor:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonhome=findViewById(R.id.Btn_Home)
        buttoneditor=findViewById(R.id.Btn_Editor)

        buttonhome.setOnClickListener {
            val home = Intent(this,HomeActivity ::class.java)
            startActivity(home)
        }
        buttoneditor.setOnClickListener {
            val editor = Intent(this,EditorActivity ::class.java)
            startActivity(editor)
        }
    }
}