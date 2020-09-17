package com.versatile.algorithm.add_array

import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    val answer = arr1.copyOf()


    (arr1.indices).forEach {
        answer[it] = IntArray(arr1[it].size)
        (arr1[it].indices).forEachIndexed { index, _ ->
            answer[it][index] = arr1[it][index] + arr2[it][index]
        }
    }

    return answer

//    return Array(arr1.size) {
//            row ->
//        IntArray(arr1[0].size) {
//                col ->
//            arr1[row][col] + arr2[row][col]
//        }
//    }
}

class SolutionTest {


    @Test
    fun `get add array result`() {
        Assertions.assertThat(
            solution(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3)
                ),
                arrayOf(
                    intArrayOf(3, 4),
                    intArrayOf(5, 6))
            )
        ).isEqualTo(arrayOf(
            intArrayOf(4,6),
            intArrayOf(7,9)
        ))

    }
}