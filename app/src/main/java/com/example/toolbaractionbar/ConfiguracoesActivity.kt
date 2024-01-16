package com.example.toolbaractionbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.toolbaractionbar.databinding.ActivityConfiguracoesBinding
import com.example.toolbaractionbar.databinding.ActivityMainBinding



class ConfiguracoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityConfiguracoesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonVoltar.setOnClickListener{
          val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }

    }
}