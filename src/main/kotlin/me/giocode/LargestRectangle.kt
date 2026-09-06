package me.giocode

class LargestRectangle {

    fun largestRectangle(h: Array<Int>): Long {

        /*
        h[i] = height of a given building

        n = number of buildings in the input (size of h)

        rectangle = (max number of buildings) in the block x height of the (shortest) building of the largest block
        * */


        val stack = ArrayDeque<Int>(h.toList())
        val maxBlockSize = 1L
        var minHeight = 1L
//        val currentMaxBlock = ArrayDeque<Int>()

        //aux reference
//        var last: Int

        while (stack.isNotEmpty()) {


        }

//        return maxBlockSize * minHeight
        return 0
    }
}