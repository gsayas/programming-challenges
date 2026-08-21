package com.anthropic

class CountCarries {
    fun solution(firstNumber: Int, secondNumber: Int): Int {
        require(firstNumber >= 0 && secondNumber >= 0) { "Numbers must be non-negative" }

        var firstRemaining = firstNumber
        var secondRemaining = secondNumber
        var carry = 0
        var carryCount = 0

        while (firstRemaining > 0 || secondRemaining > 0) {
            val columnSum = firstRemaining % 10 + secondRemaining % 10 + carry
            carry = columnSum / 10

            if (carry > 0) {
                carryCount++
            }

            firstRemaining /= 10
            secondRemaining /= 10
        }

        return carryCount
    }
}
