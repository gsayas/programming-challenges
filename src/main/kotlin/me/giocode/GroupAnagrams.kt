package me.giocode

class GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        return strs
            .groupBy {
                it.toCharArray()
                    .sorted()
                    .joinToString()
            }
            .values
            .toList()

    }

}