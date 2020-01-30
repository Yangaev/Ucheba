// Использование let с оператором безопасного вызова
fun main() {
    var bevarage = readLine()?.let {
//        Если строка не пустая то печатаем с заглавной буквы
        if (it.isNotBlank()){
            it.capitalize()
        }else{
            "Эль с маслом"
        }
    }
    println(bevarage)
}