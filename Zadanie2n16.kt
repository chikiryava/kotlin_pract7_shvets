fun Zadanie2n16(){
    try {
        println("введите номер билета")
        val ticket: Int = readLine()!!.toInt()
        if (ticket < 1000 || ticket > 9999)
            println("номер билета должен быть четырехзначным")
        else {
            if (ticket / 1000 + (ticket / 100) % 10 == (ticket / 10) % 10 + ticket % 10)
                println("Билет счастливый")
            else
                println("Билет несчастливый")
        }
    }
    catch (e:Exception){
        println("вы ввели не число")
    }
}
