package r2

import e2.measureTimeMillis
import kotlinx.coroutines.*

suspend fun getPs4():Long {
    delay(3000)
    return 5299L
}

suspend fun getScooter():Long {
    delay(2000)
    return 2400L
}


fun main() {
    //Ejercicio 2
    runBlocking {
        println("El precio del PS4 es: ${getPs4()}")
        println("El precio del scooter es: ${getScooter()}")
    }

    measureTimeMillis {
        runBlocking {
            val total = getPs4() + getScooter()
            delay(1000)
            println("El precio total es: ${total}")
        }
    }

    println()

    measureTimeMillis {
        runBlocking {
            val getPs4 = async { getPs4() }
            val getScooter = async { getScooter() }
            val totalPrice = getScooter.await() + getPs4.await()
            println("El precio total es: $totalPrice")
        }
    }



    Thread.sleep(5500)
}