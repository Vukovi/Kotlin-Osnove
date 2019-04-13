fun main() {


    val a = 2
    val b = 2

    if (a == b) {
        println("A je jednako B")
    }

    if (a != b) {
        println("A nije jednako B")
    }

    if (a >= b) {
        println("da")
    } else {
        println("ne")
    }


    val x = 1

    // when je isto sto i switch u swiftu
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("ovo je defaultna vrednost")
    }



}