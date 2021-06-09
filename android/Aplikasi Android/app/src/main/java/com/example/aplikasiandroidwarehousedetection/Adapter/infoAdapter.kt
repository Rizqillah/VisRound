package com.example.aplikasiandroidwarehousedetection.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasiandroidwarehousedetection.Model.Model
import com.example.aplikasiandroidwarehousedetection.databinding.ItemListBinding


class infoAdapter : RecyclerView.Adapter<infoAdapter.ViewHolder>(){

    private var dataArr = ArrayList<Model>()

    fun mov(data: List<Model>) {
        this.dataArr.clear()
        this.dataArr.addAll(data)
    }

    inner class ViewHolder(private val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: Model){
            binding.RVInfomasi.text = model.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): infoAdapter.ViewHolder {
        val bindText = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(bindText)
    }

    override fun onBindViewHolder(holder: infoAdapter.ViewHolder, position: Int) {
        val infoText =  dataArr[position]
        holder.bind(infoText)
    }

    override fun getItemCount(): Int {
       return dataArr.size
    }


}