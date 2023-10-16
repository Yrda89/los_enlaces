package com.adrian.aplicacion1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.adrian.aplicacion1.IMCApp.IMCcalculator
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


}