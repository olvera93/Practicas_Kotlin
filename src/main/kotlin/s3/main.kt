package s3

fun main() {

    val myPhone = Phone()

    /*myPhone.getTurn()
    myPhone.turnOn()
    myPhone.getTurn()*/

    /*val myCar = Car("Rojo", "Nissan", "Versa", "UI54W")

    println(myCar.marca)

    println("El coche esta encendido: ${myCar.encendido}")
    myCar.encender()
    println("El coche esta encendido: ${myCar.encendido}")

    println("La cantidad de gasolina que tiene el coche es: ${myCar.gasolina} litros")
    println("Cuántos litros de gasolina deseas?")
    val litro = readLine()!!.toFloat()
    myCar.recargar(litro)
    println("La cantidad de gasolina que tiene el coche es: ${myCar.gasolina} litros")
    */

    //val person = Person("Gonzalo", "Olvera", "Masculino", 1.68f)

    val mario = Mario()

    for (i in 1..5){
        if (mario.isLive){
            mario.collision("Goomba")
            println("Tienes: ${mario.getLives()}")
            mario.collision("Star")
        }
    }




}