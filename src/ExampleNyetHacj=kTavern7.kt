//Передача информации о таверне в placeOrder
const val TAVERN ="Bill's Beggins"
fun main() {
placeOrder("shandy, Dreagon's Breath, 5.91")
}
private fun placeOrder(menuData:String){
    val indexOfApostraphe = TAVERN.indexOf('\'')
    val tavernMasters = TAVERN.substring(0 until indexOfApostraphe)
    println("Мадригал рассказывает $tavernMasters о своем заказе")
}