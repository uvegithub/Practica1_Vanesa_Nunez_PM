package com.example.practica1_vanesa_nunez_pm

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
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
    var pareja: Boolean = false

    var vidas: Int=5

    var contador_parejas: Int=0

    var dar_vuelta: Boolean = false

    private lateinit var imagen_primera: ImageView

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


//        inicializar()

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

        Log.v("arrayCartas", array_cartas.toString())
        Log.v("arrayImagenes", array_imagenes.toString())

//        if (cont_cartas == 2){
//            comprobar(valores)
//            cont_cartas = 0
//        }


        imagen01.setOnClickListener {
            returnArray()
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen01,0)
//                cont_cartas += 1
                valores.add(array_cartas[0])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen01.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen01
                }
            }
        }
        imagen02.setOnClickListener {
            returnArray()
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen02,1)
                valores.add(array_cartas[1])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen02.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen02
                }
            }
        }
        imagen03.setOnClickListener {
            returnArray()
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen03,2)
                valores.add(array_cartas[2])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen03.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen03
                }
            }
        }
        imagen04.setOnClickListener {
            returnArray()
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen04,3)
                valores.add(array_cartas[3])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen04.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen04
                }
            }
        }
        imagen05.setOnClickListener {
            returnArray()
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen05,4)
                valores.add(array_cartas[4])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen05.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen05
                }
            }
        }
        imagen06.setOnClickListener {
            returnArray()
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen06,5)
                valores.add(array_cartas[5])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen06.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen06
                }
            }
        }

        imagen07.setOnClickListener {
            returnArray()
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen07,6)
                valores.add(array_cartas[6])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen07.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen07
                }
            }
        }
        imagen08.setOnClickListener {
            returnArray()
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen08,7)
                valores.add(array_cartas[7])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen08.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen08
                }
            }
        }
        imagen09.setOnClickListener {
            returnArray()
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen09,8)
                valores.add(array_cartas[8])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen09.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen09
                }
            }
        }
        imagen010.setOnClickListener {
            returnArray()
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen010,9)
                valores.add(array_cartas[9])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen010.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen010
                }
            }
        }
        imagen011.setOnClickListener {
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen011,10)
                valores.add(array_cartas[10])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen011.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen011
                }
            }
        }
        imagen012.setOnClickListener {
            comprobar_finpartida()
            if(!fin_partida){
                click_imagen(imagen012,11)
                valores.add(array_cartas[11])
                if(valores.size==2){
                    comprobar_parejas(valores)
                    if(!pareja){
                        Handler(Looper.getMainLooper()).postDelayed({
                            imagen012.setImageResource(R.drawable.c0)
                            imagen_primera.setImageResource(R.drawable.c0)
                        },3000)
                        comprobar_vidas()
                    }else{
                        comprobar_finpartida()
                    }
                }else{
                    imagen_primera = imagen012
                }
            }
        }

    }

    fun returnArray(): Unit{
        var stringggg: String = ""
        var stringggg2: String = ""

        for (carta in array_cartas){
            stringggg += " ${carta.toString()} "
        }
        for (imagen in array_imagenes){
            stringggg2 += " ${imagen.toString()} "
        }
        array_imagenes

        Log.v("array",stringggg)
        Log.v("arrayimagenes",stringggg2)
    }
    fun inicializar(){

    }

    fun click_imagen(imagen:ImageView, idex_carta:Int){
        imagen.setImageResource(array_imagenes[array_cartas[idex_carta]])
    }

    fun comprobar_parejas(valor: MutableList<Int>){

        if(valor[0] == valor[1]){
            pareja = true
            contador_parejas += 1
            valores = mutableListOf()
        }else {
            pareja = false
            vidas -= 1
            valores = mutableListOf()
            dar_vuelta = true
        }
    }

    fun comprobar_finpartida(){
        if (contador_parejas == 6){
            fin_partida = true
            textoganar.text = "HAS GANADO"
        }
    }

    fun comprobar_vidas(){
        if(vidas == 0){
            fin_partida = true
            textoganar.text="HAS PERDIDO"
        }
    }
}