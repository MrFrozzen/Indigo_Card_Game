class Vehicle {
    inner class Engine {
        fun start() {
            println("RRRrrrrrrr....")
        }
    }
}

fun main() {
    val vehicle = Vehicle()
    val engine: Vehicle.Engine = vehicle.Engine()
    engine.start()
}