package com.example.multimedia_t10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimedia_t10.databinding.ActivityPantallaVaciaBinding

class PantallaVacia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityPantallaVaciaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var imprimirTexto = intent.getStringExtra("textoSiguientePantalla")
        binding.textView.text = imprimirTexto


        binding.button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}