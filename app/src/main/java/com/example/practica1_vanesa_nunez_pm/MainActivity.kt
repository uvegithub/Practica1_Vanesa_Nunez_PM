package com.example.practica1_vanesa_nunez_pm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun iniciarActividadcartas (view : View){
        val intent = Intent(this, Memorytron::class.java)
        startActivity(intent)
    }
}