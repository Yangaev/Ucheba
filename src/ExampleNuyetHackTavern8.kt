//Объявляем функцию toDragonSpeak - разговор на драконьем
const val TAVERN_NAMS = "Bill's Beggins"
fun main() {
placeOrder("shandy, Dreagon's Breath, 5.91")
}
private fun placeOrder(menuData:String){
    var indexApastraphe = TAVERN_NAMS.indexOf('\'')
    val tavernMaster = TAVERN_NAMS.substring(0 until indexApastraphe)
    val ( type, name,price) = menuData.split(',')
    val message = ("Мадригал покупает у $tavernMaster: $name $type по цене $price")
    println("Мадригал рассказывает $tavernMaster о своем заказе")
    println(message)

    //    Добавляем фразу для Драконьевого языка
    val phrase = "Ах какой вкусный, $name "
    println("Мадригал воскликнул:${toDragonSpeak(phrase)}")
}
//Функция, которая заменяет символы
private fun toDragonSpeak(phrase:String)=
    phrase.replace(Regex("[ахко]")){
        when (it.value){
            "а" ->"4"
            "х" -> "3"
            "к" -> "1"
            "о" -> "|_|"
            else -> it.value
        }
    }
