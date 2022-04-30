package com.example.sportslist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sportslist.R
import com.example.sportslist.model.Sports

class SportsAdapter (
    private val context: Context,
    private val arrayList: ArrayList<Sports>
    ):RecyclerView.Adapter<SportsAdapter.ItemViewHolder>() {
        class ItemViewHolder(val view: View): RecyclerView.ViewHolder(view){
            val namaOlahragatextView: TextView = view.findViewById(R.id.item_title)
            val gambarOlahraga: ImageView = view.findViewById(R.id.item_image)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val hewanairAdapterlayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item,parent,false)
            return ItemViewHolder(hewanairAdapterlayout)
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val item = arrayList[position]
            holder.namaOlahragatextView.text = context.resources.getString(item.nama)
            holder.gambarOlahraga.setImageResource(item.gambar)
            holder.view.setOnClickListener {
                Toast.makeText(context, "Anda Mengklik item no. ${position+1}", Toast.LENGTH_SHORT).show()
            }
        }

        override fun getItemCount(): Int {
            return arrayList.size
        }
}