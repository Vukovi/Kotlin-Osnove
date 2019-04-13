fun main() {

    // Lambda je slicna klozeru u Swiftu
    val printMessage = { message: String -> println(message) }


    printMessage("Pozdrav")


    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(5,6))

    val sumB: (Int, Int) -> Int = { x,y -> x + y }
    println(sumB(5,6))


    // async task, UNIT je isto sto i VOID u Swiftu
    fun downloadData(url: String, completion: () -> Unit) {
        // poslat download request
        // dobijam data-u
        // nema error-a
        completion()
    }

    downloadData("fakeUrl.com",{
        println("Ovaj blok ce se obaciti posle completion()-a")
    })


    fun downloadCarData(url: String, comppletioon: (Auto) -> Unit) {
        // poslat download request
        // dobijam data-u
        // nema error-a
        val auto = Auto("Tesla", "ModleX", "plava")
        comppletioon(auto)
    }

    downloadCarData("fakeUrl.com"){automobil ->
        println(automobil.boja)
        println(automobil.marka)
        println(automobil.model)
    }

    downloadCarData("fakeUrl.com"){
        println(it.boja)
        println(it.marka)
        println(it.model)
    }

    fun downloadTruckData(url: String, completion: (Kamion?, Boolean) -> Unit) {
        // poslat download request
        val webRequestSuccess = true
        if (webRequestSuccess) {
            // dobijam data-u
            // nema error-a
            val kamion = Kamion("F-150", "Ford", 10000)
            completion(kamion,true)
        } else {
            completion(null,false)
        }
    }

    downloadTruckData("fakeUrl.com") { kamion, success ->
        if (success == true) {
            // nesto uradi sa ovim
            kamion?.istovar()
        } else {
            // hendluj error
            println("Nesto je krenulo lose")
        }
    }
}