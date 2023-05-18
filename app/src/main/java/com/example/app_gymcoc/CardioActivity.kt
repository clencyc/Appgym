package com.example.app_gymcoc

import android.annotation.SuppressLint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.MediaController
import android.widget.VideoView
import java.net.HttpCookie
import java.net.HttpCookie.parse

class CardioActivity : AppCompatActivity() {

    lateinit var videoView: VideoView
    val videoUrl = "https://www.youtube.com/watch?v=cZyHgKtK75A"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardio)
       // val videoView = findViewById<VideoView>(R.id.idVideoView)
       // val mediaController = MediaController(this)

        //mediaController.setAnchorView(videoView)
       // videoView.setVideoPath("https://www.youtube.com/watch?v=cZyHgKtK75A")
        //videoView.start()
        //videoView.setMediaController(mediaController)
    }
}




