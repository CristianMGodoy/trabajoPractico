package com.example.reducirreutilizarreciclar

    class Turno {
    var nombre: String=""
    var horaDeEntrada: String=""
    var horaDeSalida: String=""
    constructor(nombre:String,horaDeEntrada:String,horaDeSalida:String){
        this.nombre=nombre
        this.horaDeEntrada=horaDeEntrada
        this.horaDeSalida=horaDeSalida

    }

        override fun toString(): String {
         return (" turno  ${this.nombre} el horario de entrada es ${this.horaDeEntrada}hs y el horario de dalida es ${this.horaDeSalida}hs")
        }

}