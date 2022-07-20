import java.util.Collections

    fun main() {
        val colours= ArrayList<String>()
        colours.add("Violet")
        colours.add("Indigo")
        colours.add("Blue")
        colours.add("Green")
        colours.add("Yellow")
        colours.add("Orange")
        colours.add("Red")
        println(colours)

        Collections.reverse(colours)

        println(colours)
    }
