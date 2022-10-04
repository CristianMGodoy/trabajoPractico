package com.example.reducirreutilizarreciclar

class Transportista(nombre:String,apellido:String,dni:Int,edad:Int,var turno:Turno,var vehiculo:String): Persona(nombre,apellido,dni,edad){

    override fun trabajar() {
        println("${this.nombre} se solicita sus cervicios para retira una donacion del lugar indicado en el registro")
    }

    override fun toString(): String {
        return ("nombre del transportista ${this.nombre} apellido ${this.apellido} dni ${this.dni} edad ${this.edad} vehiculo ${this.vehiculo}  ${this.turno}")
    }

}