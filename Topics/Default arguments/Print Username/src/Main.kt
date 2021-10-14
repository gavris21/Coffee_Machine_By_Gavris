fun main() {
    // write your code here
    fun greeting(name: String = "secret user") {
        println("Hello, $name!")
    }
    val name = readLine()!!
    if (name == "HIDDEN") greeting() else greeting(name)
}