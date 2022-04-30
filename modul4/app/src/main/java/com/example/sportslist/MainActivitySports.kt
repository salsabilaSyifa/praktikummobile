package com.example.sportslist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.sportslist.databinding.ActivityMainsportsBinding
import java.util.*

class MainActivitySports : AppCompatActivity() {
    private lateinit var binding:ActivityMainsportsBinding
    private lateinit var locale: Locale
    private var current = "en"
    private var currenlang:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainsportsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tombolindo: Button = binding.indo
        val tombolenglish:Button = binding.english

        tombolindo.setOnClickListener{
            gantibahasa("id")
        }
        tombolenglish.setOnClickListener{
            gantibahasa("en")
        }
    }

    private fun gantibahasa(bahasa :String){
        locale = Locale(bahasa)
        val res = resources
        val dm = res.displayMetrics
        val config = res.configuration
        config.locale = locale
        res.updateConfiguration(config,dm)
        val baru = Intent(this,MainActivity::class.java)
        baru.putExtra(currenlang,bahasa)
        startActivity(baru)
    }
}