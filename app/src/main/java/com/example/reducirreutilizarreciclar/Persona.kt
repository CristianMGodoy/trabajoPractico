package com.example.reducirreutilizarreciclar

open class Persona {
    var nombre:String=""
    var apellido:String=""
    var dni:Int=0
    var edad: Int=0

    constructor(nombre:String,apellido:String,dni:Int,edad:Int) {
        this.nombre = nombre
        this.apellido=apellido
        this.dni=dni
        this.edad=edad
    }

    override fun toString(): String {
        return ("nombre de la persona ${this.nombre} apellido ${this.apellido} dni ${this.dni} edad ${this.edad}")
 }

   open fun trabajar(){
        println("${this.nombre} ${this.apellido} se le soliciata realizar las tareas rencomendadas ")
    }
}