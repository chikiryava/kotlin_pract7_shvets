import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.tan
fun main(){

}

fun Zadanie1n7(){
    try {
        println("введите х")
        val x: Double = readLine()!!.toDouble()
        println("введите y")
        val y: Double = readLine()!!.toDouble()
        println("введите z")
        val z: Double = readLine()!!.toDouble()
        val e: Double = 2.7182818284.toDouble()
        val a: Double = (3 + e.pow(y - 1)) / ((1 + x.pow(2)) * (y - tan(z))).toDouble()
        val b: Double = (1 + abs((y - x)) + ((y - x).pow(2)) / 2 + (abs(y - x).pow(3)) / 3).toDouble()
        println("a =" + a)
        println("b = " + b)
    }
    catch (e:Exception){
        println("Вы ввели не число")
    }
}