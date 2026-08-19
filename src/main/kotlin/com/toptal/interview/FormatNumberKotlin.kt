package com.toptal.interview

class FormatNumberKotlin {

    fun solution(input: String): String {
        val cleanedInput = input.replace(" ", "").replace("-", "")
        val result = StringBuilder()
        var currentIndex = 0

        while (currentIndex < cleanedInput.length) {
            val remaining = cleanedInput.length - currentIndex
            val groupSize = if (remaining > 4 || remaining == 3) 3 else 2

            if (result.isNotEmpty()) {
                result.append("-")
            }

            result.append(cleanedInput, currentIndex, currentIndex + groupSize)
            currentIndex += groupSize
        }

        return result.toString()
    }
}
