package leetcode

class ProductArrayButSelf {

    fun productExceptSelf(nums: IntArray): IntArray {

        val countZeroes = nums.count { it == 0 }

        if (countZeroes >= 2) {
            return IntArray(nums.size)
        }

        var totalProduct = 1

        for (i in nums.indices) {
            if (nums[i] != 0) {
                totalProduct *= nums[i]
            }
        }

        val answer = IntArray(nums.size)

        if (countZeroes == 1) {
            answer[nums.indexOfFirst { it == 0 }] = totalProduct
            return answer
        }

        for (i in nums.indices) {
            answer[i] = totalProduct / nums[i]
        }

        return answer
    }
}