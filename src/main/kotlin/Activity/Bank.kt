package Activity
import java.util.*
class Bank {
    var name=""
    var address=""
    var acc_type=""
    var balance :Float=0.0f
init {
    println("Welcome to ABC bank")
}
    fun open_account() {
        System.out.println("Enter your full name: ")
        name= readln()
        System.out.println("Enter your address: ")
        address = readln()
        System.out.println("What type of account you want to open saving(S)or Current(C): ")
        var acc_type = readln()
        System.out.println("Enter How much money you want to deposit: ")
        val sc = Scanner(System.`in`)
        val Deposit1 = sc.nextFloat()
        System.out.println("Account Created Successfully")
    }
    fun deposit_money(){
        System.out.println("Enter how much money you want to deposit: ")
        val sc = Scanner(System.`in`)
        var deposit= sc.nextFloat()
        balance += deposit
        System.out.println( "\n Available Balance: $balance")
    }
    fun display_account() {
        println("Name: $name")
        println("Address: $address")
        println("Type: $acc_type")
        println("Balance: $balance")
    }
fun withdraw () {
    println("Enter the amount to be Withdrawn")
    val sc = Scanner(System.`in`)
    var withdraw= sc.nextFloat()
    balance-=withdraw
    if(balance<2000){
        print("Not Able to Withdraw beyond limit of 2000 Rs")
    }
    else {
        balance -= withdraw
        println("Available balance $balance")
    }}
}
    fun main() {
        val o1= Bank()
        println("Enter your choice : \n 1.Open Account \n 2.Deposit Amount \n 3.Display Account \n 4.Withdraw Amount")
        val option = readln()
        val result1=when(option){
        "1" ->o1.open_account()
         "2" -> o1.deposit_money()
         "3" -> o1.display_account()
         "4" -> o1.withdraw()
        else -> "Enter a proper Option"
        }
        println(result1)
    }

