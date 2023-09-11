package com.example.conversortemperatura

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val inputText = binding.editCelsius.text.toString()

            if (inputText.isNotEmpty()) {
                val celsius = inputText.toDouble()

                if (celsius >= 0 && celsius <= 40) {
                    val fahrenheit = String.format("%.0f", celsius * 1.8 + 32)
                    binding.textResultado.text = "$fahrenheit Fº"
                } else {
                    binding.textResultado.text = "Temperatura inválida."
                }
            } else {
                binding.textResultado.text = "Insira uma temperatura."
            }
        }
    }
}
