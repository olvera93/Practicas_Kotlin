package s2
import kotlin.math.roundToInt

fun main () {
    //Correr area rectangulo con los valores por defecto
    println("Ejercicio #1")
    println("Area con valores por defecto: ${rectanguleArea()}")

    println()
    println("Ejercicio #2")
    val base = 20f
    val altura = 3f
    val ancho = 5f

    println("El volumen del prisma rectangular es: ${volumenPrisma(base, altura, ancho)}")

    println()

    println("Ejercicio #4 y 5")

    println("El promedio sin redondear  es: ${promedio(cali3 = 9f)}")
    println("El promedio es: ${promedio(cali3 = 9f).roundToInt()}")
}

fun rectanguleArea2(base: Float = 20.0f, height: Float = 30.0f): Float {
    return base * height
}

fun volumenPrisma(base: Float, altura: Float, ancho:Float): Float {
    return rectanguleArea2(base, altura) * ancho
}

fun promedio(cali1: Float = 8f, cali2: Float = 6f, cali3: Float): Float {
    return (cali1 + cali2 + cali3) / 3f
}