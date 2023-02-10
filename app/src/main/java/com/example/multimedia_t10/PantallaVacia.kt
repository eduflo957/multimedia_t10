package com.example.multimedia_t10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimedia_t10.databinding.ActivityPantallaVaciaBinding

class PantallaVacia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_vacia)

        val binding = ActivityPantallaVaciaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = mochila1.listaObjetos.toString() + "\n" +
                "Peso actual mochila: ${mochila1.peso} \n" +
                "PESO MÁXIMO: ${mochila1.pesoMax}"
    }
}