package com.example.kiranapasaadmin.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kiranapasaadmin.databinding.FragmentProductBinding
import com.example.kiranapasaadmin.databinding.ImageItemBinding

class AddProductImageAdapter(var list: ArrayList<Uri>):RecyclerView.Adapter<AddProductImageAdapter.AddProductImageViewHolder>(){
    inner class AddProductImageViewHolder(val binding: ImageItemBinding):
            RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddProductImageViewHolder {
        var binding = ImageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AddProductImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AddProductImageViewHolder, position: Int) {
        holder.binding.itemImg.setImageURI(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}