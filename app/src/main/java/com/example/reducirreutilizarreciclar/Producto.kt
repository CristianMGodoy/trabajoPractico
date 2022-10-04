package com.example.reducirreutilizarreciclar

class Producto(id:Int,nombre:String,precio:Double) {
   var id=id
    var nombre=nombre
    var precio=precio
    var tipo: String=""
        get() = field
        set(tipo) {

           if (tipo=="arma")
            field = "¡¡¡¡PELIGRO !!! NO ACEPTE ESTE PRODUCTO es un arma"
        }


    override fun toString(): String {
        return ("codigo del producto ${this.id} nombre ${this.nombre} precio ${this.precio}")
    }

}