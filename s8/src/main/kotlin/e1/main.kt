package e1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Inicia")
    /*
    GlobalScope.launch {
        delay(1000)
        println("Un segundo")
    }

    Thread.sleep(3000)
    println("Termina")
     */

    runBlocking { // Bloquear el hilo donde se corre
        delay(2000L) //Proceso de suspension de 2 segundos
    }

    println("Bloqueo por corrutina de 2 segundos finalizado")
}