fun Zadanie2n36(){
    try{
        println("Введите точку a")
        val a:Double = readLine()!!.toDouble()
        println("Введите точку b")
        val b:Double = readLine()!!.toDouble()
        println("Введите точку x")
        val x:Double = readLine()!!.toDouble()
        println("Введите точку y")
        val y:Double = readLine()!!.toDouble()
        println("Введите точку z")
        val z:Double = readLine()!!.toDouble()
        var count:Int = 0
        if(a>b)
            println("число а должно быть меньше b")
        else {
            if(x>a && x<b) {
                count++
                println("точка х попадает в отрезок")
            }
            if(y>a && y<b) {
                count++
                println("точка y попадает в отрезок")
            }
            if(z>a && z<b) {
                count++
                println("точка z попадает в отрезок")
            }
        }
        println("количество точек которые попадают в отрезок = "+count)

    }
    catch (e:Exception){
        println("Вы ввели не число")
    }
}