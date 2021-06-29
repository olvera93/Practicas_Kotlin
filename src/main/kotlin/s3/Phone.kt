package s3

class Phone {

    var isOn = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun getTurn() {
        val turnMode = if (isOn) "Encendido" else "Apagado"
        println("El télefono está $turnMode")
    }
}