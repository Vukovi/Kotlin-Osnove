fun main() {


    fun forceChoke() {
        println("You have faild me for the last time Admiral...")
    }

    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }

    makeAnEntrance("I find your lack of faith disturbing.")

    fun calculateNumberGoodGuys(rebelels: Int, ewoks: Int) : Int {
        val goodGuys = rebelels + ewoks
        return  goodGuys
    }

    val rebels = calculateNumberGoodGuys(5,7)
    println("Darth Vader faced off against $rebels rebel scum")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(6,8)} rebel scum")

    fun vaderIsFeeling(mood: String = "angry") {
        println(mood)
    }

    vaderIsFeeling() // angry
    vaderIsFeeling("dominant") // dominant


}