fun main(args: Array<String>) {
   // Escape String & Raw String

    // Escape string
    val str = "vuk knezevic"
    println(str) // vuk knezevic

    val str1 = "Escaping string znaci da string moze da se presece \n \b \r itd "
    println(str1)
    /*
    Escaping string znaci da string moze da se presece
    itd
    */

    val rawStr = """ OVO moze da prenosi
        |u drugi red
        |tako da je
        |vidiljv od ove uspravne linije.
    """.trimMargin()
    println(rawStr)
    /*
    OVO moze da prenosi
    u drugi red
    tako da je
    vidiljv od ove uspravne linije.
    */

    val istinito = str.contentEquals("vuk")
    println(istinito) // true

    val num = 6
    val stringNum = num.toString()
    println(stringNum) // 6

    val subsequence = str.subSequence(4,8)
    println(subsequence) // knez

    val luke = "Luke Skywalker"
    val lightsaber = "green"
    println("$luke has a $lightsaber lightsaber.") // Luke Skywalker has a green lightsaber.

}