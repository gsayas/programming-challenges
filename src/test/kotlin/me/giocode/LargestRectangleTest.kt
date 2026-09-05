package me.giocode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LargestRectangleTest {
    @Test
    fun largestRectangle() {
        val res = LargestRectangle().largestRectangle(arrayOf(1, 2, 3, 4, 5))
        assertEquals(9, res)
    }

}