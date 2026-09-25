package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class ProductArrayButSelfTest {
    @Test
    fun productExceptSelf() {

        val res = ProductArrayButSelf().productExceptSelf(intArrayOf(1, 2, 3, 4))
        assertContentEquals(intArrayOf(24, 12, 8, 6), res)
    }

    @Test
    fun productExceptSelf2() {

        val res = ProductArrayButSelf().productExceptSelf(intArrayOf(-1, 1, 0, -3, 3))
        assertContentEquals(intArrayOf(0, 0, 9, 0, 0), res)
    }

}