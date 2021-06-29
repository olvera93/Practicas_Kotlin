package s4

class Goomba(name: String, strength: Int):
    Enemy(name,strength){

    init {
        println("iniciando subclase de $name")
    }

    override fun collision(collider: String) {
        super.collision(collider)
        println("Override")
    }
}
