package com.example.practica1_vanesa_nunez_pm

import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.practica1_vanesa_nunez_pm.databinding.ActivityConfiguracionCBinding


class ConfiguracionC : AppCompatActivity() {


    private lateinit var spinner: Spinner

    private lateinit var binding: ActivityConfiguracionCBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConfiguracionCBinding.inflate(layoutInflater)
        setContentView(binding.root)

        spinner= findViewById<Spinner>(R.id.spinner)

        val adapter =
            ArrayAdapter.createFromResource(this, R.array.animacion, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner.adapter = adapter

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
    }
}