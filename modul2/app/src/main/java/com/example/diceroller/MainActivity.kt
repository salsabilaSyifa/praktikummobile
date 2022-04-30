package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {acakDadu()}

        printDadu()
    }

    private fun printDadu() {
        val diceImg1: ImageView = findViewById(R.id.imageView)
        diceImg1.setImageResource(R.drawable.dice_0)

        val diceImg2: ImageView = findViewById(R.id.imageView2)
        diceImg2.setImageResource(R.drawable.dice_0)
    }

    private fun acakDadu() {
        val dadu1 = Dadu(6)
        val acakDadu1 = dadu1.acak()
        val gambarDadu1: ImageView = findViewById(R.id.imageView)
        val drawableResource1 = when (acakDadu1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        gambarDadu1.setImageResource(drawableResource1)
        gambarDadu1.contentDescription = acakDadu1.toString()

        val dadu2 = Dadu(6)
        val acakDadu2 = dadu2.acak()
        val gambarDadu2: ImageView = findViewById(R.id.imageView2)
        val drawableResource2 = when (acakDadu2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        gambarDadu2.setImageResource(drawableResource2)
        gambarDadu2.contentDescription = acakDadu2.toString()

        if (acakDadu1==acakDadu2){
            Toast.makeText(this, "Selamat anda dapat dadu double!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Anda belum beruntung!", Toast.LENGTH_SHORT).show()
        }
    }
}

class Dadu(private val angkaDadu: Int) {
    fun acak(): Int {
        return (1..angkaDadu).random()
    }
}
