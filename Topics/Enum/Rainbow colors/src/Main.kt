import java.util.*

enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF"),
    NULL("", "");

    companion object {
        fun isRainbow(color: String): Boolean {
            for (enum in values()) {
                if (color.uppercase(Locale.getDefault()) == enum.name) return true
            }
            return false
        }
    }
}

fun main() {
    // put your code
    val input = readLine()!!
    println(Rainbow.isRainbow(input))
}