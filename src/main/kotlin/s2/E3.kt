package s2

fun main() {
    for(i in 1..5) {
        //println(i)
    }

    for(i in 1 until 5) {
        //println(i)
    }

    for(i in 0..10 step 2) {
        //println(i)
    }

    val nombres = listOf(
        "Kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Link",
        "Captain Falcon",
        "Samus",
        "Pikachu",
        "Jigglypuff",
        "Donkey Kong",
        "Yoshi"
    )

    for(nombre in nombres){
        println(nombre)
    }

    nombres.forEach { println(it) }

    for (nombre in  nombres){
        println(nombre)
        if (nombre == "Link"){
            println("Personaje encontrado")
            break
        }
    }

    var x = 20

    /*
    while (x > 20) {
        println(x)
        x--
    }*/
}