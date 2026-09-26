package kotlintour

// https://www.baeldung.com/kotlin/map-operations

fun main() {
    // transform the values of a Map
    val booksRead: Map<String, List<String>> = mapOf<String, List<String>>(
        "Gio" to listOf("For whom the bell tolls", "Sherlock Holmes Adventures", "One hundred years of solitude"),
        "Matt" to listOf("The Pilgrims", "Moby Dick")
    )

    val lowercaseBooks = booksRead
        .mapValues { (_, books) ->
            books.map(String::lowercase)
        }

//    println(lowercaseBooks)


    //transform the keys
//    println(
//        lowercaseBooks.mapKeys { it.key.uppercase() }
//    )

    //counting the books of each guy
//    println(booksRead.mapValues { it.value.count() })

    //selecting the book with the longest name of each
    println(booksRead.mapValues { (_, books) ->
        books.maxByOrNull { it.length }
    })

    //transforming both the keys and the values
    val map = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5)
    val transformedMap = map.map { (key, value) -> key.uppercase() to value * 10 }.toMap()
//    println(transformedMap)


    //flatMap & groupBy
    val map2 = mapOf("one" to listOf(1, 2), "two" to listOf(3, 4, 5), "three" to listOf(6, 7, 8, 9))

    val flattenedList = map2.flatMap { (key, value) -> value.map { key to it } }
//    println(flattenedList)

    val grouped = flattenedList.groupBy({ it.first }, { it.second })
//    println(grouped)


    //associate
    val wordsList = listOf("one", "two", "three", "four", "five")
    val map3 = wordsList.associate { it to it.length }
//    println(map3)


}