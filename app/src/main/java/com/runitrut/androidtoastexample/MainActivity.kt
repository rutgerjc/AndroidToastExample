package com.runitrut.androidtoastexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    // create the Button var as a latein, and it Extended the Button Import
    lateinit var Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set Button to the XML BTN
        Button = findViewById(R.id.BTN)
        //set Button.onClickListener to
        Button.setOnClickListener {
            Toast.makeText(this, "This is a toast message.", Toast.LENGTH_LONG).show()
        }

    }
}