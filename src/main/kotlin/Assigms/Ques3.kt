//Armstrong number
fun main(){
    val num = 371
    var num1:  Int
    var rem: Int
    var result = 0
    num1 = num

    while (num1 !=0){
        rem = num1 % 10
        result +=Math.pow(rem.toDouble(),3.0).toInt()
        num1 /= 10
    }
    if (result == num)
        println("$num is an Armstrong number")
    else
        println("$num is not Armstrong")
}
