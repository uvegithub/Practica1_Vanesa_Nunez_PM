package com.example.practica1_vanesa_nunez_pm

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Memorytron : AppCompatActivity() {
    private lateinit var imagen01: ImageView
    private lateinit var imagen02: ImageView
    private lateinit var imagen03: ImageView
    private lateinit var imagen04: ImageView
    private lateinit var imagen05: ImageView
    private lateinit var imagen06: ImageView
    private lateinit var imagen07: ImageView
    private lateinit var imagen08: ImageView
    private lateinit var imagen09: ImageView
    private lateinit var imagen010: ImageView
    private lateinit var imagen011: ImageView
    private lateinit var imagen012: ImageView

    private lateinit var textoganar: TextView
    private lateinit var botonnueva: Button

    private lateinit var array_cartas: Array<Int>

    var fin_partida: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memorytron)

        imagen01 = findViewById<ImageView>(R.id.imageView01)
        imagen02 = findViewById<ImageView>(R.id.imageView02)
        imagen03 = findViewById<ImageView>(R.id.imageView03)
        imagen04 = findViewById<ImageView>(R.id.imageView04)
        imagen05 = findViewById<ImageView>(R.id.imageView05)
        imagen06 = findViewById<ImageView>(R.id.imageView06)
        imagen07 = findViewById<ImageView>(R.id.imageView07)
        imagen08 = findViewById<ImageView>(R.id.imageView08)
        imagen09 = findViewById<ImageView>(R.id.imageView09)
        imagen010 = findViewById<ImageView>(R.id.imageView010)
        imagen011 = findViewById<ImageView>(R.id.imageView011)
        imagen012 = findViewById<ImageView>(R.id.imageView012)

        botonnueva = findViewById<Button>(R.id.buttonpartida)
        textoganar = findViewById<TextView>(R.id.textViewganar)

        botonnueva.setOnClickListener{
            recreate()
        }

        array_cartas = arrayOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6)
        array_cartas.shuffle()

        for(i in array_cartas.indices){
            when (array_cartas[i]){
                1 -> imagen01.setImageResource(R.drawable.c1)
                2 -> imagen01.setImageResource(R.drawable.c2)
                3 -> imagen01.setImageResource(R.drawable.c3)
                4 -> imagen01.setImageResource(R.drawable.c4)
                5 -> imagen01.setImageResource(R.drawable.c5)
                6 -> imagen01.setImageResource(R.drawable.c6)
            }
        }

        var vidas: Int=5

        if(vidas == 0){
            fin_partida = true
        }



    }
}