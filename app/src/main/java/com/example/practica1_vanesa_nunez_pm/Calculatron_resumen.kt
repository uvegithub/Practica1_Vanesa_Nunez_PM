package com.example.practica1_vanesa_nunez_pm

import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.practica1_vanesa_nunez_pm.databinding.ActivityCalculatronResumenBinding

class Calculatron_resumen : AppCompatActivity() {

    lateinit var aciertos_ultima: TextView
    lateinit var fallos_ultima:TextView
    lateinit var aciertos_total:TextView
    lateinit var fallos_total:TextView
    lateinit var porcentaje_ultima:TextView
    lateinit var porcentaje_total:TextView

    private lateinit var sharedPreferences: SharedPreferences

    var aciertos_ultima_partida:Int = 0
    var fallos_ultima_partida:Int = 0
    var total_cuentas_ultima_partida:Int = 0

    private lateinit var binding: ActivityCalculatronResumenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculatron_resumen)

        aciertos_ultima=findViewById<TextView>(R.id.acer_res)
        fallos_ultima=findViewById<TextView>(R.id.fall_res)
        aciertos_total=findViewById<TextView>(R.id.acer_res_tot)
        fallos_total=findViewById<TextView>(R.id.fall_res_tot)
        porcentaje_ultima=findViewById<TextView>(R.id.por_res)
        porcentaje_total=findViewById<TextView>(R.id.por_res_tot)

        binding = ActivityCalculatronResumenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        aciertos_ultima_partida = sharedPreferences.getString("acertadas", "0")!!.toInt()
        fallos_ultima_partida = sharedPreferences.getString("falladas", "0")!!.toInt()
        total_cuentas_ultima_partida = sharedPreferences.getString("cuentas", "0")!!.toInt()

        aciertos_ultima.setText(aciertos_ultima_partida.toString())
        fallos_ultima.setText(fallos_ultima_partida.toString())
        var total_ultima:Int = aciertos_ultima_partida*100/total_cuentas_ultima_partida
        porcentaje_ultima.text=total_ultima.toString()

        var total_acertadas:Int=0
        total_acertadas+=aciertos_ultima_partida

        var total_falladas:Int=0
        total_falladas+=fallos_ultima_partida

        aciertos_total.text=total_acertadas.toString()
        fallos_ultima.text=total_falladas.toString()
        var porcentaje_todas_las_partidas:Int = total_acertadas*100/total_cuentas_ultima_partida
        porcentaje_total.text=porcentaje_todas_las_partidas.toString()
    }
}