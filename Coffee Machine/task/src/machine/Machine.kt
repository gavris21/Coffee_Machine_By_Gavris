package machine

class Machine {

    fun input(input: String) {
        when (state) {
            MachineState.ACTION -> {
                when (input) {
                    "buy" -> {
                        println()
                        state = MachineState.BUY
                    }
                    "fill" -> {
                        println()
                        state = MachineState.FILL_WATTER
                    }
                    "take" -> {
                        println()
                        take()
                    }
                    "remaining" -> {
                        println()
                        status()
                    }
                    "exit" -> {
                        state = MachineState.TURN_OF
                    }
                }
            }
            MachineState.BUY -> {
                when (input) {
                    "1" -> {
                        buyCoffee(Recipe.ESPRESSO)
                        state = MachineState.ACTION
                    }
                    "2" -> {
                        buyCoffee(Recipe.LATTE)
                        state = MachineState.ACTION
                    }
                    "3" -> {
                        buyCoffee(Recipe.CAPPUCCINO)
                        state = MachineState.ACTION
                    }
                    "back" -> {
                        state = MachineState.ACTION
                    }
                }
            }
            MachineState.FILL_WATTER -> {
                fill(input)
                state = MachineState.FILL_MILK
            }
            MachineState.FILL_MILK -> {
                fill(input)
                state = MachineState.FILL_BEANS
            }
            MachineState.FILL_BEANS -> {
                fill(input)
                state = MachineState.FILL_CUPS
            }
            MachineState.FILL_CUPS -> {
                fill(input)
                state = MachineState.ACTION
                println()
            }
            else -> state = MachineState.TURN_OF
        }
    }

    companion object {
        private var waterTank = 400
        private var milkTank = 540
        private var coffeeHolder = 120
        private var disposableCups = 9
        private var moneyAll = 550
        var state = MachineState.ACTION
    }

    private fun status() {
        if (moneyAll > 0) {
            println(
                """
            The coffee machine has:
            $waterTank of water
            $milkTank of milk
            $coffeeHolder of coffee beans
            $disposableCups of disposable cups
            $$moneyAll of money
            
        """.trimIndent()
            )
        } else {
            println(
                """
            The coffee machine has:
            $waterTank of water
            $milkTank of milk
            $coffeeHolder of coffee beans
            $disposableCups of disposable cups
            $moneyAll of money
            
        """.trimIndent()
            )
        }
    }

    private fun take() {
        println("I gave you $$moneyAll\n")
        moneyAll = 0
    }

    private fun buyCoffee(recipe: Recipe) {
        if (waterTank >= recipe.water && milkTank >= recipe.milk && coffeeHolder >= recipe.beans && disposableCups >= 1) {
            waterTank -= recipe.water
            milkTank -= recipe.milk
            coffeeHolder -= recipe.beans
            moneyAll += recipe.price
            disposableCups--
            println("I have enough resources, making you a coffee!\n")
        } else {
            when {
                waterTank < recipe.water -> println("Sorry, not enough water!\n")
                milkTank < recipe.milk -> println("Sorry, not enough milk!\n")
                coffeeHolder < recipe.beans -> println("Sorry, not enough coffee beans!\n")
                disposableCups < 1 -> println("Sorry, not enough disposable cups!\n")
            }
        }

    }

    private fun fill(input: String) {
        var amount = 0
        try {
            amount = input.toInt()
        } catch (e: Exception) {
            println("Enter only digits")
            state = MachineState.FILL_WATTER
        }
        when (state) {
            MachineState.FILL_WATTER -> waterTank += amount
            MachineState.FILL_MILK -> milkTank += amount
            MachineState.FILL_BEANS -> coffeeHolder += amount
            MachineState.FILL_CUPS -> disposableCups += amount
            else -> state = MachineState.TURN_OF
        }
    }
}