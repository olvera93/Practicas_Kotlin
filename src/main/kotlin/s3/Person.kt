package s3

class Person {
    var nombre: String = ""
    var apellidos: String = ""
    var sexo: String = ""
    var altura: Float = 0f

    constructor(nombre:String, apellidos: String, sexo: String, altura: Float) {
        this.nombre = nombre
        this.apellidos = apellidos
        this.sexo = sexo
        this.altura = altura

        println("""Los datos de la pesona son:
            nombre: ${this.nombre}
            apellidos: ${this.apellidos}
            sexo: ${this.sexo}
            altura: ${this.altura}""")
    }


}