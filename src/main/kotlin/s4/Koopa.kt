package s4

open class Koopa(name: String, strength: Int):
Enemy(name,strength){

        init {
            println()
            println("Iniciando subclase de $name")
        }

    protected open var state = "Walking"
        set (value) {
        field = value
        println("El estado es: $field")
    }

    override fun collision(collider: String) {
        when(collider) {
            "Weapon" -> {
                state = "Shell"
                if (state == "Shell"){
                    die()
                } else {
                    state = "Shell"
                }
            }
            "Enemy" -> changeDirection()
        }
    }
}