/*
Присваивание переменной анонимной функции
 */
fun main() {
    val greetingFunction:()->String = {
        val currentYear = 2018
        "Добро пожаловать в СлимВиллаж, Мэр $currentYear"
    }
    println( greetingFunction())
}