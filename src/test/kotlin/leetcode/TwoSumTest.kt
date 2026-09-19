package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class TwoSumTest {
    @Test
    fun twoSum() {

        val out = TwoSum().twoSum(intArrayOf(2, 7, 11, 15), 9)
        assertContentEquals(intArrayOf(0, 1), out)

    }

    @Test
    fun twoSum2() {

        val out = TwoSum().twoSum(intArrayOf(3, 2, 4), 6)
        assertContentEquals(intArrayOf(1, 2), out)

    }

    @Test
    fun twoSum3() {

        val out = TwoSum().twoSum(intArrayOf(0, 4, 3, 0), 0)
        assertContentEquals(intArrayOf(0, 3), out)

    }

}