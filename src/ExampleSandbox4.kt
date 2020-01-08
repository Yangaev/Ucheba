/*
Использование ключевого слова it
 */
fun main() {
    val greetingFunction:(String)-> String = {
        val currentYear = 2018
        "Добро пожаловать в СимВиллаж, $it! ($currentYear)"
    }
    println(greetingFunction("Жора"))
}