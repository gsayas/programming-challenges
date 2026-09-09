package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class ShortestUncommonSubstringArrayTest {
    @Test
    fun shortestSubstrings() {

        val res =
            ShortestUncommonSubstringArray().shortestSubstrings(arrayOf("cab", "ad", "bad", "c"))
        assertContentEquals(arrayOf("ab", "", "ba", ""), res)

    }

    @Test
    fun _242() {

        val res =
            ShortestUncommonSubstringArray().shortestSubstrings(
                arrayOf(
                    "gfnt",
                    "xn",
                    "mdz",
                    "yfmr",
                    "fi",
                    "wwncn",
                    "hkdy"
                )
            )
        assertContentEquals(arrayOf("g", "x", "z", "r", "i", "c", "h"), res)

    }

    @Test
    fun _621() {

        val res =
            ShortestUncommonSubstringArray().shortestSubstrings(
                arrayOf(
                    "fhi", "ct", "s", "o", "o"
                )
            )
        assertContentEquals(arrayOf("f", "c", "s", "", ""), res)
    }

    @Test
    fun substrings() {
        val subs = ShortestUncommonSubstringArray()
            .getSubstringsOf("cab")

        assertEquals(
            listOf("c", "a", "b", "ca", "ab", "cab"),
            subs
        )
    }

}