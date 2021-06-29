package s2

fun main() {

    //verifyAge()
    gradoEscolar()
}

fun verifyAge() {
    println("Ingresa la edad y da enter: ")
    val age = readLine()?.toInt()

    /*if (age!! > 18) {
        println("Ya eres mayor de edad")
    }else if(age!! == 18){
        println("Acabas de cumplir 18 años")
    } else {
        println("Eres menor de edad")
    }*/

    when {
        age!! > 18 -> {
            println("Ya eres mayor de edad")
        }
        age!! == 18 -> {
            println("Acabas de cumplir 18 años")
        }
        else -> {
            println("Eres menor de edad")
        }
    }
}

fun gradoEscolar() {
    print("Ingrese edad y presiona enter (escribe sólo el número): ")
    val age = readLine()?.toInt()

    when(age) {
        0 -> println("Apenas eres recién nacido!")
        1 -> println("Sólo tienes un año de edad")
        in 2..5 -> println("Estás en preescolar")
        in 2..5 -> println("Estás en preescolar")
        in 6..11 -> println("Estás en la primaria")
        in 12..14 -> println("Estás en secundario")
        in 15..17 -> println("Estás en bachillerato")
        in 18..25 -> println("Estás en la universidad")
        else -> {
            println("El SAT te está buscando")
        }
    }
}