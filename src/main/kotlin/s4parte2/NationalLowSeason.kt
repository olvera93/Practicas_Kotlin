package s4parte2

class NationalLowSeason(city: String) : National(city),IPromotion, CancelledTravel {
    override  val discount = 10 //es porcentaje, o sea 10%
    override val typeDiscount = 0 //0 para porcentaje, 1 para cantidad

    override fun getPrice(numDays: Int): Int {
        val amount = super.getPrice(numDays)
        return if (amount == 0) 0 else getDiscountPrice(amount)
    }

    override fun cancelledTravel() {
        if (reserved) {
            reserved = false
            paidAmount = 0
            println("Viaje se ha cancelado exitosamente")
        } else {
            println("Este viaje no ha sido reservado")
        }
    }
}