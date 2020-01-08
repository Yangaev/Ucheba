/*
Добавление параметра playerName в анонимную функцию
 */
fun main() {
    val greetingFunction:(String)->String = {playerName ->
        val currentYear = 2018
        "Добро пожаловать в СлимВиллаж, $playerName! ($currentYear)"
    }
    println( greetingFunction("Гриша"))
}