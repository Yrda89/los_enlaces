package com.adrian.aplicacion1.colores

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.adrian.aplicacion1.R



class ColoresViewHolder(view: View) : RecyclerView.ViewHolder(view)  {

    private val cvVertical : CardView = view.findViewById(R.id.cvVertical)
    private val tvVertical : TextView = view.findViewById(R.id.tvVertical)

    fun render(colores: Colores){
        tvVertical.text = colores.label
        cvVertical.setCardBackgroundColor(colores.colorSelected)


    }

}