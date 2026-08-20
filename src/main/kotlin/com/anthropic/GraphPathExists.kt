package com.anthropic

class GraphPathExists {

    fun solution(
        numberOfNodes: Int,
        edgeStarts: IntArray,
        edgeEnds: IntArray
    ): Boolean {
        require(numberOfNodes > 0) {
            "The graph must contain at least one node"
        }
        require(edgeStarts.size == edgeEnds.size) {
            "The edge arrays must have the same size"
        }

        val adjacencyList = mutableMapOf<Int, MutableSet<Int>>()

        for (index in edgeStarts.indices) {
            val firstNode = edgeStarts[index]
            val secondNode = edgeEnds[index]

            adjacencyList.getOrPut(firstNode) { mutableSetOf() }.add(secondNode)
            adjacencyList.getOrPut(secondNode) { mutableSetOf() }.add(firstNode)
        }

        return (1 until numberOfNodes).all { currentNode ->
            currentNode + 1 in adjacencyList[currentNode].orEmpty()
        }
    }
}
