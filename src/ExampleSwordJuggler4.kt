import java.lang.IllegalStateException

// Добавление оператора try/catch
fun main() {
    var swordJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last()==3
    if (isJugglingProficient){
        swordJuggling =2
    }
//    Обрабатываем исключение с помощью try/catch
    try {
        proficiencyChecs(swordJuggling)
        swordJuggling=swordJuggling!!.plus(1)
    }catch (e:Exception){
        println(e)
    }
    println("Ты жанглируешь $swordJuggling мечами")
}
fun proficiencyChecs(swordsJuggling:Int?){
    swordsJuggling?:throw UnskilledSwordJugglerExeptions()
}
class UnskilledSwordJugglerExeptions():
        IllegalStateException("Исключение - Игрок не может жанглировать")