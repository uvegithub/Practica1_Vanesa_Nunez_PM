package com.example.practica1_vanesa_nunez_pm

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.edit

class Calculatron : AppCompatActivity() {

    lateinit var acer:TextView
    lateinit var fall:TextView
    lateinit var ante:TextView
    lateinit var actu:TextView
    lateinit var actu_res:EditText
    lateinit var sigui:TextView
    lateinit var binser: Button
    lateinit var bborra: Button
    lateinit var beli: Button
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var b4: Button
    lateinit var b5: Button
    lateinit var b6: Button
    lateinit var b7: Button
    lateinit var b8: Button
    lateinit var b9: Button

    private lateinit var sharedPreferences: SharedPreferences

    var c_atras:Int = sharedPreferences.getString("duracion", "20")!!.toInt()
    var c_atrasb:Boolean=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculatron)

        acer=findViewById<TextView>(R.id.acertadasres)
        fall=findViewById<TextView>(R.id.falladasres)
        ante=findViewById<TextView>(R.id.canteriorres)
        actu=findViewById<TextView>(R.id.cactualres)
        actu_res=findViewById<EditText>(R.id.cactualedi)
        sigui=findViewById<TextView>(R.id.cnextres)
        binser=findViewById<Button>(R.id.buttoninser)
        bborra=findViewById<Button>(R.id.buttonborra)
        beli=findViewById<Button>(R.id.buttoneli)
        b1=findViewById<Button>(R.id.button1)
        b2=findViewById<Button>(R.id.button2)
        b3=findViewById<Button>(R.id.button3)
        b4=findViewById<Button>(R.id.button4)
        b5=findViewById<Button>(R.id.button5)
        b6=findViewById<Button>(R.id.button6)
        b7=findViewById<Button>(R.id.button7)
        b8=findViewById<Button>(R.id.button8)
        b9=findViewById<Button>(R.id.button9)


    }

    fun comprobar_c_atras(){
        if(c_atras==20){
            c_atrasb=true
        }
    }
}