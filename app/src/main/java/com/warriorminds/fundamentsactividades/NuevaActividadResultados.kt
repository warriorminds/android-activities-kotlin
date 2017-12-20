package com.warriorminds.fundamentsactividades

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.actividad_nueva_resultados.*

class NuevaActividadResultados : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_nueva_resultados)

        botonPrimero.setOnClickListener {
            setResult(Activity.RESULT_OK, Intent().putExtra(ActividadPrincipal.BOTON_PRESIONADO, "Primer"))
            finish()
        }

        botonSegundo.setOnClickListener {
            setResult(Activity.RESULT_OK, Intent().putExtra(ActividadPrincipal.BOTON_PRESIONADO, "Segundo"))
            finish()
        }
    }
}
