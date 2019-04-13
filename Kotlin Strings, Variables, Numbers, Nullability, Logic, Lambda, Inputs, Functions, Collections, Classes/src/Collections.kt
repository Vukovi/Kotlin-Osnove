fun main() {


    // Kotlin nema svoje kolekcije, vec koristi javine koje ekstenduje

    val imperialsImutable = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperialsImutable.sorted())
    println(imperialsImutable[1])
    println(imperialsImutable)
    println(imperialsImutable.first())
    println(imperialsImutable.last())
    println(imperialsImutable.contains("Darth Vader"))

    val rebelsMutable = arrayListOf("Leyah", "Luke", "Han Solo", "Mon Mothma")
    println(rebelsMutable.size) // 4
    rebelsMutable.add("Chewbacca")
    rebelsMutable.add(0,"Luke")
    println(rebelsMutable.indexOf("Han Solo"))

    val rebeleVehiclesMapImutqble = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebeleVehiclesMapImutqble["Solo"])
    println(rebeleVehiclesMapImutqble.get("Solo"))
    println(rebeleVehiclesMapImutqble.getOrDefault("Leyah", "This vehicle doesn't exist."))
    println(rebeleVehiclesMapImutqble.values)

    val rebelVehicleMutable = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicleMutable["Luke"] = "XWing"
    rebelVehicleMutable.put("Leyah", "Tantive IV")
    rebelVehicleMutable.remove("Boba Fett")
    rebelVehicleMutable.clear()
    rebelVehicleMutable.isEmpty()

}