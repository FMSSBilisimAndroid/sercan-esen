package com.example.rolldiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rolldiceapp.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.RollDiceButton.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice() {
        val randomNumber = Random().nextInt(6) + 1
        binding.tvResult.text = "${randomNumber} rolled."
        val changedImage =
            when(randomNumber){
                1 -> R.drawable.ic_dice_1
                2 -> R.drawable.ic_dice_2
                3 -> R.drawable.ic_dice_3
                4 -> R.drawable.ic_dice_4
                5 -> R.drawable.ic_dice_5
                else -> R.drawable.ic_dice_6
            }
        binding.iVForDice.setImageResource(changedImage)
    }
}