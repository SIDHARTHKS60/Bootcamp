package Assgn3
//3. Compare ArrayList
fun<T> isEqual(first: List<T>, second: List<T>): Boolean {

    if (first.size != second.size) {
        return false
    }

    first.forEachIndexed { index, value -> if (second[index] != value) { return false} }
    return true
}

fun main() {
    val al = ArrayList<Int>()
    val al2 = ArrayList<Int>()
    al.add(1)
    al.add(2)
    al.add(3)
    al.add(4)
    al.add(5)
    al2.add(1)
    al2.add(2)
    al2.add(3)
    al2.add(4)
    al2.add(5)

    val isEqual = isEqual(al,al2)

    println(isEqual)        // true
}