package me.giocode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GroupAnagramsTest {
    @Test
    fun groupAnagrams() {
        val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")

        val expected = setOf(
            setOf("bat"),
            setOf("nat", "tan"),
            setOf("ate", "eat", "tea")
        )

        val result = GroupAnagrams().groupAnagrams(input)
            .map { it.toSet() }
            .toSet()

        assertEquals(expected, result)
    }

}