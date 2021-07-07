package s7.r1

class Person(private val name: String,
             private val lastName: String? = null) {


    fun getLastName(): String {
        val lName = lastName ?: throw IllegalArgumentException("No se encontró el apellido")
        return lastName
    }

    fun getName(): String {
        val fName = lastName ?: throw IllegalArgumentException("Necesitas escribir los apellidos")
        return "$name $fName"
    }

}