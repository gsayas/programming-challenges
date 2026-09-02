package me.giocode

class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {

        return s.length == t.length && buildFrequencyMap(s) == buildFrequencyMap(t)

    }

    fun buildFrequencyMap(s: String): Map<Char, Int> {

        return s.groupingBy { it }.eachCount()

    }
}