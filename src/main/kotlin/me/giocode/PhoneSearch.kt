package me.giocode

class PhoneSearch {

    fun solution(
        names: Array<String>,
        numbers: Array<String>,
        query: String
    ): String {

        val directory = numbers.zip(names).toMap()

        val matches = directory.filter { (k, v) -> k.contains(query) }

        if (matches.isNotEmpty()) {
            return matches.values.minOf { it }
        }

        return "NO CONTACT"
    }
}
