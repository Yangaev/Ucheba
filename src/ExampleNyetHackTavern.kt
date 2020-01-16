/*
Ипользуем оператор безопасного вызова
 */
fun main() {
//   считываем строку в переменную
//    var beverage = readLine()
//    Переводи в пропись
    var beverage = readLine()?.capitalize()
    println(beverage)
}