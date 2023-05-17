package com.example.emergencymanagementsystem

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    lateinit var Tv_respond:TextView
    lateinit var Edt_contact:EditText
    lateinit var Edt_calamity:EditText
    lateinit var Edt_service:EditText
    lateinit var Buttonsubmit:Button


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Tv_respond=findViewById(R.id.textView4)
        Edt_contact=findViewById(R.id.Edt_contact)
        Edt_calamity=findViewById(R.id.Edt_calamity)
        Edt_service=findViewById(R.id.Edt_service)
        Buttonsubmit=findViewById(R.id.Btn_submit)

        Buttonsubmit.setOnClickListener {
            var addcontact = Edt_contact.text.toString()
            var emergencycalamity = Edt_contact.text.toString()
            var requiredservice = Edt_service.text.toString()
            if (addcontact.isEmpty() && emergencycalamity.isEmpty() && requiredservice.isEmpty()){
                Tv_respond.text="Please provide all the required input"
            }else{
//                var response=addcontact
//                var response=emergencycalamity
//                var response=requiredservice
                Tv_respond.text="Showing response"

            }
        }

    }


}

