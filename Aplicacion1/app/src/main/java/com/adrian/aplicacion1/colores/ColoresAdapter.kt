package com.adrian.aplicacion1.colores

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adrian.aplicacion1.R

class ColoresAdapter(private val colores: List<Colores>):RecyclerView.Adapter<ColoresViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColoresViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical_colores, parent, false)
        return ColoresViewHolder(view)
    }

    override fun getItemCount() = colores.size

    override fun onBindViewHolder(holder: ColoresViewHolder, position: Int) {
        holder.render(colores[position])
    }

}