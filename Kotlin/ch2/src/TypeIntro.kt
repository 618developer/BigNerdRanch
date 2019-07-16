const val MAX_EXPERIENCE: Int = 5000 //compiler time constant

fun main(args: Array<String>) {
    //var experiencePoints: Int = "thirty-two" <- error as inferred type is String
    //val playerName: String = "Estragon" <- see below
    //playerName = "Madrigal" <- val cannot be reassigned
    var playerName: String = "Estragon"
    var experiencePoints: Int = 5
    /*
    Challenge: hasSteed
     */
    var hasSteed: Boolean = false

    /*
    Challenge: The Unicorn's Horn
     */
    var pubName: String = "Unicorn's Horn"
    var goldPieces: Int = 50
    var publicanName: String = "Moe"
    var menu = listOf("mead","wine","LaCroix")
    /*
    Challenge: Magic Mirror
     */
    playerName = playerName.reversed()
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
}