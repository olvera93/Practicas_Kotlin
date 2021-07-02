import r1.SmartWatch

fun main() {

    println()
    val smartWatch = SmartWatch(5000F,"Samsung", "S89-674")
    println("El total a pagar es: ${smartWatch.getTotalPrice(3)}")

}