class City(val name: String) {
    var population = 0
        set(value) {
            field = value.coerceIn(0..50_000_000)
        }
}