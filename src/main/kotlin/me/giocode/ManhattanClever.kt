package me.giocode


class ManhattanClever {

    private val neighborOffsets = listOf(
        -1 to -1, -1 to 0, -1 to 1,
        0 to -1, 0 to 1,
        1 to -1, 1 to 0, 1 to 1,
    )

    fun solution(listOfRows: List<String>): List<String> =
        listOfRows.mapIndexed { rowIndex, row ->
            row.mapIndexed { cellIndex, cell ->
                if (cell == 'X') {
                    'X'
                } else {
                    neighborOffsets
                        .count { (rowOffset, cellOffset) ->
                            listOfRows
                                .getOrNull(rowIndex + rowOffset)
                                ?.getOrNull(cellIndex + cellOffset) == 'X'
                        }
                }
            }.joinToString(" ")
        }
}