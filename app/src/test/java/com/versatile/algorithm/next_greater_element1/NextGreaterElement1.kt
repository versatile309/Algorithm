package com.versatile.algorithm.next_greater_element1

import org.assertj.core.api.Assertions
import org.junit.Test

/**
 * Runtime: 196 ms, faster than 53.13% of Kotlin online submissions for Next Greater Element I.
 * Memory Usage: 37.7 MB, less than 9.38% of Kotlin online submissions for Next Greater Element I.
 */
fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {

    val result = MutableList(nums1.size) { -1}
    nums1.forEachIndexed { index, i ->
        for(j in nums2.indexOf(i) + 1 until nums2.size) {
            if (i < nums2[j]){
                result[index] = nums2[j]
                break
            }

        }
    }

    return result.toIntArray()
}

class SolutionTest {

    @Test
    fun `get pascal's triangle`() {

        Assertions.assertThat(
            nextGreaterElement(
                intArrayOf(4, 1, 2),
                intArrayOf(1, 3, 4, 2)
            )
        )
            .isEqualTo(
                intArrayOf(
                    -1, 3, -1
                )
            )


        Assertions.assertThat(
            nextGreaterElement(
                intArrayOf(2, 4),
                intArrayOf(1, 2, 3, 4)
            )
        )
            .isEqualTo(
                intArrayOf(
                    3, -1
                )
            )
    }
}