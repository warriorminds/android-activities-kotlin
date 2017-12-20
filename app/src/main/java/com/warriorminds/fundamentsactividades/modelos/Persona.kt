package com.warriorminds.fundamentsactividades.modelos

import java.io.Serializable

data class Persona(val nombre: String, val edad: Int, var direccion: String, val genero: String) : Serializable {
}