fun main(args: Array<String>) {
    val name = "Madrigal"
    //var healthPoints = 100
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    // Aura
    //if (isBlessed && healthPoints > 50 || isImmortal) {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
//    if (auraVisible) {
//        println("Green")
//    } else {
//        println("NONE")
//    }
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    println(auraColor)
    //if (healthPoints == 100) {
    val healthStatus = if (healthPoints == 100) {
        //println(name + " is in excellent condition!")
        "is in excellent condition!"
        //} else if (healthPoints >= 90) {
    } else if (healthPoints in 90..99) {
        //println(name + " has a few scratches.")
        "has a few scratches"
        //} else if (healthPoints >= 75) {
    } else if (healthPoints in 75..89) {
        if (isBlessed) {
            //println(name + " has some minor wounds but is healing quite quickly!")
            "has some minor wounds but is healing quite quickly!"
        } else {
            //println(name + " has some minor wounds.")
            "has some minor wounds."
        }
        //} else if (healthPoints >= 15) {
    } else if (healthPoints in 15..74) {
        //println(name + " looks pretty hurt.")
        "looks pretty hurt."
    } else {
        //println(name + " is in awful condition!")
        "is in awful condition!"
    }

    // Player status
    println(name + " " + healthStatus)
}