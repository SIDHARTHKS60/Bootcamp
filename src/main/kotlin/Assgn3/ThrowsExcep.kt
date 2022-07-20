package Assgn3
//3.6 Throws and Throw
internal object ThrowsExecp {
    @Throws(IllegalAccessException::class)
    fun `fun`() {
        println("Inside fun(). ")
        throw IllegalAccessException("demo")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        try {
            `fun`()
        } catch (e: IllegalAccessException) {
            println("caught in main.")
        }
    }
}