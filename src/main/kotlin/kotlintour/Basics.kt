package kotlintour

fun main() {

    //Hello World and Basic Types
    println("Hello, World!")

    val customerName = "Gio Sayas"
    println("the name is: ${customerName}")

    val a: Int = 1000
    val b: String = "message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'

    val arr: Array<Int> = Array(3) { i -> i + 1 }
    println(arr.joinToString())

    //Collections ***************

    //Lists
    val strings = listOf("juana", "pepe", "luis")

//    val numbers: List<Int> = List(3) { index -> index }
//    val intList = List(4) { i -> i }
    val dangerList = strings.toMutableList()
    dangerList.add("paco")

//    strings.forEach { println(it) }
    println(dangerList.joinToString(","))


    //Sets
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)

    println("banana" in readOnlyFruit)


    //Maps
    // Read-only map
    val readOnlyJuiceMenu =
        mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

}
