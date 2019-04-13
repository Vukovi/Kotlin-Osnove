fun main(args: Array<String>) {

    var name = "Vuk"

    val pi: Double = 3.14   // val je isto sto i let

    print("Upisi svoje prezime:")
    var prezime = readLine() // procitaj ono sto ce korisnik da napise i tekonda pustaj izvrsenje dalje
    println("Korisnik se zove: " + name + " "+ prezime)

    print("Upisi svoje godine:")
    var age: Int = readLine()!!.toInt()  // readline je string pa cemo ga pretvoriti u int, a mora i da se unwrapuje sa !!
    println("Korisnik ima " + age + " godina.")

    val doubleNum = 123.45   // 64 bit
    val floatNum = 123.45f   // 32 bit
    val longNum = 12345656789345345L // 64 bit

    val doubleNumString = doubleNum.toString()

}