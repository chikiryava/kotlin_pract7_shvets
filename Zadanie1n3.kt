fun Zadanie1n3(){
    try{
        println("введите число")
        var firstnumber:Int= readLine()!!.toInt()
        println("введите множитель")
        var multiply: Int = readLine()!!.toInt()
        println("введите номер, от которого начнет считаться сумма членов")
        val k:Int = readLine()!!.toInt()
        println("введите номер, на котором закончится считаться сумма членов")
        val p:Int= readLine()!!.toInt()
        var sum:Int = 0
        if(k>p)
            println("начальное число не может быть больше, чем конечное")
        else if(k<0||p<0)
            println("диапазон чисел не может быть меньше 0")
        for(i in 0..p-2) {
            firstnumber=firstnumber*multiply
            if(i>=k)
                sum=firstnumber+sum

        }
        println("сумма членов = "+sum)
        println("последний член ="+ firstnumber)
    }
    catch (e:Exception){
        println("Не число")
    }
}