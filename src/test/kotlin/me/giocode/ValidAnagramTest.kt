package me.giocode

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class ValidAnagramTest {
    @Test
    fun isAnagram1() {
        val result = ValidAnagram().isAnagram("abc", "cba")
        assertTrue { result }
    }

    @Test
    fun isAnagram2() {
        val result = ValidAnagram().isAnagram(s = "anagram", t = "nagaram")
        assertTrue { result }
    }

    @Test
    fun isAnagram3() {
        val result = ValidAnagram().isAnagram("rat", "car")
        assertFalse { result }
    }

    @Test
    fun isAnagram4() {
        val result = ValidAnagram().isAnagram("aacc", "ccac")
        assertFalse { result }
    }

}