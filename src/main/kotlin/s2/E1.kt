package s2

import kotlin.math.pow

const val PI = 3.1416F
const val PHI = 1.618F

fun main () {
    val radius = 4F
    val area = circleArea(radius)
    println(area)

    printName("Gonzalo")

    printAge(21)

    getPi()

    val session = login("Gonzalo", "1234")
    println("Usuario loggeado? $session")

    //Correr area rectangulo con los valores por defecto
    println("Area con valores por defecto: ${rectanguleArea()}")

    //Area del rectangulo con base seteada y altura por defecto
    println("Area con base por defecto: ${rectanguleArea(10.0)}")

    //Area del rectangulo con base seteada y altura por defecto
    println("Area con altura por defecto: ${rectanguleArea(height = 10.0)}")

    //Area del rectangulo con base seteada y altura por defecto
    println("Area con datos determinados con named arguments: ${rectanguleArea(2.0, 3.5)}")
}

fun circleArea(radius: Float): Float {
    return PI * radius.pow(2)
}

fun printName(name: String) {
    println("Mi nombre es $name")
}

fun printAge(age: Int){
    println("Tengo $age años")
}

fun getPi(): Float {
    return PI
}

fun login(user: String, password: String): Boolean {
    fun validate(input: String): Boolean {
        if(input.isEmpty()){
            return false
        }
        return true
    }
    val userValidate = validate(user)
    val passValidate = validate(password)

    return userValidate && passValidate
}

fun rectanguleArea(base: Double = 20.0, height: Double = 30.0): Double {
    return base * height
}