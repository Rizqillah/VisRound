package com.example.aplikasiandroidwarehousedetection.Data

import com.example.aplikasiandroidwarehousedetection.Model.Model

object DummyDataLandingPage {
    fun getK3(): List<Model>{
        val k3 = ArrayList<Model>()

        k3.add(
            Model(
                "1. Melindungi dan menjamin keselamatan pekerja dan orang lain yang berada di tempat kerja"
            )
        )
        k3.add(
            Model(
                "2. Menjamin setiap sumber produksi perlu dipakai dan dipergunakan secara aman dan efisien"
            )
        )
        k3.add(
            Model(
                "3. Mencegah dan mengurangi kecelakaan kerja "
            )
        )
        k3.add(
            Model(
                "4. Mencegah dan mengendalikan timbulnya PAK, baik fisik maupun psikis, peracunan, infeksi, dan penularan"
            )
        )
        k3.add(
            Model(
                " 5. Menjamin keserasian antara pekerja, alat kerja, lingkungan, cara dan proses kerjanya"
            )
        )

        return k3
    }
}