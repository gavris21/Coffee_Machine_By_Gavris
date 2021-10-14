enum class Currency(val curr: String) {
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    KIRIBATI("Australian dollar");
    companion object {
        fun comp(c1: String, c2: String): Boolean {
            return try {
                valueOf(c1.uppercase()).curr == valueOf(c2.uppercase()).curr
            } catch (e: IllegalArgumentException) {
                false
            }
        }
    }
}
fun main() {
    // put your code here
    val (a, b) = readLine()!!.split(" ")
    println(Currency.comp(a, b))
}