package machine

enum class MachineState(val message: String) {
    ACTION("Write action (buy, fill, take, remaining, exit): > "),
    BUY("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > "),
    FILL_WATTER("Write how many ml of water do you want to add: > "),
    FILL_MILK("Write how many ml of milk do you want to add: > "),
    FILL_BEANS("Write how many grams of coffee beans do you want to add: > "),
    FILL_CUPS("Write how many disposable cups of coffee do you want to add: > "),
    TURN_OF("")
}

enum class Recipe(val water: Int, val milk: Int, val beans: Int, val price: Int) {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);
}