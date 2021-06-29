package s4

class KoopaVolador: Koopa("Koopa Volador", 3){

    override var state = "Flyin"
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
                } else if (state == "Walking"){
                    state = "Shell"
                } else {
                    state = "Walking"
                }
            }
            "Enemy" -> changeDirection()
        }
    }
}