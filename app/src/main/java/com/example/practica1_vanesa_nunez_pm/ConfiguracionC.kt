package com.example.practica1_vanesa_nunez_pm

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import com.example.practica1_vanesa_nunez_pm.databinding.ActivityConfiguracionCBinding


class ConfiguracionC : AppCompatActivity() {


    private lateinit var spinner: Spinner

    private lateinit var binding: ActivityConfiguracionCBinding
    private lateinit var sharedPreferences: SharedPreferences

    lateinit var c_atras: EditText
    lateinit var minimo: EditText
    lateinit var maximo: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConfiguracionCBinding.inflate(layoutInflater)
        setContentView(binding.root)

        spinner= findViewById<Spinner>(R.id.spinner)

        val adapter =
            ArrayAdapter.createFromResource(this, R.array.animacion, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner.adapter = adapter


        c_atras=findViewById<EditText>(R.id.cuentares)
        minimo=findViewById<EditText>(R.id.minimores)
        maximo=findViewById<EditText>(R.id.maximores)


    }

    fun iniciarActividadcalculator (view : View){

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        sharedPreferences.edit {
            putString("duracion",c_atras.text.toString())
            putString("maximo", minimo.text.toString())
            putString("minimo", maximo.text.toString())
        }

        val intent = Intent(this, Calculatron::class.java)
        startActivity(intent)
    }
}