class Block(val color: String) {
    object BlockProperties {
        var length = 10
        var width = 5
        fun blocksInBox(lBox: Int, wBox: Int): Int {
            return lBox / length * (wBox / width)
        }
    }
}