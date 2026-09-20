package codesignal

fun main(args: Array<String>) {

    val inputN = 10

    //initialise counters
    var numAsteriscs = 1
    var numSpaces = inputN - 1


    for (i in 1..inputN) {

        //print spaces
        for (j in 0 until numSpaces) {
            print(" ")
        }
        numSpaces--

        for (k in 0 until numAsteriscs) {
            print("*")
        }
        println("")
        numAsteriscs += 2

    }

}