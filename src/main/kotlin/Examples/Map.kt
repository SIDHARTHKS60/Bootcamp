//Mutable map
fun main() {
    var student = mutableMapOf(1 to "Rohit", 2 to "Jitin", 3 to "Kumar")
    println(student.keys)

    for (i in student.keys) {
        println("Key $i value is ${student[i]}")
    }
    println()

    student.put(4, "Sidharth")

    for (i in student.keys) {
        println("Key $i value is ${student[i]}")
    }
}
