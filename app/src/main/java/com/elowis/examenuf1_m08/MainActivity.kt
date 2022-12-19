package com.elowis.examenuf1_m08

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_admin = findViewById(R.id.editTextTextPersonName) as EditText
        var adminNom = et_admin.text.toString()

        if (adminNom.equals("admin123")){

        }
        else{
            Toast.makeText(this@MainActivity, "Incorrecte, fes clic al botó per mostrar contrasenya", Toast.LENGTH_LONG).show()

        }


    }

    fun mostrarNomAdmin(view: View){
        val textView = findViewById<TextView>(R.id.nomAdmin)
        textView.setTextColor(Color.BLUE)
    }
}