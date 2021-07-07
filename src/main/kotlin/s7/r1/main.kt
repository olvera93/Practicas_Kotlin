package s7.r1

fun main () {

    println("Parte 1")
    val names: List<String?> = listOf("Name One", null, "Name Three")
    names.forEach { if (it != null) println(it) }

    println()
    println("Parte 2")
    names.forEach {
        val resultadoConElvis = it?: "Texto vacio"
        println(resultadoConElvis)
    }

    println()
    println("Parte 3")

    val person1 = Person("Gonzalo", "Olvera")
    println(person1.getName())
    println(person1.getLastName())
    val person2 = Person("Paco")
    println(person2.getName())
    println(person2.getLastName())



}