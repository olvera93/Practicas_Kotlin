package s5

// RECOMENDADO PERO SIN EL noninline
inline fun nonInLineFun(inLined: () -> Unit, noinline nonInLined: () -> Unit) {
    println("Antes de correr la función recibida")
    inLined()
    println("Después de correr la función recibida")
    nonInLined()
}

fun main() {

    // NO RECOMENDADO
    fun nonInLined(runLambda: () -> Unit) {
        println("Antes de correr la función recibida")
        runLambda()
        println("Después de correr la función recibida")
    }

    nonInLined {
        println("Llamando a la funcion nonInLined")
    }

    nonInLineFun(
    { println("Llamando a la funcion inLine")},
    { println("Llamando a la funcion nonInLined") }
    )

}