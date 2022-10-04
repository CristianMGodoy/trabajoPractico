package com.example.reducirreutilizarreciclar

class EncargadoDeLaTienda(nombre:String,apellido:String,dni:Int,edad:Int,var turno:Turno): Persona(nombre,apellido,dni,edad) {

    override fun trabajar() {
        println("${this.nombre} cobrar a los clientes y acomodar la mercaderia")
    }

    override fun toString(): String {
        return ("nombre del encargado de la tienda ${this.nombre} apellido ${this.apellido} dni ${this.dni} edad ${this.edad}   ${this.turno}")
    }
}