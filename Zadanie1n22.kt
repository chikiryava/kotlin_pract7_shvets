import kotlin.math.pow
fun main(){

}
fun Zadanie1n22(){
    try{
        println("введите м1")
        var m1:Double=readLine()!!.toDouble()
        println("введите м2")
        var m2:Double=readLine()!!.toDouble()
        println("введите r")
        var r:Double = readLine()!!.toDouble().pow(2)
        if(m1<0||m2<0||r<0)
            println("значение не может быть меньше ноля")
        else {
            var y: Double = 6.673 * 10.0.pow(-8)
            var F: Double = (y * m1 * m2) / r.toDouble()
            println(F)
        }
    }
    catch (e:Exception){
        println("вы ввели не число")
    }
}