fun main(args: Array<String>) {
    // write your code here
    fun checkLimit(speed: Int, limit: Int = 60) {
        if (speed <= limit) println("Within the limit") else {
            println("Exceeds the limit by ${speed - limit} kilometers per hour")
        }
    }
    val speed = readLine()!!.toInt()
    val limit = readLine()!!
    when (limit) {
        "no limit" -> checkLimit(speed = speed)
        else -> checkLimit(speed = speed, limit = limit.toInt())
    }
}