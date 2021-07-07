package s7.r2

import java.lang.ArithmeticException
import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main() {
    println("Parte #1")
    fun divide(number1: Int, number2: Int): Int {
        var result: Int
        try {
            result = number1 / number2
        } catch (e: ArithmeticException) {
            println(e)
            result = 0
        }
        return result
    }
    println("Primera division, el resultado es: ${divide(25, 5)}")
    println("Segunda division, el resultado es: ${divide(25, 0)}")
    println()

    println("Parte #2")
    val person = Person(
        name = "Gonzalo", visitedCities = listOf("España", null, "Belgica")
    )
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
    person.visitedCities?.forEach {
        try {
            println("Cities --> ${it ?: throw NullPointerException("Hay una ciudad que no existe")}")
        } catch (e: NullPointerException){
            println(e)
        }
    }
    println()
    val person2 = Person()
    try {
        val person3 = person2.name ?: fail("No existe el nombre")
    } catch (e: java.lang.IllegalArgumentException){
        println(e)
    }
}