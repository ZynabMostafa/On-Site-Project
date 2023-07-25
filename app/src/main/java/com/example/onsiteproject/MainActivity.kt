package com.example.onsiteproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var clculateBtn: Button
    lateinit var numberOne: EditText
    lateinit var numberTwo: EditText
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clculateBtn = findViewById(R.id.clculate_btn)
        numberOne = findViewById(R.id.first_number)
        numberTwo = findViewById(R.id.second_number)
        result = findViewById(R.id.result_txt)


        clculateBtn.setOnClickListener {
            val numbOne: Int =
            kotlin.runCatching { numberOne.text.toString().toInt() }.getOrElse { 0 }
            val numbTne: Int =
            kotlin.runCatching { numberTwo.text.toString().toInt() }.getOrElse { 0 }

            result.text = "${numbOne + numbTne}"


        }

    }


}