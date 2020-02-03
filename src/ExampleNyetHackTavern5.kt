//Использование оператора ?: (Элвис)
fun main() {
    var bevarrage = readLine()
    if(bevarrage!=null){
      bevarrage = bevarrage.capitalize()
    }else{
        println("Я не могу сделать этот напиток без сбоев - напиток был нулевым")
    }
    val bevarrgeServerd:String = bevarrage?:"Эль"
    println(bevarrgeServerd)
}