
// ovo je kao init kod Swifta
class Car constructor(make: String, model: String, var color: String) {
    val make = make
    val model = model

    fun accelerate() {
        println("WROOM WROOOM")
    }

    fun details() {
        println("This is a $color $make $model")
    }
}

// skraceno
class Car1 (make: String, model: String) {
    val make = make
    val model = model
}

// jos krace
class Car2 (val make: String, val model: String) {
    // nesto da radi
}

class Truck (val make: String, val model: String, val towingCapacity: Int) {
    fun tow() {
        println("Taken the horses to the rodeo")
    }

    fun details() {
        println("The $make $model has a towing capacity of $towingCapacity kg.")
    }
}


// Nasledjivanje,
// da bi bilo moguce mora se ubaciti OPEN
open class Vozilo(val marka: String, val model: String) {

    // ovde OPEN omogucava override
    open fun ubrzaj() {
        println("VROOOOOOM")
    }

    fun parkiraj() {
        println("Parkiranje")
    }

    fun koci() {
        println("Kocenje")
    }
}
// morad da se napravi konstruktor koji ce obavezno da ima super konstruktor + ako treba dodatni argument
class Auto(marka: String, model: String, var boja: String): Vozilo(marka, model) {
    override fun ubrzaj() {
        println("SHHHHHHHHH")
    }
}

class Kamion(model: String, marka: String, val nosivost: Int) : Vozilo(marka, model) {
    fun istovar() {
        println("Iskipuj sadrzaj kamiona")
    }
}

fun main() {
    val carDemo = CarDemo("80","Audi")

    val car = Car("Toyota", "Avalon", "red")

    println(car.make)
    println(car.model)

    car.accelerate()
    car.details()

    val truck = Truck("Ford", "F-150", 10000)
    truck.tow()
    truck.details()


    val auto = Auto("Tesla", "ModelS", "Crvena")
    auto.ubrzaj()

    val kamion = Kamion("F-150 ","Ford", 10000)
}