package com.example.aplikasiandroidwarehousedetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.aplikasiandroidwarehousedetection.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val iv: ImageView = findViewById(R.id.SplashScreen)

        iv.animate().setDuration(1500).alpha(1f).withEndAction() {
            val mainIntent = Intent(this, LandingPageActivity::class.java)
            startActivity(mainIntent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}