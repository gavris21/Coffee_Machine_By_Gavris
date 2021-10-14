class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        var i = 0
        fun create(name: String): Player {
            i++
            return Player(i, name, 100)
        }
    }
}