package s4Extra

abstract class Person(name: String) {
    init {
        println("Mi nombre es $name")
    }

    fun mostrarId(id: Int) {
        println("Mi id es: $id")
    }

    abstract fun mostrarEmpleo(empleo: String)
}

class Teacher(name: String): Person(name) {
    override fun mostrarEmpleo(empleo: String) {
        println(empleo)
    }

}

fun main() {
    val person = Teacher("Gonzalo")
    person.mostrarEmpleo("Programador")
    person.mostrarId(12)
}