package s7.r1

class Person(
    val name:String? = null,
    private val lastName:String? = null){

    fun getFullName(): String {
        val lName =  lastName ?: throw IllegalArgumentException("Necesitas apellidos")
        return "$name $lName"
    }
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
    fun getLastName() : String {
        val lName = lastName ?: return "No se encontró apellido"
        return lName
    }
}