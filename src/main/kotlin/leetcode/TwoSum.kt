package leetcode

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexByValue = mutableMapOf<Int, Int>()

        for (index in nums.indices) {
            val complement = target - nums[index]
            val complementIndex = indexByValue[complement]

            if (complementIndex != null) {
                return intArrayOf(complementIndex, index)
            }

            indexByValue[nums[index]] = index
        }

        return intArrayOf()
    }
}