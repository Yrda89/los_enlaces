package com.adrian.aplicacion1.msgApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.adrian.aplicacion1.R

class EnviarMensaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enviar_mensaje)

        var btnSend = findViewById<Button>(R.id.btnSend)
        var userText = findViewById<EditText>(R.id.etName)

        btnSend.setOnClickListener {
            var name = userText.text.toString()
            if (name.isNotEmpty()) {
                var textIntent = Intent(this, SecondActivity::class.java)
                textIntent.putExtra("extra_name", name)
                startActivity(textIntent)

            }
        }

        var textoHola = findViewById<TextView>(R.id.chat1text)
        var textrecib = findViewById<TextView>(R.id.msgtext)

        var nombre: String = intent.extras?.getString("extra_name").orEmpty()
        textoHola.text = "$nombre"


        if(nombre.isNotEmpty()){
            textoHola.text = nombre
            textrecib.text = "Mensaje recibido"
        }
    }

}