import kotlin.math.pow

fun main() {
    // write your code here
    fun compInterest(amount: Int = 1000, percent: Int = 5, years: Int = 10) {
        println((amount * (1.0 + percent / 100.0).pow(years)).toInt())
    }
    when (readLine()!!) {
        "amount" -> compInterest(amount = readLine()!!.toInt())
        "percent" -> compInterest(percent = readLine()!!.toInt())
        "years" -> compInterest(years = readLine()!!.toInt())
    }
}