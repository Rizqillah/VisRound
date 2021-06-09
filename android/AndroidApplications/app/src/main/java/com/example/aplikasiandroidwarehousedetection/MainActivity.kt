package com.example.aplikasiandroidwarehousedetection

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import androidx.annotation.RawRes
import androidx.appcompat.app.AppCompatActivity
import com.example.aplikasiandroidwarehousedetection.Data.DummyData
import com.example.aplikasiandroidwarehousedetection.Model.MainContentModel
import com.example.aplikasiandroidwarehousedetection.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var indexPage = 0
    private lateinit var binding : ActivityMainBinding
    private val items = DummyData.content()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        content()


        binding.Next.setOnClickListener {
            next()
        }

        binding.Prev.setOnClickListener {
            prev()
        }

        binding.callAmbulance.setOnClickListener (this)
        binding.callFire.setOnClickListener(this)
    }

    private fun next(){
        indexPage++
        if(indexPage == items.size){

        }else{
            content()
        }
    }

    private fun prev(){
        indexPage--
        if(indexPage < 0){

        }else{
            content()
        }
    }

    private fun content(){
        val videoPath = "android.resource://" + packageName + "/" + items[indexPage].video
        val uri: Uri = Uri.parse(videoPath)

        binding.title.text = items[indexPage].title
        binding.videoView.setVideoURI(uri)

        val mediaController = MediaController(this)
        binding.videoView.setMediaController(mediaController)
        mediaController.setAnchorView(binding.videoView)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.callAmbulance -> {
                val phoneNumber = "911"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
            R.id.callFire ->{
                val phoneNumber = "113"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}
