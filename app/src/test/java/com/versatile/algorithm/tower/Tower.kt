package com.versatile.algorithm.tower

import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(heights: IntArray): IntArray {
    val answer = mutableListOf<Int>()

    heights.forEachIndexed { index, i ->
        if (index==0){
            answer.add(0)
        }else {
            val towersOfLeft = heights.copyOfRange(0,index)
            val value = towersOfLeft.findLast {
                it > i
            }
            if (value == null){
                answer.add(0)
            }else{
                answer.add(towersOfLeft.lastIndexOf(value)+ 1)
            }
        }
    }
    return answer.toIntArray()
}

class SolutionTest {


    @Test
    fun `find received tower's position`() {
        Assertions.assertThat(
            solution(intArrayOf(6,9,5,7,4))
        ).isEqualTo(intArrayOf(0,0,2,2,4))

        Assertions.assertThat(
            solution(intArrayOf(3,9,9,3,5,7,2))
        ).isEqualTo(intArrayOf(0,0,0,3,3,3,6))

        Assertions.assertThat(
            solution(intArrayOf(1,5,3,6,7,6,5))
        ).isEqualTo(intArrayOf(0,0,2,0,0,5,6))
    }
}