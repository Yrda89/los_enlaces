package com.adrian.aplicacion1.IMCApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.adrian.aplicacion1.R

class KcalActivity : AppCompatActivity() {

    private lateinit var btnRecalculate2: CardView
    private lateinit var tvKcal : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcal)

        var Kcal : Double = intent.extras?.getDouble("extra_Kcal")?: -1.00

        initComponent()
        initListeners()

        tvKcal.text= Kcal.toString()
    }

    private fun initComponent() {
        btnRecalculate2 = findViewById(R.id.btnRecalculate2)
        tvKcal = findViewById(R.id.tvKcal)
    }

    private fun initListeners(){

        btnRecalculate2.setOnClickListener {onBackPressed()}


    }


}