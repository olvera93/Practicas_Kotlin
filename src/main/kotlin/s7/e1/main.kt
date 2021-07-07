package s7.e1

fun main () {

    var text: String? = "Hola"
    text = null

    /*
    if (text != null && text.length > 0) {
        println("nullableText tiene ${text.length} caracteres")
    } else {
        println("nullableText esta vacio")
    }
     */

    //println(text?.length)

    /*If normal vs if ternario -> otros lenguajes de programacion
    var res
    if (5 > 7) {
        res = "Si"
    } else {
        res = "No"
    }

  val res = 5 > 6 ? "Si": "No";
     */

    val nullableText: String? = null
    val resultadoSinElvis = if (nullableText != null) nullableText else "Texto vacio"
    println(resultadoSinElvis)

    val resultadoConElvis = nullableText ?: "Texto vacio"
    println(resultadoConElvis)
}