package com.justice.bottonapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll: Button = findViewById(R.id.roll_button)

        roll.setOnClickListener {
            val toast = Toast.makeText(this, "random element of me", Toast.LENGTH_SHORT)
            val textResult: TextView = findViewById(R.id.randomText)
            toast.show()
            val traitsIndex = traits[traitMaths()]
            textResult.text = traitsIndex
        }
    }
}

val traits = arrayOf("hardworking","lazy","somewhat lazy","very lazy", "dedicated")

val traitsIndex = traits[traitMaths()]

fun traitMaths(): Int {
    val randomNumber = 0..4
    return randomNumber.random()
}