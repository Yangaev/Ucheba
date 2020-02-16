//Сравнение строк в placeOrder
const val TAVERNS_NAMS = "Bill's Beggins"
fun main() {
placeOrder("shandy,Dragon's Breath, 5.91")
}
private fun placeOrder(menuData:String){
    var indexApostraph = TAVERNS_NAMS.indexOf('\'')
    val tavernMaster = TAVERN_NAMS.substring(0 until indexApostraph)
    val (type,name,price) = menuData.split(',')
    val message = "Мадригал делает заказ у $tavernMaster: $type $name по цене $price"
    println("Мадригал рассказывает про свой заказ $tavernMaster")
    println(message)
//    сравниваем строки для фразы на драконьем языке
    val phrase = if(name =="Dragon's Breath"){
        "Мадригал восклицает ${toDragonSpeak("Ах, какой вкусный $name ")}"
    }else {
        "Мадригал говорть: Спасибо за $name"
}
    println(phrase)
}
private fun toDragonSpeak(phrase:String) =
    phrase.replace(Regex("[ахко]")){
        when (it.value){
            "а" ->"4"
            "х" -> "3"
            "к" -> "1"
            "о" -> "|_|"
            else -> it.value
        }
    }