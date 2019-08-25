package com.github.raymondddenny.randomgenerator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var resultText: TextView
    lateinit var randomButton: Button

    // add arraylist
    val randomChoice = arrayListOf("Head", "Tail")
    val changeColor = arrayListOf("#ff7f50","#0096d6")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultText= findViewById(R.id.resultText)
        randomButton= findViewById(R.id.randomButton)
        randomButton.setOnClickListener {
            rollDice() // call rolldice function
            //pop up message after clicked
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        }
    }

    private fun rollDice() {

        //to get and assign the random result to randomFace
        val randomFace = Random().nextInt(randomChoice.count())
        val randomBgColor = Random().nextInt(changeColor.count())
        // for the color
        val color:String = changeColor[randomBgColor]
        val colorSet:Int = Color.parseColor(color)

        //assign the result to text
        resultText.text=randomChoice[randomFace]
        resultText.setBackgroundColor(colorSet)
        //assign the result color to background
        //ProgrammingBG.setBackgroundColor(colorSet)

        //val randomInt = Random().nextInt(6) + 1
        //resultText.text = randomInt.toString()
        // val randomString = Random().nextBytes()

    }
}
