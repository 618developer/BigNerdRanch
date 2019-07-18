fun main(args: Array<String>) {
    val name = "Madrigal"
    //var healthPoints = 100
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    // Aura
    //if (isBlessed && healthPoints > 50 || isImmortal) {
//    if (auraVisible) {
//        println("Green")
//    } else {
//        println("NONE")
//    }
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    //println(auraColor)
    //if (healthPoints == 100) {
//    val healthStatus = if (healthPoints == 100) {
//        //println(name + " is in excellent condition!")
//        "is in excellent condition!"
//        //} else if (healthPoints >= 90) {
//    } else if (healthPoints in 90..99) {
//        //println(name + " has a few scratches.")
//        "has a few scratches"
//        //} else if (healthPoints >= 75) {
//    } else if (healthPoints in 75..89) {
//        if (isBlessed) {
//            //println(name + " has some minor wounds but is healing quite quickly!")
//            "has some minor wounds but is healing quite quickly!"
//        } else {
//            //println(name + " has some minor wounds.")
//            "has some minor wounds."
//        }
//        //} else if (healthPoints >= 15) {
//    } else if (healthPoints in 15..74) {
//        //println(name + " looks pretty hurt.")
//        "looks pretty hurt."
//    } else {
//        //println(name + " is in awful condition!")
//        "is in awful condition!"
//    }
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    // Player status
    //println(name + " " + healthStatus)
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    //castFireball(5)
    castFireball()
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println("(Aura: $auraColor) " + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}

//private fun castFireball(numFireBalls: Int = 2) {
private fun castFireball(numFireBalls: Int = 2) =
    //println("A glass of Fireball springs into existence.")'
    println("A glass of Fireball springs into existence. (x$numFireBalls)")
//}

//private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
//    val healthStatus = when (healthPoints) {
private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
//    return healthStatus
//}