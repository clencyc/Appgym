package com.example.app_gymcoc


import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase


class CreateAccountActivity : AppCompatActivity() {

    lateinit var Email_EDT: EditText
    lateinit var Password_EDT: EditText
    lateinit var Confirmpass_EDT: EditText
    lateinit var BTN_Signin: Button
    lateinit var Text_Signin: TextView

    lateinit var auth: FirebaseAuth


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)


        Email_EDT = findViewById(R.id.emailEdt)
        Password_EDT = findViewById(R.id.passEdT)
        BTN_Signin = findViewById(R.id.btn_signupbtn)
        Confirmpass_EDT = findViewById(R.id.confirmPassEdt)
        Text_Signin = findViewById(R.id.textView_signin)

        auth = FirebaseAuth.getInstance()


        BTN_Signin.setOnClickListener {
            var email = Email_EDT.text.toString().trim()
            var password = Password_EDT.text.toString().trim()
            var confirmpass = Confirmpass_EDT.text.toString().trim()

          //  var time_id = System.currentTimeMillis().toString().trim()
            //progress bar
          //  var progress = ProgressDialog(this)
          //  progress.setTitle("Saving Data")
          //  progress.setMessage("Please wait")


            //validation  of data
            if (email.isEmpty() || password.isEmpty() || confirmpass.isEmpty()) {

                Toast.makeText(this, "Cannot submit an empty field", Toast.LENGTH_SHORT).show()

            } else {
               // var my_child = FirebaseDatabase.getInstance().reference.child("Names/" + time_id)
               // var user_data = Users(email, password, confirmpass, time_id)
                //  show progress bar
              //  progress.show()

               // my_child.setValue(user_data).addOnCompleteListener {
                auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this){
                    if (it.isSuccessful) {

                        Toast.makeText(this, "Data Uploaded successfully", Toast.LENGTH_SHORT)
                            .show()

                        var gotomain = Intent(this, MainActivity::class.java)
                        startActivity(gotomain)
                    } else {
                        Toast.makeText(this, "Failed to upload data", Toast.LENGTH_SHORT).show()
                    }


                    Text_Signin.setOnClickListener {

                        val gotosignin = Intent(this@CreateAccountActivity, SignInActivity::class.java)
                        startActivity(gotosignin)

                    }


                }
            }
        }
    }
}



