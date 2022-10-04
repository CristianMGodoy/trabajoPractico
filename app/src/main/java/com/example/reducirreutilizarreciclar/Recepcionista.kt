package com.example.reducirreutilizarreciclar

class Recepcionista(nombre:String,apellido:String,dni:Int,edad:Int,var turno:Turno): Persona(nombre,apellido,dni,edad){

    override fun trabajar() {
            println("${this.nombre} a recibido una orden de trabajo por favor registre la donacion")
    }

    override fun toString(): String {
        return ("nombre recepcionista ${this.nombre} apellido ${this.apellido} dni ${this.dni} edad ${this.edad}   ${this.turno}")
    }

}
