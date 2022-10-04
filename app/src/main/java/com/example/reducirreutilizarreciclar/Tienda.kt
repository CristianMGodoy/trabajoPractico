package com.example.reducirreutilizarreciclar

import java.util.ArrayList

class Tienda(var nombre:String, var direccion:String,var telefono:Int,var recepcionistas: MutableList<Recepcionista>,var transportistas: MutableList<Transportista>,var tecnicos: MutableList<Tecnico>,var encargados:MutableList<EncargadoDeLaTienda>,var productos: MutableList<Producto>) {

    override fun toString(): String {
        return ("--------nombre: ${nombre} direccion: ${direccion} telefono: ${telefono}---------")
    }
        fun listRecepcionistas(){
            for (recep in recepcionistas){
                println(recep)
            }
        }
    fun listTransportistas(){
        for (transp in transportistas){
            println(transp)
        }
    }
    fun listTecnicos(){
        for (tec in tecnicos){
            println(tec)
        }
    }

    fun listEncargados(){
        for (enc in encargados){
            println(enc)
        }
    } fun listProductos(){
        for (prod in productos){
            println(prod)
        }
    }
}