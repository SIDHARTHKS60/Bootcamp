package Assgn3

import java.util.*

fun main() {
    val al3  = ArrayList<Int>()
    al3.add(1)
    al3.add(2)
    al3.add(3)
    al3.add(4)
    al3.add(5)
    Collections.swap(al3, 1, 3)
    println(al3)
}