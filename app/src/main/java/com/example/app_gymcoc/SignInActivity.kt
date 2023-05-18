package com.example.app_gymcoc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SignInActivity : AppCompatActivity() {

    lateinit var EmailEDT_signin: EditText
    lateinit var PassEDT_signin: EditText
    lateinit var BTN_SIGNIN: Button

    lateinit var auth: FirebaseAuth

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        EmailEDT_signin = findViewById(R.id.email_signin)
        PassEDT_signin = findViewById(R.id.pass_signin)
        BTN_SIGNIN = findViewById(R.id.btn_signin)

        auth = FirebaseAuth.getInstance()


        BTN_SIGNIN.setOnClickListener {
            val email1 = EmailEDT_signin.text.toString().trim()
            val pass1 = PassEDT_signin.text.toString().trim()

            if (email1.isEmpty() || pass1.isEmpty()) {
                Toast.makeText(this, "Cannot submit empty field", Toast.LENGTH_SHORT).show()

            } else {
                auth.signInWithEmailAndPassword(email1, pass1).addOnCompleteListener(this) {

                    if (it.isSuccessful) {
                        Toast.makeText(this, "Logged in Successfully", Toast.LENGTH_SHORT).show()

                        //
                        val gotomain = Intent(this@SignInActivity, MainActivity::class.java)
                        startActivity(gotomain)

                    }else{

                     //  Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
                    }
                }

            }
        }
    }
}