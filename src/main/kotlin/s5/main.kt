package s5

fun main(){

    //var saludo = { println("Gonzalo")}
    //saludo

    /*
    var suma = {a: Int, b: Int -> a + b}
    println(suma(5, 5))

    var presentarse : (String, Int) -> String = {name, age -> "Mi nombre es $name y tengo $age"}

    println(presentarse("Gonzalo", 21))

     */

    //var square: (Int) -> Int = {it * it}
    //println(square(5))

    val saverGrade: (Double,Double) -> String = { expected: Double, saved: Double ->
        val percentage = saved / expected

        when {
            percentage > 1  -> "Ahorrador pro"
            percentage == 1.0   -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else     -> "aprendiz saver"
        }
    }

    //println(saverGrade(100.0,120.0))

    // FUNCIÓN ANONIMA
    val saverGrade2 =  fun(expected: Double, saved: Double): String {
        val percentage = saved / expected

        return when {
            percentage > 1  -> "Ahorrador pro"
            percentage == 1.0   -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else     -> "aprendiz saver"
        }
    }

    //println(saverGrade2(100.0, 120.0))


    // FUNCIONES DE ORDEN SUPERIOR
    fun calculadora(a: Int, b: Int, operacion:(Int, Int) -> Int): Int {
        return operacion(a, b)
    }

    fun suma(a: Int, b: Int) = a + b
    // los dos :: significa que se le pasan los mismos valores a la funcion que ya estan
    val suma = calculadora(10, 5, ::suma)
    println(suma)

    fun resta(a: Int, b:Int) = a - b
    val resta = calculadora(10, 5, ::resta)
    println(resta)

    fun multiplicacion(a: Int, b:Int) = a * b
    val multi = calculadora(10, 5, :: multiplicacion)
    println(multi)
}