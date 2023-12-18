package com.example.practica1_vanesa_nunez_pm

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.preference.PreferenceManager
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.edit
import com.example.practica1_vanesa_nunez_pm.databinding.ActivityCalculatronBinding
import com.example.practica1_vanesa_nunez_pm.databinding.ActivityConfiguracionCBinding
import kotlin.random.Random

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

    lateinit var cuentaAtras_edit:TextView

//    var c_atrasb:Boolean=false

    private lateinit var binding: ActivityCalculatronBinding
    var num1:Int=1
    var num2:Int=0
    var cuenta_res=0
//    var correcta:Boolean=true

    var total_partidas:Int=0

    var max = 0
    var min = 0
    var c_atras = 0
    var operador = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculatron)


        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        c_atras = sharedPreferences.getString("duracion", "20")!!.toInt()

        operador = sharedPreferences.getString("operador", "+")!!

        max = sharedPreferences.getString("maximo", "10")!!.toInt()
        min = sharedPreferences.getString("minimo", "1")!!.toInt()

        binding = ActivityCalculatronBinding.inflate(layoutInflater)
        setContentView(binding.root)

        acer=findViewById<TextView>(R.id.acertadasres)
        fall=findViewById<TextView>(R.id.falladasres)
        ante=findViewById<TextView>(R.id.canteriorres)
        actu=findViewById<TextView>(R.id.cactualres)
        actu_res=findViewById(R.id.cactualedi)
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

        cuentaAtras_edit=findViewById(R.id.cuentaatras)

        var tiempoMilisegundos=c_atras*1000

        var timer = object :CountDownTimer(tiempoMilisegundos.toLong(), 1000){
            override fun onTick(p0: Long) {
                var segundos_restantes=p0/1000
                cuentaAtras_edit.text=segundos_restantes.toString()
            }

            override fun onFinish() {
                iniciarActividadResumen()
            }
        }

        var cont_acer:Int=0
        var cont_fall:Int=0

        var pasar_al_siguiente:Boolean=false

        var total_cuentas:Int=0

        cuenta()
        total_cuentas+=1
        actu.text=num1.toString() + operador + num2.toString() + "="
        binser.setOnClickListener {
            Log.v("actu_res", actu_res.text.toString())
            Log.v("cuenta_tes", cuenta_res.toString())
            if(actu.text.toString().equals(cuenta_res.toString())){
                cont_acer+=1
                acer.text=cont_acer.toString()
                pasar_al_siguiente=true
            }else{
                cont_fall+=1
                fall.text=cont_fall.toString()
                pasar_al_siguiente=true
            }
        }
        ante.text=actu.text.toString()+actu_res.text.toString()
        cuenta()
        total_cuentas+=1
        pasar_al_siguiente=false
        sigui.text=num1.toString() + operador + num2.toString()
        if(pasar_al_siguiente){
            actu.text=sigui.text.toString() + "="
            cuenta()
            total_cuentas+=1
            pasar_al_siguiente=false
        }
//        if(ante.text==actu.text){
//            cuenta()
//            total_cuentas+=1
//            pasar_al_siguiente=false
//        }
        if(!pasar_al_siguiente){
            sigui.text=num1.toString() + operador + num2.toString()
        }
        beli.setOnClickListener {
            actu_res.setText("")
        }

        sharedPreferences.edit {
            putString("acertadas",acer.text.toString())
            putString("falladas",fall.text.toString())
            putString("cuentas", total_cuentas.toString())
        }

    }

    fun iniciarActividadResumen (){

        val intent = Intent(this, Calculatron_resumen::class.java)
        startActivity(intent)

        total_partidas+=1
    }

    fun cuenta(){
        num1= Random.nextInt(max - min + 1) + min
        num2= Random.nextInt(max - min + 1) + min
        Log.v("operador", operador)
        if(operador=="+"){
            cuenta_res=num1+num2
        }else if(operador=="-"){
            cuenta_res=num1-num2
        }else if(operador=="*"){
            cuenta_res=num1*num2
        }
    }


//    fun comprobar_c_atras(){
//        if(c_atras==20){
//            c_atrasb=true
//        }
//    }
}