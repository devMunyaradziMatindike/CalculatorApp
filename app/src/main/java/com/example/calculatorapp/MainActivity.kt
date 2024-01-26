package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btnDivision
import kotlinx.android.synthetic.main.activity_main.btnMinus
import kotlinx.android.synthetic.main.activity_main.btnMultiply
import kotlinx.android.synthetic.main.activity_main.btnPlus
import kotlinx.android.synthetic.main.activity_main.eTInput
import kotlinx.android.synthetic.main.activity_main.eTInput2
import kotlinx.android.synthetic.main.activity_main.tvResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

btnPlus.setOnClickListener {

    val input1=eTInput.text.toString().toInt()
    val input2=eTInput2.text.toString().toInt()
    tvResult.text=(input1+input2).toString()



}
        btnMinus.setOnClickListener {
            val input1=eTInput.text.toString().toInt()
            val input2=eTInput2.text.toString().toInt()
            tvResult.text=(input1-input2).toString()

        }

        btnMultiply.setOnClickListener {

            val input1=eTInput.text.toString().toInt()
            val input2=eTInput2.text.toString().toInt()
            tvResult.text=(input1*input2).toString()
        }

        btnDivision.setOnClickListener {

            val input1=eTInput.text.toString().toInt()
            val input2=eTInput2.text.toString().toInt()
            tvResult.text=(input1/input2).toString()
        }

    }



}