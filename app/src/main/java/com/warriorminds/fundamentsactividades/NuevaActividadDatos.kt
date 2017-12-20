package com.warriorminds.fundamentsactividades

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.actividad_nueva_datos.*

class NuevaActividadDatos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_nueva_datos)

        intent.let {
            val booleano = it.getBooleanExtra(ActividadPrincipal.BOOLEANO, false)
            val entero = it.getIntExtra(ActividadPrincipal.ENTERO, 0)
            val texto = it.getStringExtra(ActividadPrincipal.TEXTO)
            val persona = it.getSerializableExtra(ActividadPrincipal.PERSONA)

            datos.text = "Booleano: $booleano,\nEntero: $entero,\nTexto: $texto,\n$persona"
        }
    }
}
