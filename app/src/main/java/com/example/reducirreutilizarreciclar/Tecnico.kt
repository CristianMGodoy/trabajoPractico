package com.example.reducirreutilizarreciclar

class Tecnico(nombre:String,apellido:String,dni:Int,edad:Int,var turno:Turno): Persona(nombre,apellido,dni,edad) {

    override fun trabajar() {
        println("${this.nombre} evaluar si la donacion recivida necesita reparacion ")
    }

    override fun toString(): String {
        return ("nombre del Tecnico ${this.nombre} apellido ${this.apellido} dni ${this.dni} edad ${this.edad}   ${this.turno}")
    }
}
