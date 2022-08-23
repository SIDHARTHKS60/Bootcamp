// Palindrome
fun main(args: Array<String>) {
    var num = 12321
    var revNum = 0
    var rem: Int
    val realNum: Int

    realNum = num

    // reversed integer is stored in variable
    while (num != 0) {
        rem = num % 10
        revNum = revNum * 10 + rem
        num /= 10
    }

    // palindrome if orignalInteger and reversedInteger are equal
    if (realNum == revNum)
        println("$realNum is a palindrome.")
    else
        println("$realNum is not a palindrome.")
}