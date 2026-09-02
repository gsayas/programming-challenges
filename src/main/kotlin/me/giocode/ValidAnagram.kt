package me.giocode

class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {

        return s.length == t.length && buildFrequencyMap(s) == buildFrequencyMap(t)


//        return s.toList().sorted().joinToString("").equals(t.toList().sorted().joinToString(""))

//        return s.toCharArray().sorted().joinToString("") == t.toCharArray().sorted().joinToString("")

    }

    fun buildFrequencyMap(s: String): Map<Char, Int> {

        return s.groupingBy { it }.eachCount()

    }
}