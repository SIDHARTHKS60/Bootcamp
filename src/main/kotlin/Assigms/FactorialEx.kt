package Assigms//2.5

class RecFunc {
    var fact = 0
    fun recCalcuFactorial(i: Int): Int {
        fact = 1
        return if (i == 1 || i == 0) 1 else {
            fact = i * recCalcuFactorial(i - 1)
            fact
        }
    }

    fun nonrecCalcFactorial(i: Int): Int {
        if (i == 1 || i == 0) {
            return 1
        } else {
            fact = 1
            for (j in 1..i) fact = fact * j
        }
        return fact
    }
}


    fun main() {
        println("* Calculating factorial *")
        val factOb = RecFunc()
        println("* By using recursive version *")
        println("Factorial of 7 is :" + factOb.recCalcuFactorial(7))
        println("* By using nonrecursive(iterative) version *")
        println("Factorial of 6 is :" + factOb.nonrecCalcFactorial(6))
    }
