package com.versatile.algorithm.largest_perimeter_triangle

import org.assertj.core.api.Assertions
import org.junit.Test

//Runtime: 264 ms, faster than 66.67% of Kotlin online submissions for Largest Perimeter Triangle.
//Memory Usage: 38.5 MB, less than 100.00% of Kotlin online submissions for Largest Perimeter Triangle.
fun largestPerimeter(A: IntArray): Int {
    run loop@{
        val sortedArray = A.sortedArrayDescending()
        sortedArray.forEachIndexed { index, i ->
            if (i < sortedArray[index + 1] + sortedArray[index + 2]) {
                return i + sortedArray[index + 1] + sortedArray[index + 2]
            }
            if (index + 3 == A.size) {
                return@loop
            }

        }
    }
    return 0
}

class SolutionTest {


    @Test
    fun `largest perimeter`() {
        Assertions.assertThat(
            largestPerimeter(intArrayOf(2, 1, 2))
        ).isEqualTo(5)

        Assertions.assertThat(
            largestPerimeter(intArrayOf(1, 2, 1))
        ).isEqualTo(0)

        Assertions.assertThat(
            largestPerimeter(intArrayOf(3, 2, 3, 4))
        ).isEqualTo(10)

        Assertions.assertThat(
            largestPerimeter(intArrayOf(3, 6, 2, 3))
        ).isEqualTo(8)


    }
}