package e3

import kotlinx.coroutines.*

suspend fun getInventary(productId: Int): Int {
    println("Buscando producto en el inventario...")
    delay(2000)
    val stock = (0..99).random()
    println("producto identificado, en stock: $stock")
    return stock
}

// Primera Parte
/*
fun main() {

    GlobalScope.launch { getInventary(1) }
    Thread.sleep(2500)
}
 */

// Segunda Parte
/*
fun main(): Unit = runBlocking {
    getInventary(1)
}
 */

//Tercera Parte
/*
fun main() = runBlocking {
   val job = GlobalScope.launch {
        delay(1000)
        println("Mundo")
    }
    println("Hola")
    job.join()
}
 */
/*
// Cuarta Parte
fun main() = runBlocking {
    /*
    launch {
        delay(1000)
        println("Mundo")
    }
    println("Hola")
     */

    val buyJob = launch { Dispatchers.Default
        var percentage = 0

        while (percentage < 100) {
            println("procesando pago: $percentage%")
            delay(500)
            percentage += 10
        }
        println("Pago exitoso")
    }

    delay(2000)
    buyJob.cancel()
}

 */


fun main() = runBlocking {
    withTimeout(10_000L) {
        repeat(30) { i ->
            println("Descargando $i% ...")
            delay(300L)
        }
    }
}