/*Домашнее задание.
Сгенерировать более аккуратную версию меню:
а)Пункты меню с прописной буквы
б)Выравнивание по левому краю
в)Включить в меню цены
г)Выровнить цены по десятичной
 */
import java.io.File

fun main() {
    val magMenuList = File("data/tavern-menu-data.txt")
//       Читаем из файла данные
        .readText()
        .split("\n")
    kapitalizeString(magMenuList)
//    val testInG = listOf<String>("eli emel","beli sdf sdf","meni sdfs")
//    testInG.forEach{e -> println(e.toString().padEnd(10,'*'))}
      /*  println(magMenuList.forEach { magMenu ->
            val(type,name,price) = magMenu.split(",")

          val words = name.split(" ").toMutableList()
            var output = ""
            for (word in words){
                output+=word.capitalize()+ " "
                            }
            output = output.trim()
            println("Вывод строк: $output")
//
            val indexOfProbel = output.indexOf('\n')
            val out = output.substring(0 until indexOfProbel)
            println(out.padEnd(10,'.'))
        })*/



}
private fun kapitalizeString (stroke:List<String>){
    stroke.forEach { magMenu->
        val (type,name,price) = magMenu.split(',')
        val words = name.split("\n").toMutableList()
        var output = ""
        var max = 0
        var dafna =""

        for (word in words){
            output+= word.capitalize().padEnd(max,'.') + " "


        }

    output = output.trim()


  println("$output$price")




    }

}

private fun pointToPoint(spisok:List<String>){


}
