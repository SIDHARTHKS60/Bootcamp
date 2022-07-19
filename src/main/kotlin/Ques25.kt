class Factorial {
    var fact = 0
    fun recursivelyCalculateFactorial(i: Int): Int {
        fact = 1
        return if (i == 1 || i == 0) 1 else {
            fact = i * recursivelyCalculateFactorial(i - 1)
            fact
        }
    }

    fun nonrecursiveCalculateFactorial(i: Int): Int {
        if (i == 1 || i == 0) {
            return 1
        } else {
            fact = 1
            for (j in 1..i) fact = fact * j
        }
        return fact
    }
}

object FactorialEx {

    fun main() {
        println("* Calculating factorial *")
        val factOb = Factorial()
        println("* By using recursive version *")
        println("Factorial of 7 is :" + factOb.recursivelyCalculateFactorial(7))
        println("* By using nonrecursive(iterative) version *")
        println("Factorial of 6 is :" + factOb.nonrecursiveCalculateFactorial(6))
    }
}