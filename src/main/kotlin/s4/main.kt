package s4

fun main () {

    val enemy = Goomba("Enemigo", 2)

    enemy.collision("Enemy")
    enemy.collision("Weapon")

    val enemy2 = Koopa("Koopa", 2)

    enemy2.collision("Enemy")
    enemy2.collision("Weapon")

    val enemy3 = KoopaVolador()

    enemy3.collision("Enemy")
    enemy3.collision("Weapon")



}
