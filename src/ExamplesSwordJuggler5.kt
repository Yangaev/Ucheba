import java.lang.IllegalStateException

//Использование функции checkNotNull проверки условий
fun main() {
    var swordJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient){
        swordJuggling = 2
    }
    try {
    proficiencyCheckis(swordJuggling)
        swordJuggling = swordJuggling!!.plus(1)
    }catch (e:Exception){
        println(e)
    }
    println("Ты жанглируешь $swordJuggling мечами")
}
fun proficiencyCheckis(swordJuggling:Int?){
    checkNotNull(swordJuggling,{"Игрок не можем жанглировать мечами"})
}
//Создание собственного исключения
class UnskilledSwordJugglingExeption():
        IllegalStateException("Исключение в кода - Игрок не может жанглировать мечами")