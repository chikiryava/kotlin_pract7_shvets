fun Zadanie2n26(){
    try{
        println("Введите координату x")
        val x: Double = readLine()!!.toDouble()
        println("Введите координату y")
        val y: Double = readLine()!!.toDouble()
        if(y>0)
            println("точка лежит в верхней полуплоскости")
        else
            println("точка не лежит в верхней полуплоскости")
    }
    catch (e:Exception){
        println("вы ввели не число")
    }
}