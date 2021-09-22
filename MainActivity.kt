package com.example.app_03_conversortemperaturas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtCelsius = findViewById<EditText>(R.id.txtCelsius)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnConverter = findViewById<Button>(R.id.btnConverter)

        btnConverter.setOnClickListener {
            if (txtCelsius.text.isEmpty()){
                txtCelsius.error = "Digite a temperatura em Celsius"
                txtResultado.text = "" //limpa o campo
            } else {
                //entrada de dados
                val celsius = txtCelsius.text.toString().toDouble() //pega o valor de txt e joga na variavel criada
                val resultado: Double

                //processamento
                resultado = (celsius * 9/5) + 32

                //saida
                txtResultado.text = "$celsius graus Celsius equivalem a $resultado graus Fahrenheit"
                txtCelsius.text.clear() //limpa o campo
            }
        }
    }
}