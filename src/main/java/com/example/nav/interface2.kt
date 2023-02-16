package com.example.nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class interface2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface2)

        val txtName = findViewById<View>(R.id.txtName) as TextView
        val txtEmail = findViewById<View>(R.id.txtEmail) as TextView

        val i = intent

        val name = i.getStringExtra("name")
        val email = i.getStringExtra("email")
        Log.e("second Screen", "$name.$email")

        txtName.text = name
        txtEmail.text = email
    }


}