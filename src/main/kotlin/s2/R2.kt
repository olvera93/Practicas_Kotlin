package s2

fun main() {
    println("Ejercicio #1")
    print("Ingresa el primer lado del triangulo: ")
    val lado1 = readLine()!!.toInt()
    print("Ingresa el segundo lado del triangulo: ")
    val lado2 = readLine()!!.toInt()
    print("Ingresa el tercer lado del triangulo: ")
    val lado3 = readLine()!!.toInt()
    println()
    triangulo(lado1, lado2, lado3)

    println()

    println("Ejercicio #2")

    identificarDato(3.1f)

}

fun triangulo(lado1: Int, lado2: Int, lado3:Int) {
    if((lado1 == lado2) && (lado2 == lado3)){
        println("Es un triangulo Equilatero")
    } else if(
        (lado1 == lado2) && (lado3 != lado1) ||
        (lado2 == lado3) && (lado1 != lado2) ||
        (lado3 == lado1) && (lado2 != lado3)) {
        println("Es un triángulo isóceles")
    } else {
        println("Es un triángulo escaleno")
    }
}

fun identificarDato(dato: Any){

    when(dato) {
        is String -> println("Es un String")
        is Int -> println("Es un entero")
        is Double -> println("Es un doble")
        else -> {
            println("Es otro tipo de dato")
        }
    }
}

