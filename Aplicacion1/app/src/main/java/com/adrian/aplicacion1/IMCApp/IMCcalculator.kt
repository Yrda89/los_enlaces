package com.adrian.aplicacion1.IMCApp

import android.content.Intent
import android.icu.text.DecimalFormat
import android.icu.text.DecimalFormatSymbols
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.adrian.aplicacion1.R
import com.adrian.aplicacion1.msgApp.EnviarMensaje
import com.google.android.material.slider.RangeSlider
import org.w3c.dom.Text
import java.lang.Math.pow

class IMCcalculator : AppCompatActivity() {

    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false
    private var currentWeight: Int = 70
    private var currentAge: Int = 30
    private var currentHeight = 120
    private var genero = "hombre"

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider
    private lateinit var tvPeso: TextView
    private lateinit var pesoMenos: CardView
    private lateinit var pesoMas: CardView
    private lateinit var tvEdad: TextView
    private lateinit var edadMenos: CardView
    private lateinit var edadMas: CardView
    private lateinit var vCalcular: CardView
    private lateinit var vCalcularKcal : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imccalculator)

        initComponents()
        initListeners()
        setWeight()
        setAge()

    }

    private fun initListeners() {
        viewMale.setOnClickListener {
            setComponentColorMale()
            genero = "hombre"}
        viewFemale.setOnClickListener {
            setComponentColorFemale()
            genero = "mujer"
        }

        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#")
            currentHeight = df.format(value).toInt()
            tvHeight.text = "$currentHeight cm"
        }

        pesoMenos.setOnClickListener {
            currentWeight -=1
            setWeight()
        }

        pesoMas.setOnClickListener {
            currentWeight +=1
            setWeight()
        }

        edadMenos.setOnClickListener {
            currentAge -=1
            setAge()
        }

        edadMas.setOnClickListener {
            currentAge +=1
            setAge()
        }

        vCalcularKcal.setOnClickListener {
            val kCal = calculateKcal()
            navigateToResultKcal(kCal)
        }

        vCalcular.setOnClickListener {
            val result = calculateIMC()
            navigateToResult(result)
        }
    }

    private fun navigateToResultKcal(kCal: Double) {
        var intent = Intent(this, KcalActivity::class.java)
        intent.putExtra("extra_Kcal", kCal)
        startActivity(intent)
    }

    private fun navigateToResult(result: Double) {
        var intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("extra_IMC", result)
        startActivity(intent)
    }
    private fun calculateKcal():Double{

        val dfs = DecimalFormatSymbols()
        dfs.decimalSeparator = '.'
        val df2 = DecimalFormat("#.##")
        df2.decimalFormatSymbols = dfs

        val kcalBase: Double = if (genero == "hombre") {
            88.362 + (13.397 * currentWeight) + (4.799 * currentHeight) - (5.677 * currentAge
                    )
        } else {
            447.593 + (9.247 * currentWeight) + (3.098 * currentHeight) - (4.330 * currentAge)
        }



        return df2.format(kcalBase).toDouble()
    }

    private fun calculateIMC(): Double {
        val dfs = DecimalFormatSymbols()
        dfs.decimalSeparator = '.'
        val df = DecimalFormat("#.##")
        df.decimalFormatSymbols = dfs
        val imc = currentWeight / pow(currentHeight.toDouble() /100, 2.0)

        return df.format(imc).toDouble()
    }

    private fun setAge() {
        tvEdad.text = currentAge.toString()
    }

    private fun setWeight() {
        tvPeso.text = currentWeight.toString()
    }

    private fun setComponentColorFemale() {
        if (!isFemaleSelected){
            viewMale.setCardBackgroundColor(getColor(R.color.background_component))
            viewFemale.setCardBackgroundColor(getColor(R.color.background_component_selected))
            isFemaleSelected = true
            isMaleSelected = false
        }
    }

    private fun setComponentColorMale() {
        if (!isMaleSelected){
            viewMale.setCardBackgroundColor(getColor(R.color.background_component_selected))
            viewFemale.setCardBackgroundColor(getColor(R.color.background_component))
            isMaleSelected = true
            isFemaleSelected = false
        }
    }

    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        tvPeso = findViewById(R.id.tvPeso)
        pesoMenos = findViewById(R.id.pesoMenos)
        pesoMas = findViewById(R.id.pesoMas)
        tvEdad = findViewById(R.id.tvEdad)
        edadMas = findViewById(R.id.edadMas)
        edadMenos = findViewById(R.id.edadMenos)
        vCalcular = findViewById(R.id.vCalcular)
        vCalcularKcal = findViewById(R.id.vCalcularKcal)
    }
}