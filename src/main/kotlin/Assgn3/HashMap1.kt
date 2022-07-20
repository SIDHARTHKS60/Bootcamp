package Assgn3
//3.5 Hash map
    fun main(args: Array<String>) {
        val languages = HashMap<Int, String>()
        languages[1] = "Java"
        languages[2] = "Python"
        languages[3] = "JavaScript"
        println("HashMap: $languages")

        // return set view of keys
        // using keySet()
        println("Keys: " + languages.keys)

        // return set view of values
        // using values()
        println("Values: " + languages.values)

        // return set view of key/value pairs
        // using entrySet()
        println("Key/Value mappings: " + languages.entries)
    }
