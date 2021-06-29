package s3

class Car {

    var color: String = ""
    var marca: String = ""
    var modelo:String = ""
    var placas: String = ""
    var encendido = false
    var gasolina = 0f

    init {
        println("Los datos son: $marca $modelo")
    }

    /*constructor (marca: String, color: String, modelo: String){
        this.marca = marca
        this.color = color
        this.modelo = modelo
        this.placas = "65I6UN"
    }

    constructor (marca: String, color: String, modelo: String, placas: String){
        this.marca = marca
        this.color = color
        this.modelo = modelo
        this.placas = placas
    }*/

    constructor(marca:String, modelo: String, color: String){
        this.marca = marca
        this.modelo = modelo
        this.color = color
        println("""Los datos del coche son:
            marca: ${this.marca}
            modelo: ${this.modelo}
            color: ${this.color}""")
    }

    constructor(marca:String, modelo: String, color: String, placas: String): this(marca,modelo,color){
        this.placas = placas
        println("las placas son: ${this.placas}")
    }




    fun encender(){
        encendido = true
    }

    fun apagar(){
        encendido = false
    }

    fun recargar(litros: Float) {
        gasolina += litros
    }
}