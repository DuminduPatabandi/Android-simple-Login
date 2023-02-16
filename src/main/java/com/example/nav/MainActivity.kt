package com.example.nav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun visitNextUI(view: View?) {

        val inputName: EditText = findViewById<View>(R.id.name) as EditText
        val inputEmail: EditText = findViewById<View>(R.id.email) as EditText

        val bundle = Bundle()
        bundle.putString("name", inputName.text.toString())
        bundle.putString("email", inputEmail.text.toString())

        val gotoNextScreen = Intent(applicationContext, interface2::class.java)
        gotoNextScreen.putExtras(bundle)
        Log.e("n :", inputName.text.toString() + "." + inputEmail.text)
        startActivity(gotoNextScreen)
    }
}