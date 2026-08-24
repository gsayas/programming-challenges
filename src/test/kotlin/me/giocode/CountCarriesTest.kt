package me.giocode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CountCarriesTest {
    @Test
    fun `counts carries in different columns`() {
        assertEquals(2, CountCarries().solution(1234, 5678))
    }

    @Test
    fun `counts a carry in every column`() {
        assertEquals(3, CountCarries().solution(555, 555))
    }

    @Test
    fun `counts carries that propagate through unequal length numbers`() {
        assertEquals(3, CountCarries().solution(999, 1))
    }

    @Test
    fun `returns zero when no column produces a carry`() {
        assertEquals(0, CountCarries().solution(123, 456))
    }

    @Test
    fun `handles zero values`() {
        assertEquals(0, CountCarries().solution(0, 0))
        assertEquals(0, CountCarries().solution(0, 123))
    }

    @Test
    fun `rejects negative numbers`() {
        assertFailsWith<IllegalArgumentException> { CountCarries().solution(-1, 5) }
    }
}
