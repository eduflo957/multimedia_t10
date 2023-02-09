package com.example.multimedia_t10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimedia_t10.databinding.ActivityMainBinding
import com.example.multimedia_t10.databinding.ActivityPantallaMercaderBinding

class PantallaMercader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_mercader)

        val binding = ActivityPantallaMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.setImageResource(R.drawable.img_mercader)

        binding.button.setOnClickListener {
            val intent = Intent(this, PantallaVacia::class.java)
            startActivity(intent)
        }
        binding.button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}