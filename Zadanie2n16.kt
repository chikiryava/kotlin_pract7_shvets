fun Zadanie2n16(){
    try {
        println("введите номер билета")
        val ticket: Int = readLine()!!.toInt()
        when{
            (ticket < 1000 || ticket > 9999) -> println("номер билета должен быть четырехзначным")
            else -> when{
                (ticket / 1000 + (ticket / 100) % 10 == (ticket / 10) % 10 + ticket % 10) ->println("номер счастливый")
                else ->println("номер не счастливый")

            }
        }
    }
    catch (e:Exception){
        println("вы ввели не число")
    }
}
