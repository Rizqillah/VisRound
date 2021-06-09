package com.example.aplikasiandroidwarehousedetection.Data

import com.example.aplikasiandroidwarehousedetection.Model.MainContentModel
import com.example.aplikasiandroidwarehousedetection.R

object DummyData {
    fun content(): List<MainContentModel>{
        val item = ArrayList<MainContentModel>()

        item.add(
            MainContentModel(
                "CCTV 1",
                R.raw.accident2
            )
        )

        item.add(
            MainContentModel(
                "CCTV 2",
                R.raw.accident3
            )
        )

        return item
    }
}