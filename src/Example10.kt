//read file to list

import java.io.File
const val TAVERN_NAME = "Taernyl's Folly"

val patronList = mutableListOf("Eli", "Mordoc", "Sophie")
val lastName = listOf("Ironfoot", "Fernsworth", "Baggins")
val uniquePatrons = mutableSetOf<String>()
val menuList = File("data/tavern-menu-data.txt")
    .readText()
    .split("\n")
val patronGold = mutableMapOf<String, Double>()

fun main(args:Array<String>) {

   menuList.forEachIndexed { index, data ->
       println("$index : $data")
   }
    if (patronList.contains("Eli")) {
        println("The tavern master says: Eli's in the back playing cards.")
    } else {
        println("The tavern master says : Eli isn't here.")
    }

    if (patronList.containsAll(listOf("Sophie", "Mordoc"))) {
        println("The tavern master says: Yea, they're seated by the stew kettle.")
    } else {
        println("The tevern master says: Nay, they departed hours ago.")
    }

//   random visitors generation
    (0..9).forEach {
        val first = patronList.random()
        val last = lastName.random()
        val name = "$first $last"
//        println("Вывод 10 случайных посетителей $name")
        uniquePatrons += name
    }
    println("Уникальность через множество $uniquePatrons")


    uniquePatrons.forEach {
        patronGold.put(it, 6.0)
    }
//Используем цикл while
    var orderCount = 0
    while (orderCount <= 9) {
        placeOrder(
            uniquePatrons.random(),
            menuList.random()
        )
        orderCount++
    }
}

fun performPurchase(price: Double, patronName: String) {
    val totalPurse = patronGold.getValue(patronName)
    patronGold[patronName] = totalPurse - price
}

private fun placeOrder(patronName: String, menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("$patronName speaks with $tavernMaster about their order.")

    val (type, name, price) = menuData.split(',')
    val message = "$patronName buys a $name ($type) for $price."
    println(message)

    performPurchase(price.toDouble(), patronName)

    val phrase = if (name == "Dragon's Breath") {
        "$patronName exclaims ${toDragonSpeak("Ah, delicious $name!")}"
    } else {
        "$patronName says: Thanks for the $name."
    }
    println(phrase)
}

private fun displayPatronBalances() {
    patronGold.forEach { patron, balance ->
        println("$patron, balance: ${"%.2f".format(balance)}")
    }
}
private fun toDragonSpeak(phrase: String) =
    phrase.replace(Regex("[aeiou]")) {
        when (it.value.toLowerCase()) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
    }
