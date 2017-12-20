package com.warriorminds.fundamentsactividades

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.actividad_persistencia_datos.*

class ActividadPersistenciaDatos : AppCompatActivity() {

    companion object {
        val TAG = ActividadPersistenciaDatos::class.java.simpleName
        val TEXTO = "texto"
        val TEXTO_BOTON = "textoBoton"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_persistencia_datos)
        Log.i(TAG, "onCreate()")

        btnTexto.setOnClickListener {
            tvCadena.text = etCadena.text
        }

        savedInstanceState?.let {
            tvCadena.text = it.getString(TEXTO)
            btnTexto.text = it.getString(TEXTO_BOTON)
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart()")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState()")
        savedInstanceState?.let {
            btnTexto.text = it.getString(TEXTO_BOTON)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause()")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState()")
        outState?.putString(TEXTO_BOTON, btnTexto.text.toString())
        outState?.putString(TEXTO, tvCadena.text.toString())
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy()")
    }
}
