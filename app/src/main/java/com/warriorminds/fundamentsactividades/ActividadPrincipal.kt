package com.warriorminds.fundamentsactividades

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.warriorminds.fundamentsactividades.modelos.Persona
import kotlinx.android.synthetic.main.actividad_principal.*
import java.util.*

class ActividadPrincipal : AppCompatActivity(){

    companion object {
        val BOOLEANO = "booleano"
        val ENTERO = "entero"
        val TEXTO = "texto"
        val PERSONA = "persona"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_principal)

        botonCambiarTexto.setOnClickListener {
            tvPrincipal.setText("Número ${Random().nextInt(100)}")
        }

        botonNuevaActividad.setOnClickListener {
            abrirNuevaActividad()
        }

        botonActividadImplicita.setOnClickListener {
            abrirActividadImplicita()
        }

        botonEnviarDatosActividad.setOnClickListener {
            enviarDatosActividad()
        }
    }

    private fun abrirNuevaActividad() {
        val intent = Intent(this, NuevaActividad::class.java)
        startActivity(intent)
    }

    private fun abrirActividadImplicita() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://warriorminds.github.io"))
        intent.resolveActivity(packageManager).let {
            startActivity(intent)
        }
    }

    private fun enviarDatosActividad() {
        val intent = Intent(this, NuevaActividadDatos::class.java)
        intent.putExtra(BOOLEANO, true)
        intent.putExtra(ENTERO, 54)
        intent.putExtra(TEXTO, "Texto enviado de otra actividad")

        val persona = Persona("Rodrigo", 30, "Calle #5", "Masculino")
        intent.putExtra(PERSONA, persona)
        startActivity(intent)
    }
}