package Examples

class Company <T>(info :T) {

var details=info
    fun display () {
        println(details)
}

}
    fun main() {
        var name=Company ("ABC")
        var turnOver =Company(50000000)

        name.display()
        turnOver.display()

}