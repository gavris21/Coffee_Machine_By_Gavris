fun main() {
    // write your code here
    fun concatenate3(a: String, b: String, c: String, separator: String = " ") {
        println(a + separator + b + separator + c)
    }
    val a = readLine()!!
    val b = readLine()!!
    val c = readLine()!!
    val separator = readLine()!!
    if (separator == "NO SEPARATOR") concatenate3(a, b, c) else concatenate3(a, b, c, separator)
}