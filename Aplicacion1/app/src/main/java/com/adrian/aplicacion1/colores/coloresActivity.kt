package com.adrian.aplicacion1.colores

import android.app.Dialog
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.annotation.ColorRes
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adrian.aplicacion1.R

    private lateinit var rvColores: RecyclerView
    private lateinit var coloresAdapter : ColoresAdapter
    private lateinit var btnCambioColor : CardView
    private lateinit var barraV1 : CardView
    private lateinit var barraV2 : CardView
    private lateinit var barraV3 : CardView


class coloresActivity : AppCompatActivity() {

    private val verticalColors = mutableListOf<Colores>(
        Colores(872349696,"V1 (20%)"),
        Colores(1509922816,"V2 (35%)"),
        Colores(-2130844669,"V3 (50%)"),
        Colores(-1509884150,"V4 (65%)"),
        Colores(-872175116,"V5 (80%)")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colores)
        initComponenents()
        initUI()
        initListeners()
    }

    private fun showDialog(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_colores)

        val btnAplicarColor = dialog.findViewById<Button>(R.id.btnAplicarColor)
        val rgBarra: RadioGroup = dialog.findViewById(R.id.rgBarra)
        val rgColores: RadioGroup = dialog.findViewById(R.id.rgColores)

        btnAplicarColor.setOnClickListener {
         val selectedBar = rgBarra.checkedRadioButtonId
         val selectedColor = rgColores.checkedRadioButtonId

            var blanco20 = ContextCompat.getColor(this, R.color.blanco_20)
            var rojo20 = ContextCompat.getColor(this, R.color.rojo_20)
            var naranja20 = ContextCompat.getColor(this, R.color.naranja_20)
            var amarillo20 = ContextCompat.getColor(this, R.color.amarillo_20)
            var verde20 = ContextCompat.getColor(this, R.color.verde_20)
            var cian20 = ContextCompat.getColor(this, R.color.cian_20)
            var azul20 = ContextCompat.getColor(this, R.color.azul_20)
            var violeta20 = ContextCompat.getColor(this, R.color.violeta_20)
            var negro20 = ContextCompat.getColor(this, R.color.negro_20)

            val colorStateList = ColorStateList.valueOf(blanco20)
            val colorStateList2 = ColorStateList.valueOf(rojo20)
            val colorStateList3 = ColorStateList.valueOf(naranja20)
            val colorStateList4 = ColorStateList.valueOf(amarillo20)
            val colorStateList5 = ColorStateList.valueOf(verde20)
            val colorStateList6 = ColorStateList.valueOf(cian20)
            val colorStateList7 = ColorStateList.valueOf(azul20)
            val colorStateList8 = ColorStateList.valueOf(violeta20)
            val colorStateList9 = ColorStateList.valueOf(negro20)

            var blanco50 = ContextCompat.getColor(this, R.color.blanco_50)
            var rojo50 = ContextCompat.getColor(this, R.color.rojo_50)
            var naranja50 = ContextCompat.getColor(this, R.color.naranja_50)
            var amarillo50 = ContextCompat.getColor(this, R.color.amarillo_50)
            var verde50 = ContextCompat.getColor(this, R.color.verde_50)
            var cian50 = ContextCompat.getColor(this, R.color.cian_50)
            var azul50 = ContextCompat.getColor(this, R.color.azul_50)
            var violeta50 = ContextCompat.getColor(this, R.color.violeta_50)
            var negro50 = ContextCompat.getColor(this, R.color.negro_50)

            val colorStateList51 = ColorStateList.valueOf(blanco50)
            val colorStateList52 = ColorStateList.valueOf(rojo50)
            val colorStateList53 = ColorStateList.valueOf(naranja50)
            val colorStateList54 = ColorStateList.valueOf(amarillo50)
            val colorStateList55 = ColorStateList.valueOf(verde50)
            val colorStateList56 = ColorStateList.valueOf(cian50)
            val colorStateList57 = ColorStateList.valueOf(azul50)
            val colorStateList58 = ColorStateList.valueOf(violeta50)
            val colorStateList59 = ColorStateList.valueOf(negro50)

            var blanco80 = ContextCompat.getColor(this, R.color.blanco_80)
            var rojo80 = ContextCompat.getColor(this, R.color.rojo_80)
            var naranja80 = ContextCompat.getColor(this, R.color.naranja_80)
            var amarillo80 = ContextCompat.getColor(this, R.color.amarillo_80)
            var verde80 = ContextCompat.getColor(this, R.color.verde_80)
            var cian80 = ContextCompat.getColor(this, R.color.cian_80)
            var azul80 = ContextCompat.getColor(this, R.color.azul_80)
            var violeta80 = ContextCompat.getColor(this, R.color.violeta_80)
            var negro80 = ContextCompat.getColor(this, R.color.negro_80)

            val colorStateList81 = ColorStateList.valueOf(blanco80)
            val colorStateList82 = ColorStateList.valueOf(rojo80)
            val colorStateList83 = ColorStateList.valueOf(naranja80)
            val colorStateList84 = ColorStateList.valueOf(amarillo80)
            val colorStateList85 = ColorStateList.valueOf(verde80)
            val colorStateList86 = ColorStateList.valueOf(cian80)
            val colorStateList87 = ColorStateList.valueOf(azul80)
            val colorStateList88 = ColorStateList.valueOf(violeta80)
            val colorStateList89 = ColorStateList.valueOf(negro80)

            when(selectedBar){
                R.id.rbH1 -> when(selectedColor){
                    R.id.rbBlanco -> barraV1.backgroundTintList = colorStateList
                    R.id.rbRojo -> barraV1.backgroundTintList = colorStateList2
                    R.id.rbNaranja -> barraV1.backgroundTintList = colorStateList3
                    R.id.rbAmarillo -> barraV1.backgroundTintList = colorStateList4
                    R.id.rbVerde -> barraV1.backgroundTintList = colorStateList5
                    R.id.rbCian -> barraV1.backgroundTintList = colorStateList6
                    R.id.rbAzul -> barraV1.backgroundTintList = colorStateList7
                    R.id.rbVioleta -> barraV1.backgroundTintList = colorStateList8
                    R.id.rbNegro -> barraV1.backgroundTintList = colorStateList9
                }
                R.id.rbH2 -> when(selectedColor){
                    R.id.rbBlanco -> barraV2.backgroundTintList = colorStateList51
                    R.id.rbRojo -> barraV2.backgroundTintList = colorStateList52
                    R.id.rbNaranja -> barraV2.backgroundTintList = colorStateList53
                    R.id.rbAmarillo -> barraV2.backgroundTintList = colorStateList54
                    R.id.rbVerde -> barraV2.backgroundTintList = colorStateList55
                    R.id.rbCian -> barraV2.backgroundTintList = colorStateList56
                    R.id.rbAzul -> barraV2.backgroundTintList = colorStateList57
                    R.id.rbVioleta -> barraV2.backgroundTintList = colorStateList58
                    R.id.rbNegro -> barraV2.backgroundTintList = colorStateList59
                }
                R.id.rbH3 -> when(selectedColor) {
                    R.id.rbBlanco -> barraV3.backgroundTintList = colorStateList81
                    R.id.rbRojo -> barraV3.backgroundTintList = colorStateList82
                    R.id.rbNaranja -> barraV3.backgroundTintList = colorStateList83
                    R.id.rbAmarillo -> barraV3.backgroundTintList = colorStateList84
                    R.id.rbVerde -> barraV3.backgroundTintList = colorStateList85
                    R.id.rbCian -> barraV3.backgroundTintList = colorStateList86
                    R.id.rbAzul -> barraV3.backgroundTintList = colorStateList87
                    R.id.rbVioleta -> barraV3.backgroundTintList = colorStateList88
                    R.id.rbNegro -> barraV3.backgroundTintList = colorStateList89
                }
                R.id.rbV1 -> when(selectedColor){
                    R.id.rbBlanco -> verticalColors[0] = verticalColors[0].copy(colorSelected = 872415231)
                    R.id.rbRojo -> verticalColors[0] = verticalColors[0].copy(colorSelected = 872349696)
                    R.id.rbNaranja -> verticalColors[0] = verticalColors[0].copy(colorSelected = 872388608)
                    R.id.rbAmarillo -> verticalColors[0] = verticalColors[0].copy(colorSelected = 872276995)
                    R.id.rbVerde -> verticalColors[0] = verticalColors[0].copy(colorSelected = 855703306)
                    R.id.rbCian -> verticalColors[0] = verticalColors[0].copy(colorSelected = 855878132)
                    R.id.rbAzul -> verticalColors[0] = verticalColors[0].copy(colorSelected = 855648255)
                    R.id.rbVioleta -> verticalColors[0] = verticalColors[0].copy(colorSelected = 869925119)
                    R.id.rbNegro -> verticalColors[0] = verticalColors[0].copy(colorSelected = 856756497)
                }
                R.id.rbV2 -> when(selectedColor){
                    R.id.rbBlanco -> verticalColors[1] = verticalColors[1].copy(colorSelected = 1509949439)
                    R.id.rbRojo -> verticalColors[1] = verticalColors[1].copy(colorSelected = 1509883904)
                    R.id.rbNaranja -> verticalColors[1] = verticalColors[1].copy(colorSelected = 1509922816)
                    R.id.rbAmarillo -> verticalColors[1] = verticalColors[1].copy(colorSelected = 1509811203)
                    R.id.rbVerde -> verticalColors[1] = verticalColors[1].copy(colorSelected = 1493237514)
                    R.id.rbCian -> verticalColors[1] = verticalColors[1].copy(colorSelected = 1493412340)
                    R.id.rbAzul -> verticalColors[1] = verticalColors[1].copy(colorSelected = 1493412340)
                    R.id.rbVioleta -> verticalColors[1] = verticalColors[1].copy(colorSelected = 1507459327)
                    R.id.rbNegro -> verticalColors[1] = verticalColors[1].copy(colorSelected = 1494290705)
                }
                R.id.rbV3 -> when(selectedColor){
                    R.id.rbBlanco -> verticalColors[2] = verticalColors[2].copy(colorSelected = -2130706433)
                    R.id.rbRojo -> verticalColors[2] = verticalColors[2].copy(colorSelected = -2130771968)
                    R.id.rbNaranja -> verticalColors[2] = verticalColors[2].copy(colorSelected = -2130733056)
                    R.id.rbAmarillo -> verticalColors[2] = verticalColors[2].copy(colorSelected = -2130844669)
                    R.id.rbVerde -> verticalColors[2] = verticalColors[2].copy(colorSelected = -2147418358)
                    R.id.rbCian -> verticalColors[2] = verticalColors[2].copy(colorSelected = -2147243532)
                    R.id.rbAzul -> verticalColors[2] = verticalColors[2].copy(colorSelected = -2147473409)
                    R.id.rbVioleta -> verticalColors[2] = verticalColors[2].copy(colorSelected = -2133196545)
                    R.id.rbNegro -> verticalColors[2] = verticalColors[2].copy(colorSelected = -2146365167)
                }
                R.id.rbV4 -> when(selectedColor){
                    R.id.rbBlanco -> verticalColors[3] = verticalColors[3].copy(colorSelected = -1493172225)
                    R.id.rbRojo -> verticalColors[3] = verticalColors[3].copy(colorSelected = -1493237760)
                    R.id.rbNaranja -> verticalColors[3] = verticalColors[3].copy(colorSelected = -1493198848)
                    R.id.rbAmarillo -> verticalColors[3] = verticalColors[3].copy(colorSelected = -1493310461)
                    R.id.rbVerde -> verticalColors[3] = verticalColors[3].copy(colorSelected = -1509884150)
                    R.id.rbCian -> verticalColors[3] = verticalColors[3].copy(colorSelected = -1509709324)
                    R.id.rbAzul -> verticalColors[3] = verticalColors[3].copy(colorSelected = -1509939201)
                    R.id.rbVioleta -> verticalColors[3] = verticalColors[3].copy(colorSelected = -1495662337)
                    R.id.rbNegro -> verticalColors[3] = verticalColors[3].copy(colorSelected = -1508830959)
                }
                R.id.rbV5 -> when(selectedColor){
                    R.id.rbBlanco -> verticalColors[4] = verticalColors[4].copy(colorSelected = -855638017)
                    R.id.rbRojo -> verticalColors[4] = verticalColors[4].copy(colorSelected = -855703552)
                    R.id.rbNaranja -> verticalColors[4] = verticalColors[4].copy(colorSelected = -855664640)
                    R.id.rbAmarillo -> verticalColors[4] = verticalColors[4].copy(colorSelected = -855776253)
                    R.id.rbVerde -> verticalColors[4] = verticalColors[4].copy(colorSelected = -872349942)
                    R.id.rbCian -> verticalColors[4] = verticalColors[4].copy(colorSelected = -872175116)
                    R.id.rbAzul -> verticalColors[4] = verticalColors[4].copy(colorSelected = -872404993)
                    R.id.rbVioleta -> verticalColors[4] = verticalColors[4].copy(colorSelected = -858128129)
                    R.id.rbNegro -> verticalColors[4] = verticalColors[4].copy(colorSelected = -871296751)
                }
            }

            updateColores()
            dialog.hide()

         }

        dialog.show()
    }




    private fun initComponenents(){
        rvColores = findViewById(R.id.rvColores)
        btnCambioColor = findViewById(R.id.btnCambioColor)
        barraV1 = findViewById(R.id.cvFirst)
        barraV2 = findViewById(R.id.cvSecond)
        barraV3 = findViewById(R.id.cvThird)
    }

    private fun initUI(){
        coloresAdapter = ColoresAdapter(verticalColors)
        rvColores.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvColores.adapter = coloresAdapter
    }

    private fun initListeners() {
        btnCambioColor.setOnClickListener { showDialog() }

    }

    private fun updateColores(){
        coloresAdapter.notifyDataSetChanged()
    }

}