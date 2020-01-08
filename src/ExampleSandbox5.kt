/*
Получение второго аргумента
 */
fun main() {
    val greetingFunction:(String, Int) ->String = {playerName, numBuildings ->
        val currentYear = 2018
        println("Добавленно $numBuildings домов")
        ("Добро пожаловать в СимВеллаж $playerName ($currentYear)")
    }
    println(greetingFunction("Жора", 2))
}