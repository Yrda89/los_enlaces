package com.adrian.aplicacion1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.adrian.aplicacion1.BoardGamesApp.BoardGamesActivity
import com.adrian.aplicacion1.IMCApp.IMCcalculator
import com.adrian.aplicacion1.SuperheroApp.SuperheroListActivity
import com.adrian.aplicacion1.colores.coloresActivity
import com.adrian.aplicacion1.helloApp.MainActivity
import com.adrian.aplicacion1.msgApp.EnviarMensaje


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnHelloApp = findViewById<Button>(R.id.helloApp)
        btnHelloApp.setOnClickListener{ navigateToHelloApp() }

        var btnMsgApp = findViewById<Button>(R.id.msgApp)
        btnMsgApp.setOnClickListener{ navigateTOMsgApp() }

        var btnImcApp = findViewById<Button>(R.id.imcApp)
        btnImcApp.setOnClickListener { navigateToImcApp() }

        var btnBgApp = findViewById<Button>(R.id.BgApp)
        btnBgApp.setOnClickListener { navigateToBoardGamesApp() }

        var btnColorsApp = findViewById<Button>(R.id.ColorsApp)
        btnColorsApp.setOnClickListener { navigateToColorsApp() }

        var btnSuperheroApp = findViewById<Button>(R.id.SuperheroApp)
        btnSuperheroApp.setOnClickListener { navigateToSuperheroApp() }

    }



    private fun navigateToImcApp() {
        var intent = Intent(this, IMCcalculator::class.java)
        startActivity(intent)    }

    private fun navigateTOMsgApp() {
        var intent = Intent(this, EnviarMensaje::class.java)
        startActivity(intent)
    }

    private fun navigateToHelloApp(){
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToBoardGamesApp(){
        var intent = Intent(this, BoardGamesActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToColorsApp() {
        var intent = Intent(this, coloresActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperheroApp() {
        var intent = Intent(this, SuperheroListActivity::class.java)
        startActivity(intent)
    }
}