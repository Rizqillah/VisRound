package com.example.aplikasiandroidwarehousedetection

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import androidx.annotation.RawRes
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val btnPrev = findViewById<Button>(R.id.Prev)
        val btnNext = findViewById<Button>(R.id.Next)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

//        val onlineUri: Uri = Uri.parse("https")

        btnNext.setOnClickListener {
            onButtonClick()
            changeVideoUri(videoView)
        }

        btnPrev.setOnClickListener {
            onButtonClick()
            changeVideoUri(videoView)
        }
    }

    private fun changeVideoUri(videoView: VideoView) {
        videoView.pause()

        val uri: Uri = Uri.parse("android.resource://$packageName/${accidentsVideoId[index]}")

        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }

    private fun onButtonClick() {
        index = if (index == 0) index + 1 else index - 1
    }


    companion object {
        @RawRes
        val accidentsVideoId = intArrayOf(
            R.raw.accident2,
            R.raw.accident3
        )
    }
}