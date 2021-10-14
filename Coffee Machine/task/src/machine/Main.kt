package machine

fun main() {
    val machine = Machine()
    while (Machine.state != MachineState.TURN_OF) {
        print(Machine.state.message)
        machine.input(readLine()!!)
    }
}
