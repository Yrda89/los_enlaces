package com.adrian.aplicacion1.IMCApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.adrian.aplicacion1.R
import com.adrian.aplicacion1.msgApp.EnviarMensaje

class ResultActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnRecalculate: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var result : Double = intent.extras?.getDouble("extra_IMC")?: -1.0

        initComponent()
        initListeners()
        initUI(result)
    }

    private fun initUI(result : Double) {
        tvIMC.text = result.toString()
        when (result) {
            in 0.00..18.50 -> { //Bajo peso
                tvResult.text = getString(R.string.title_bajo_peso)
                tvResult.setTextColor(getColor(R.color.peso_bajo))
                tvDescription.text = getString(R.string.description_bajo_peso)
            }

            in 18.51..24.99 -> { //Peso normal
                tvResult.text = getString(R.string.title_peso_normal)
                tvResult.setTextColor(getColor(R.color.peso_normal))
                tvDescription.text = getString(R.string.description_peso_normal)
            }

            in 25.00..29.99 -> { //Sobrepeso
                tvResult.text = getString(R.string.title_sobrepeso)
                tvResult.setTextColor(getColor(R.color.sobrepeso))
                tvDescription.text = getString(R.string.description_sobrepeso)
            }

            in 30.00..99.00 -> { //Obesidad
                tvResult.text = getString(R.string.title_obesidad)
                tvResult.setTextColor(getColor(R.color.obesidad))
                tvDescription.text = getString(R.string.description_obesidad)
            }

            else -> { //Error
                tvIMC.text = getString(R.string.error)
                tvResult.text = getString(R.string.error)
                tvResult.setTextColor(getColor(R.color.obesidad))
                tvDescription.text = getString(R.string.error)
            }

        }
    }

    private fun initComponent(){

        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)

    }

    private fun initListeners(){

        btnRecalculate.setOnClickListener {onBackPressed()}


    }

}