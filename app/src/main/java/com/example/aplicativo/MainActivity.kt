package com.example.aplicativo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplicativo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ok.setOnClickListener{
            val nome : String = binding.textbox.text.toString()
        //binding.resultado.text = "ola  ${nome}"
        binding.resultado.setText("ola  ${nome}")

        }
    }
}