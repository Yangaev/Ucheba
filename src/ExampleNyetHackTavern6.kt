//Извлечение имени трактирщика
//Объявляем константу
const val TAVERN_NAMES = "Безрассудств'о таернила"
fun main() {
placeOrder()
}
private fun placeOrder(){
    val indexOfApostrophe = TAVERN_NAMES.indexOf('\'')
    val tavernMasters = TAVERN_NAMES.substring(0 until indexOfApostrophe)
    println("Мадригал рассказывает $tavernMasters о своем заказе")
}