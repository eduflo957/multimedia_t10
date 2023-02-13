package com.example.multimedia_t10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimedia_t10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pantallaEncontrada = listOf(PantallaObjeto::class.java,
            PantallaMercader::class.java, PantallaEnemigo::class.java,
            PantallaCiudad::class.java)
        val pantallaEncontradaRandom = pantallaEncontrada.random()

        binding.fotoCampito.setImageResource(R.drawable.img_campito)
        binding.botonDado.setImageResource(R.drawable.img_logo_dado)

        binding.botonDado.setOnClickListener {
            //Debería utilizar la variable pantallaEncontradaRandom pero para esta práctica
            //Utilizo la PantallaObjeto
            val intentPantallaEncontradaRandom = Intent(this, PantallaMercader::class.java)
            startActivity(intentPantallaEncontradaRandom)
        }

    }

}