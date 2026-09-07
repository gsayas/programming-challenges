package me.giocode

class DiagonalDifference {

    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        // Write your code here
        var leftRightSum = 0
        var rightLeftSum = 0

        for (k in 0 until arr.count()) {

            leftRightSum += arr[k][k]
            rightLeftSum += arr[k][arr.count() - k - 1]

        }


        return kotlin.math.abs(leftRightSum - rightLeftSum)

    }

}