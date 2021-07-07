package s7.e2

import s7.r1.Person
import java.lang.Exception
import java.lang.NumberFormatException

fun main() {

    /*
    val v = "bedu.org"
    v.toInt()
     */

    /*
    try {
        val v = "bedu.org"
        v.toInt()
    } catch (e: NumberFormatException){
        e.printStackTrace()
        println("No se pudo convertir, hubo un error: $e")
    } finally {
        println("Proceso terminada")
    }

     */

    /*
    try {
        val v = "bedu.org"
        v.toInt()
        val divider = 0
        val a = 3 / divider //comentar para reproducir el primer error
    } catch (e: NumberFormatException){
        println("No se pudo convertir este tipo a numerico")
        e.printStackTrace()

    } catch (e: Exception) {
        println("No se pudo convertir, hubo un error: $e")
    }finally {
        println("Proceso terminada")
    }
     */

    val stock = listOf(Shirt(), Shirt(), Shirt(), Shirt(), Shirt())
    /* Sin exception
    val cliente = 7
    val restarDeInventario = cliente - 1

    for (i in 0..restarDeInventario) {
        stock[i].reserve()
    }

     */

    try {
        val shirtsToRent = 7
        val end = shirtsToRent - 1
        for (i in 0..end) {
            stock[i].reserve()
        }
    }catch (e: ArrayIndexOutOfBoundsException) {
        println("No hay suficiente camisas en stock, por favor disminuye la cantidad")
        stock.forEach {
            it.unreserve()
        }
    }finally {
        println("Gracias por su preferencia")
    }

    val person = Person("Paco")
    val s = person.name ?: person.fail("Nombre requerido")
    println(s)
}

class Shirt() {
    var available = true

    fun reserve() {
        if (available) {
            available = false
            println("Reservación efectuada")
        }
    }

    fun unreserve() {
        fun unreserve() {
            available = true
            println("Reservación cancelada")
        }
    }
}