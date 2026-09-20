package leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FormatNumberTest {

    private val formatNumber = FormatNumber()

    @Test
    fun case1() {
        assertEquals(
            "004-448-555-583-61", formatNumber.solution("00-44 48 5555 8361")
        )
    }

    @Test
    fun case2() {
        assertEquals("022-198-53-24", formatNumber.solution("0 - 22 1985--324"))
    }

    @Test
    fun case3() {
        assertEquals("555-372-654", formatNumber.solution("555372654"))
    }
}
