package com.anthropic


fun solution(originalRows: List<String>): List<String> {
    var count: Int
    var resultRow: MutableList<Char>
    var finalRows = mutableListOf<String>()


    for (x in 0 until originalRows.size) {
        resultRow = mutableListOf()
        for (y in originalRows[0].indices) {
            count = 0
            if (originalRows[x][y] != 'X') {
                if (x >= 1) {
                    if (y >= 1) {
                        if (originalRows[x - 1][y - 1] == 'X') count++
                    }
                    if (originalRows[x - 1][y] == 'X') count++
                    if (y < originalRows[0].length - 1) {
                        if (originalRows[x - 1][y + 1] == 'X') count++
                    }
                }
                if (y >= 1) {
                    if (originalRows[x][y - 1] == 'X') count++
                }
                if (y < originalRows[0].length - 1) {
                    if (originalRows[x][y + 1] == 'X') count++
                }

                if (x < originalRows.size - 1) {
                    if (y >= 1) {
                        if (originalRows[x + 1][y - 1] == 'X') count++
                    }
                    if (originalRows[x + 1][y] == 'X') count++
                    if (y < originalRows[0].length - 1) {
                        if (originalRows[x + 1][y + 1] == 'X') count++
                    }
                }

                resultRow.add(count.digitToChar())
            } else {
                resultRow.add('X')
            }
        }

        finalRows.add(resultRow.joinToString(" "))

    }

    return finalRows

}
