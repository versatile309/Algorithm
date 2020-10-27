package com.versatile.algorithm.sort_array_by_parity2

import org.assertj.core.api.Assertions
import org.junit.Test

//Runtime: 1368 ms, faster than 7.41% of Kotlin online submissions for Sort Array By Parity II.
//Memory Usage: 40.4 MB, less than 7.41% of Kotlin online submissions for Sort Array By Parity II.

//step 2 추가 했을 때
//Runtime: 880 ms, faster than 7.41% of Kotlin online submissions for Sort Array By Parity II.
//Memory Usage: 38.2 MB, less than 7.41% of Kotlin online submissions for Sort Array By Parity II.
fun sortArrayByParityII(A: IntArray): IntArray {
    var temp: Int
    for (i in A.indices) {
        if (i % 2 == 0 && A[i] % 2 != 0) {
            for (j in i + 1 until A.size step 2) {
                if (A[j] % 2 == 0) {
                    temp = A[j]
                    A[j] = A[i]
                    A[i] = temp
                }
            }
        } else if (i % 2 != 0 && A[i] % 2 == 0) {
            for (j in i + 1 until A.size step 2) {
                if (A[j] % 2 != 0) {
                    temp = A[j]
                    A[j] = A[i]
                    A[i] = temp
                }
            }
        }
    }
    return A
}

class SolutionTest {


    @Test
    fun `sort array by parityII`() {
        Assertions.assertThat(
            sortArrayByParityII(intArrayOf(4, 2, 5, 7))
        ).isEqualTo(intArrayOf(4, 5, 2, 7))


    }
}