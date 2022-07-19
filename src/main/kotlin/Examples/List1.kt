package Examples

class Collection {
}
fun main() {
    var list = listOf("A", "B", "C", "B", 1, 2, 3, 4, 2)

    println(list.indexOf("B"))
    println(list.contains("A"))

    for (data in list) {
        print(" $data")
    }
}
