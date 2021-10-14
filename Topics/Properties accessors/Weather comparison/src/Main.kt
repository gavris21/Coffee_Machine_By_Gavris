class City(val name: String) {
    var degrees: Int = 5
        set(value) {
            if (value !in -92..57) {
                when (name) {
                    "Moscow" -> field = 5
                    "Hanoi" -> field = 20
                    "Dubai" -> field = 30
                }
            } else field = value
        }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third
    val list = mutableListOf(firstCity, secondCity, thirdCity).sortedBy { it.degrees }
    // implement comparing here
    if (list[0].degrees == list[1].degrees) println("neither") else print(list[0].name)
}