package s4parte2

fun main() {
    //prueba a monterrey exitosa
    val viajeMonterrey = National("Monterrey")
    viajeMonterrey.quotePrice(2)
    viajeMonterrey.reserve(4)

    //viaje inexistente
    val viajeMonclova = National("Monclova")
    viajeMonclova.quotePrice(3)

    //viaje en temporada baja
    val viajeBajaMonterrey = NationalLowSeason("Monterrey")
    viajeBajaMonterrey.reserve(4)
    viajeBajaMonterrey.getDiscountPrice(10)

    val viajeBajaGdl = NationalLowSeason("Guadalajara")
    viajeBajaGdl.reserve(4)
    viajeBajaGdl.cancelledTravel()
    viajeBajaGdl.cancelledTravel()
    viajeBajaGdl.reserve(2)
}