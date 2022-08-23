//Intrest Calcutator
import java.util.*

fun main(args: Array<String>) {

    //Input Stream
    val scanner = Scanner(System.`in`)

    //Input Amount
    print("Enter Principal Amount : ")
    val principalAmount = scanner.nextDouble()

    //Input Interest Rate
    print("Enter Rate of Interest : ")
    val rateOfInterest = scanner.nextDouble()

    //Input time in years
    print("Enter Time : ")
    val time = scanner.nextInt()

    //Calculate Simple Interest
    val simpleInterest = (principalAmount*rateOfInterest*time)/100

    //Print Simple Interest
    println("Simple Interest is :$simpleInterest")
}



