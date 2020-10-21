package com.versatile.algorithm.intersection_of_two_arrays2

import org.assertj.core.api.Assertions
import org.junit.Test

//Runtime: 196 ms, faster than 67.29% of Kotlin online submissions for Intersection of Two Arrays II.
//Memory Usage: 36.7 MB, less than 7.94% of Kotlin online submissions for Intersection of Two Arrays II.
fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

    var nums1Index = 0
    var nums2Index = 0

    val sortedNums1 = nums1.sortedArray()
    val sortedNums2 = nums2.sortedArray()

    val result = ArrayList<Int>()

    while (nums1Index < sortedNums1.size && nums2Index < sortedNums2.size) {
        when {
            sortedNums1[nums1Index] < sortedNums2[nums2Index] -> {
                nums1Index += 1
            }
            sortedNums1[nums1Index] > sortedNums2[nums2Index] -> {
                nums2Index += 1
            }
            else -> {
                result.add(sortedNums1[nums1Index])
                nums1Index += 1
                nums2Index += 1
            }
        }

    }

    return result.toIntArray()
}


//Runtime: 216 ms, faster than 28.97% of Kotlin online submissions for Intersection of Two Arrays II.
//Memory Usage: 37 MB, less than 7.94% of Kotlin online submissions for Intersection of Two Arrays II.
fun intersection2(nums1: IntArray, nums2: IntArray): IntArray {

    val result = ArrayList<Int>()

    val sortedNums1 = nums1.sortedArray()
    val mutableNums2 = nums2.toMutableList()

    sortedNums1.forEach {

        if (mutableNums2.contains(it)) {
            result.add(it)
            mutableNums2.remove(it)
        }

    }

    return result.toIntArray()
}

class SolutionTest {

    @Test
    fun `get intersection array`() {

        Assertions.assertThat(
            intersection(
                intArrayOf(1, 2, 2, 1),
                intArrayOf(2, 2)
            )
        )
            .isEqualTo(
                intArrayOf(
                    2, 2
                )
            )

        Assertions.assertThat(
            intersection(
                intArrayOf(4, 9, 5),
                intArrayOf(9, 4, 9, 8, 4)
            )
        )
            .isEqualTo(
                intArrayOf(
                    4, 9
                )
            )

        Assertions.assertThat(
            intersection(
                intArrayOf(1, 2),
                intArrayOf(1, 1)
            )
        )
            .isEqualTo(
                intArrayOf(
                    1
                )
            )




        Assertions.assertThat(
            intersection2(
                intArrayOf(1, 2, 2, 1),
                intArrayOf(2, 2)
            )
        )
            .isEqualTo(
                intArrayOf(
                    2, 2
                )
            )

        Assertions.assertThat(
            intersection2(
                intArrayOf(4, 9, 5),
                intArrayOf(9, 4, 9, 8, 4)
            )
        )
            .isEqualTo(
                intArrayOf(
                    4, 9
                )
            )

        Assertions.assertThat(
            intersection2(
                intArrayOf(1, 2),
                intArrayOf(1, 1)
            )
        )
            .isEqualTo(
                intArrayOf(
                    1
                )
            )
    }
}