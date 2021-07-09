package s7.e3

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    if ("obj" is String) {
        println("No String")
    }

    fun imprimirNumero(x: Any) {
        when (x) {
            is Int -> println(x / 1)
            is String -> println(x.length)
            is IntArray -> println(x.sum())
        }
    }

    imprimirNumero(20)
    imprimirNumero("asereje")
    imprimirNumero(intArrayOf(2,4,6))

    val obj: Any? = null
    // unsafe
    //val str: String = obj as String
    //safe
    val strSafe: String? = obj as? String
    println(strSafe)

    val now = Date()
    val formatDate = SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz")
    println("Fecha actual: " + formatDate.format(now))
}