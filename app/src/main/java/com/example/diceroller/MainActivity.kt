package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.countUp_button)
        countUpButton.setOnClickListener{countUpNumber()}

    }



    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)


        val randomInt = Random().nextInt(6) + 1
        val randomInt1 = Random().nextInt(6)+1
        val randomInt2 = Random().nextInt(6)+1
        resultText.text = randomInt.toString()
        resultText1.text = randomInt1.toString()
        resultText2.text = randomInt2.toString()

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

    private  fun countUpNumber(){

        val resultText1 : TextView = findViewById(R.id.result_text)
        val resultText2 : TextView = findViewById(R.id.result_text1)
        val resultText3 : TextView = findViewById(R.id.result_text2)

        val countUpNumber1: TextView = findViewById(R.id.countUp_text1)
        val countUpNumber2: TextView = findViewById(R.id.countUp_text2)
        val countUpNumber3: TextView = findViewById(R.id.countUp_text3)

        countUpNumber1.text = (Integer.parseInt(resultText1.text.toString())+1).toString()
        countUpNumber2.text = (Integer.parseInt(resultText2.text.toString())+1).toString()
        countUpNumber3.text = (Integer.parseInt(resultText3.text.toString())+1).toString()

        if(Integer.parseInt(countUpNumber1.text.toString())>6){
            countUpNumber1.text="6"
        }

        if(Integer.parseInt(countUpNumber2.text.toString())>6){
            countUpNumber2.text="6"
        }

        if(Integer.parseInt(countUpNumber3.text.toString())>6){
            countUpNumber3.text="6"
        }

    }
}
