package Assgn3
//Ques 3.1
fun main(args: Array<String>){

    val arrayList = ArrayList<String>()
    arrayList.add("Red")
    arrayList.add("Yellow")
    arrayList.add("Blue")
    arrayList.add("Green")
    arrayList.add("Violet")

    println("\n $arrayList ")
    println("\n ${arrayList.reverse()} ")
    println("\n .......ArrayList is .......")
    for (i in arrayList) {
        println(i)
    }
}