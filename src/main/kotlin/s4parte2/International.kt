package s4parte2

class International(override val city: String, override val country: String): Travel() {

    private val germanyFees =  mapOf(
        "Munich" to 980,
        "Berlín" to 820,
        "Francfort" to 850
    )

    private val chileFees =  mapOf(
        "Santiago" to 643,
        "Valparaíso" to 721
    )

    private val canadaFees =  mapOf(
        "Vancouver" to 620,
        "Ottawa" to 680,
        "Montreal" to 600
    )

    val taxGermany = 0.16
    val taxChile = 0.05
    val taxCanada = 0.1

    override fun getPrice(numDays: Int): Int {
        when (country) {
            "Alemania" -> {
                val feeGermany = germanyFees[city] //obtenemos la tarifa según la ciudad
                if (feeGermany == null){
                    return 0
                } else{
                     return (feeGermany * numDays * (1 + taxGermany)).toInt()
                }
            }

            "Chile" -> {
                val feeChile = chileFees[city] //obtenemos la tarifa según la ciudad
                if (feeChile == null){
                    return 0
                } else{
                    return (feeChile * numDays * (1 + taxGermany)).toInt()
                }
            }

            "Canada" -> {
                val feeCanada = canadaFees[city] //obtenemos la tarifa según la ciudad
                if (feeCanada == null){
                    return 0
                } else{
                    return (feeCanada * numDays * (1 + taxGermany)).toInt()
                }
            }
            else -> {
                println("NO EXISTE EL PAÍS")
                return 0
        }

        }
    }
}