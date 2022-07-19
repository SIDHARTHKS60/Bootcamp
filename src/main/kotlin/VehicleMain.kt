//Ques 2.3

class Vehicle   (var no_of_seats: Int, var no_of_wheels: Int) {

    fun showvehicle() {
        println("Total number of seats: $no_of_seats")
        println("Total number of wheels: $no_of_wheels")
    }
}


class Myvehicle
    fun main() {
        val motorcycle = Vehicle(1, 2)
        val car = Vehicle(4, 4)

        println("Details of Car")
        println("==============")
        car.showvehicle()
        println("\n ")
        println("Details of Motorcycle")
        println("=====================")
        motorcycle.showvehicle()
}