package hackerrank

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LargestRectangleTest {
    @Test
    fun largestRectangle() {
        val res = LargestRectangle().largestRectangle(arrayOf(1, 2, 3, 4, 5))
        assertEquals(9, res)
    }

    @Test
    fun case2() {
        val res = LargestRectangle().largestRectangle(arrayOf(5, 2, 4))
        assertEquals(5, res)
    }

    @Test
    fun case3() {
        val res = LargestRectangle().largestRectangle(arrayOf(1, 3, 5, 9, 11))
        assertEquals(18, res)
    }


}