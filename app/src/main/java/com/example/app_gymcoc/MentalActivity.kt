package com.example.app_gymcoc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MentalActivity : AppCompatActivity() {


    lateinit var BTN_tonext:Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mental)

        BTN_tonext = findViewById(R.id.tonext)

        BTN_tonext.setOnClickListener {
            var gotonext = Intent(this, mentalWellnessActivity::class.java)
            startActivity(gotonext)

        }
        }


    }
