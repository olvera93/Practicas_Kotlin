package s5

fun main() {

    fun obtenerPromocion(precio: Double, cupon: String) {

        val obtenerPrecio: (Double, (Double) -> Double) -> Unit = { precio, operacion ->
            println("El precio actual de tu producto es ${operacion(precio)}")
        }

        val conIva = { precio: Double -> precio * 1.16 }
        val sinIva = { precio: Double -> precio }
        val halfIva = { precio: Double -> 1.08 * precio }
        val minus = { precio: Double -> precio - 100 }
        val promo = { precio: Double ->
            when(precio) {
                in 0.0..1000.0 -> precio * 1.12
                in 1000.0..2000.0 -> precio * 1.04
                in 2000.0..4000.0 -> (precio * 1.16) / 2
                else -> precio / 3
            }
        }

        when(cupon) {
            "NOIVA" -> obtenerPrecio(precio, sinIva)
            "HALFIVA" -> obtenerPrecio(precio, halfIva)
            "MINUS100" -> obtenerPrecio(precio, halfIva)
            "PROMO2020" -> obtenerPrecio(precio, promo)
            else -> obtenerPrecio(precio,conIva)
        }
    }

    obtenerPromocion(1000.0, "JNI")
}
