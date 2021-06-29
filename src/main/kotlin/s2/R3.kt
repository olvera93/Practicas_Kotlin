package s2

fun main() {

    println("Ejercicio #1")
    val nameCount = countName("Ariadna")
    println("Tu nombre se encontró $nameCount veces")

    println()
    println("Ejercicio #2")
    var x = 20
    do {
        x--
        println(x)

    } while (x > 0)
}

fun countName(name: String): Int {
    val nombres = listOf(
        "Pedro Luis",
        "Juan Manuel",
        "Juan Luis",
        "María Inés",
        "Romeo",
        "Ernesto",
        "Juan Pedro",
        "Ariadna",
        "Mireya María",
        "Ana Sofía",
        "José Juan"
    )
    var count = 0

    for (i in nombres){
        if (name in i){
            count++
        }
    }
    return count
}

