package com.example.baitap3

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgDice: ImageView = findViewById(R.id.imgDice)
        val btnRoll: Button = findViewById(R.id.btnRoll)

        val diceImages = listOf(
            R.drawable.img,
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5
        )

        btnRoll.setOnClickListener {
            val randomIndex = Random.nextInt(diceImages.size)
            imgDice.setImageResource(diceImages[randomIndex])
        }
    }
}
