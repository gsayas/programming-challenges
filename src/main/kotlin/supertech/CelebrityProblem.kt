package supertech

class CelebrityProblem {

    /*

    ## **The Celebrity Problem**

### **Problem**

Given a square matrix **`mat[][]`** of size **`n x n`,** such that `mat[i][j] = 1` means `i`-th person knows `j`-th person, the task is to find the **`celebrity`**.

A celebrity is a person who is known to all but does not know anyone. Return the index of the celebrity, if there is no celebrity return `-1` .

**Note:** Follow `0` based indexing and `M[i][i]` will always be `0`.

        ```jsx
mat = [D  G  T  A
   D [ 0, 0, 1, 0 ],
   G [ 0, 0, 1, 0 ],
   T [ 0, 0, 0, 0 ],
   A [ 0, 0, 1, 0 ]
]
Output: id = 2

     */


    fun solution(matrix: List<List<Int>>): Int {

        /*
        **** IMPROVED SOLUTION
        * candidate elimination
        */


        for (candidate in matrix.indices) {
            val knowsNobody =
                matrix[candidate].all { it == 0 }

            val knownByEverybody =
                matrix.indices.all { person ->
                    person == candidate ||
                        matrix[person][candidate] == 1
                }

            if (knowsNobody && knownByEverybody) {
                return candidate
            }
        }

        return -1
    }
}