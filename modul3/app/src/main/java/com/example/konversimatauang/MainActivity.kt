package com.example.konversimatauang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.konversimatauang.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDoubleOrNull()

        if (cost == null) {
            binding.tipResult.text = ""
            return }

        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.Euro -> 16000
            R.id.US -> 14000
            R.id.Yen -> 115
            else -> 4000 }

        val tip = tipPercentage * cost

        val indonesianLocale = Locale("in", "ID")
        val formattedTip = NumberFormat.getCurrencyInstance(indonesianLocale).format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}
