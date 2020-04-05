package com.example.aula5

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao.setOnClickListener{
            val peso = peso.text.toString().toDouble()
            val altura = altura.text.toString().toDouble()
            var imc = peso / (altura * altura);
            var resultado = if(imc < 18.5){"Baixo Peso"} 
            else if (imc < 25){"Peso Adequado"}
            else if (imc < 30){"Sobrepeso"}
            else {"Obesidade"}
            Toast.makeText(this@MainActivity, resultado, Toast.LENGTH_LONG).show();
        }
    }
}
