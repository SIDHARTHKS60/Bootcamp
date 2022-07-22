package Assgn3

//Ques 3.7
object CatchBlocks {
    @JvmStatic
    fun main(args: Array<String>) {
        try {
            val a = IntArray(5)
            a[5] = 30 / 0
        } catch (e: ArithmeticException) {
            println("Arithmetic Exception occurs")
        } catch (e: ArrayIndexOutOfBoundsException) {
            println("ArrayIndexOutOfBounds Exception occurs")
        } catch (e: Exception) {
            println("Parent Exception occurs")
        } finally {
            println("Inside finally ")
        }
        println("rest of the code")
    }
}