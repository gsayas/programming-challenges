package me.giocode

class LargestRectangle {

    fun largestRectangle(h: Array<Int>): Long {

        // Write your code here
        //
        /*
        *

        h[i] = height of a given building

        n = number of buildings in the input (size of h)



        rectangle = max number of buildings in the block x height of the tallest building of the largest block
        */


        val stack = ArrayDeque<Int>(h.toList())

        val maxBlockSize = 1L
        var maxHeight = 0L
        var next: Int
        var last: Int

        while (stack.isNotEmpty()) {
            last = stack.last()

            if (stack.last().toLong() > maxHeight) {
                maxHeight = stack.last().toLong()


//                while ( stack.has)

            }

        }

        return stack.last().toLong()
    }
}