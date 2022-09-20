package com.miempresa.miprimerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cambio:TextView = findViewById(R.id.test) as TextView

        var n1 = findViewById<View>(R.id.etUno) as EditText
        var n2 = findViewById<View>(R.id.etDos) as EditText

        var btn = findViewById<View>(R.id.btnCalcular) as Button
        var restar = findViewById<View>(R.id.button) as Button
        var mul = findViewById<View>(R.id.button2) as Button
        var div = findViewById<View>(R.id.button3) as Button

        btn.setOnClickListener(View.OnClickListener {
            var rpta = n1.text.toString().toInt()+n2.text.toString().toInt()
            cambio.text = "La suma es: "+rpta.toString()
        })

        restar.setOnClickListener(View.OnClickListener {
            var rpta = n1.text.toString().toInt()-n2.text.toString().toInt()
            cambio.text = rpta.toString()
        })

        mul.setOnClickListener(View.OnClickListener {
            var rpta = n1.text.toString().toInt()*n2.text.toString().toInt()
            cambio.text = rpta.toString()
        })

        div.setOnClickListener(View.OnClickListener {
            var rpta = n1.text.toString().toInt()/n2.text.toString().toInt()
            cambio.text = rpta.toString()
        })

    }
}