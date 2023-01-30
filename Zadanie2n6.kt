fun main(){
    Zadanie2n6()
}
fun Zadanie2n6(){
    try{
        println("введите число а")
        val a:Double= readLine()!!.toDouble()
        println("введите число b")
        val b:Double = readLine()!!.toDouble()
        println("введите число c")
        val c:Double = readLine()!!.toDouble()
        if(a<b&& b<c && a<c)
            println("Неравенства выполняется")
        else
            println("неравенства не выполняется")
    }
    catch (e:Exception){
        println("вы ввели не число")
    }
}