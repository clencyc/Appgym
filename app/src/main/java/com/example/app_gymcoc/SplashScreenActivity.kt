package com.example.app_gymcoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.app_gymcoc.CreateAccountActivity

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var IV_Note:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        IV_Note = findViewById(R.id.iv_note)


        IV_Note.alpha = 0f
        IV_Note.animate().setDuration(1500).alpha(1f).withEndAction{
            val i = Intent(this, CreateAccountActivity::class.java)
            startActivity(i)


            finish()
        }
    }
}