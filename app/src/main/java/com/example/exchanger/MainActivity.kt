package com.example.exchanger

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var editText: EditText? = null
    private var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById<View>(R.id.math_input) as EditText
        textView = findViewById<View>(R.id.result_math) as TextView
    }

    fun ClickButton(v: View?) {
        val a: Double
        val b: Double
        val c: Double
        val S1 = editText!!.text.toString()
        if(S1.length == 0 ) {
            a = '0'.toString().toDouble()
        }
        else{
            a = S1.toDouble()
        }
        b = a * 7400
        val i = Math.round(b).toInt()
        c = i.toDouble() / 100
        val S = java.lang.Double.toString(c)
        textView!!.text = S
    }

    fun ClickButton2(v: View?) {
        val a: Double
        val b: Double
        val c: Double
        val S1 = editText!!.text.toString()
        if(S1.length == 0 ) {
            a = '0'.toString().toDouble()
        }
        else{
            a = S1.toDouble()
        }
        b = a / 74 *100
        val i = Math.round(b).toInt()
        c = i.toDouble()/100
        val S = java.lang.Double.toString(c)
        textView!!.text = S
    }
}