package com.example.aplikasiandroidwarehousedetection

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aplikasiandroidwarehousedetection.Adapter.infoAdapter
import com.example.aplikasiandroidwarehousedetection.Data.DummyDataLandingPage
import com.example.aplikasiandroidwarehousedetection.Model.Model
import com.example.aplikasiandroidwarehousedetection.databinding.LandingPageBinding

class LandingPageActivity: AppCompatActivity() {

    private lateinit var binding: LandingPageBinding
    private lateinit var adapter: infoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val modelK3 = returnK3()
        adapter = infoAdapter()
        adapter.mov(modelK3)

        binding.RVInfomasi.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        binding.RVInfomasi.setHasFixedSize(true)
        binding.RVInfomasi.adapter = adapter

        binding.BtnContinue.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun returnK3(): List<Model> = DummyDataLandingPage.getK3()
}