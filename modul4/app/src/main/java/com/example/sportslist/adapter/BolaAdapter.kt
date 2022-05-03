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
import com.example.sportslist.model.Bola

class BolaAdapter (
    private val context: Context,
    private val arrayListBola: ArrayList<Bola>
):RecyclerView.Adapter<BolaAdapter.ItemViewHolder>() {
    class ItemViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val namaBolatextView: TextView = view.findViewById(R.id.item_title)
        val gambarBola: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val bolaAdapterlayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(bolaAdapterlayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = arrayListBola[position]
        holder.namaBolatextView.text = context.resources.getString(item.nama)
        holder.gambarBola.setImageResource(item.gambar)
        holder.view.setOnClickListener {
            Toast.makeText(context, context.getString(R.string.toast)+"${position+1}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return arrayListBola.size
    }
}