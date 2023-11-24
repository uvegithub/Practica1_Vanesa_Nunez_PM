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
    private lateinit var array_imagenes: MutableList<Int>

    private lateinit var valores: MutableList<Int>

    var fin_partida: Boolean = false
    var comprobando: Boolean = false

    var vidas: Int=5

    var cont_cartas:Int=0

    var contador: Int=0

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


        inicializar()

        if (cont_cartas == 2){
            comprobar(valores)
            cont_cartas = 0
        }


        imagen01.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen01,0)
                cont_cartas += 1
                valores.add(array_cartas[0])
            }

        }
        imagen02.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen02,1)
                cont_cartas += 1
                valores.add(array_cartas[1])
            }

        }
        imagen03.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen03,2)
                cont_cartas += 1
                valores.add(array_cartas[2])
            }

        }
        imagen04.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen04,3)
                cont_cartas += 1
                valores.add(array_cartas[3])
            }

        }
        imagen05.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen05,4)
                cont_cartas += 1
                valores.add(array_cartas[4])
            }

        }
        imagen06.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen06,5)
                cont_cartas += 1
                valores.add(array_cartas[5])
            }

        }

        imagen07.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen07,6)
                cont_cartas += 1
                valores.add(array_cartas[6])
            }

        }
        imagen08.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen08,7)
                cont_cartas += 1
                valores.add(array_cartas[7])
            }

        }
        imagen09.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen09,8)
                cont_cartas += 1
                valores.add(array_cartas[8])
            }

        }
        imagen010.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen010,9)
                cont_cartas += 1
                valores.add(array_cartas[9])
            }

        }
        imagen011.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen011,10)
                cont_cartas += 1
                valores.add(array_cartas[10])
            }

        }
        imagen012.setOnClickListener {
            if(!fin_partida && cont_cartas<=2){
                click_imagen(imagen012,11)
                cont_cartas += 1
                valores.add(array_cartas[11])
            }

        }

        if(vidas == 0){
            fin_partida = true
        }

    }

    fun inicializar(){
        array_cartas = arrayOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6)
        array_imagenes = mutableListOf()
        valores = mutableListOf()
        array_cartas.shuffle()


        for(i in array_cartas.indices){
            when (array_cartas[i]){
                1 -> array_imagenes.add(R.drawable.c1)
                2 -> array_imagenes.add(R.drawable.c2)
                3 -> array_imagenes.add(R.drawable.c3)
                4 -> array_imagenes.add(R.drawable.c4)
                5 -> array_imagenes.add(R.drawable.c5)
                6 -> array_imagenes.add(R.drawable.c6)
            }
        }
    }

    fun click_imagen(imagen:ImageView, idex_carta:Int){
        imagen.setImageResource(array_imagenes.get(array_cartas[idex_carta]))
    }

    fun comprobar(valor: MutableList<Int>){
//        var pareja:Boolean = false

        if(valor[0] == valor[1]){
//            pareja = true
            contador += 1
            valores = mutableListOf()
        }else {
//            pareja = false
            vidas -= 1
            valores = mutableListOf()
        }

        if (contador == 6){
            fin_partida = true
        }
    }
}