package org.kotlin.tour

fun main() {

    // Read-only map
    val juiceMenu =
        mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    juiceMenu.remove("orange")
    juiceMenu.getOrPut("banana") {
        200
    }


    println(juiceMenu)

    //making immutable
    val juiceMenuLocked: Map<String, Int> = juiceMenu

    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

    //indexed access operator
    val juiceMenuMutable: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    juiceMenuMutable["coconut"] = 150 // Add key "coconut" with value 150 to the map
    println(juiceMenuMutable)


    //FINDING
    println(readOnlyJuiceMenu.containsKey("kiwi"))

    println("orange" in readOnlyJuiceMenu.keys)
// true

// Alternatively, you don't need to use the keys property
    println("orange" in readOnlyJuiceMenu)
// true

    println(190 in readOnlyJuiceMenu.values)

    //exercise 2
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "ftp"
    val isSupported = SUPPORTED.contains(requested.uppercase())
    println("Support for $requested: $isSupported")

    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelled as '${number2word[n]}'")


    //COUNTING
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println("There are ${greenNumbers.size + redNumbers.size} numbers in total")
    println("There are ${greenNumbers.sum() + redNumbers.sum()} numbers in total")

}