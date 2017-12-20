package com.warriorminds.fundamentsactividades

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.actividad_principal.*
import java.util.*

class ActividadPrincipal : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_principal)

        botonCambiarTexto.setOnClickListener {
            tvPrincipal.setText("Número ${Random().nextInt(100)}")
        }
    }
}