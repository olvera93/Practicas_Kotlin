package r1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    println("Inicia")

    /*
    Sale un error:
    should be called only from a coroutine or another suspend function
     */
    //delay(1000)

    GlobalScope.launch {
        println("Delay")
        Thread.sleep(100)
    }

    /*

     */
}