package com.versatile.algorithm.intersection_of_two_arrays

import org.assertj.core.api.Assertions
import org.junit.Test

//Runtime: 236 ms, faster than 24.14% of Kotlin online submissions for Intersection of Two Arrays.
//Memory Usage: 36.7 MB, less than 6.90% of Kotlin online submissions for Intersection of Two Arrays.
//끝까지 비교하지 않는 방식으로 해보려 했는데 오히려 성능이 좋지 않게 나옴.
fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

    if (nums1.isEmpty() || nums2.isEmpty()) {
        return intArrayOf()
    }

    var nums1Index = 0
    var nums2Index = 0

    val sortedNums1 = nums1.distinct().sorted().toMutableList()
    val sortedNums2 = nums2.distinct().sorted()


    while (nums1Index < sortedNums1.size && nums2Index < sortedNums2.size) {
        when {
            sortedNums1[nums1Index] < sortedNums2[nums2Index] -> {
                sortedNums1.removeAt(nums1Index)
            }
            sortedNums1[nums1Index] > sortedNums2[nums2Index] -> {
                nums2Index += 1
            }
            else -> {
                nums1Index += 1
                nums2Index += 1
            }
        }

    }

    return sortedNums1.subList(0, nums1Index).toIntArray()
}

//Runtime: 200 ms, faster than 74.71% of Kotlin online submissions for Intersection of Two Arrays.
//Memory Usage: 35.8 MB, less than 6.90% of Kotlin online submissions for Intersection of Two Arrays.
//collection 함수로 해결한 방법
fun intersection2(nums1: IntArray, nums2: IntArray): IntArray {

    if (nums1.isEmpty() || nums2.isEmpty()) {
        return intArrayOf()
    }

    val result = ArrayList<Int>()

    val sortedNums1 = nums1.sortedArray()

    sortedNums1.forEachIndexed { index, i ->
        if (index == 0 || i != sortedNums1[index - 1]) {
            if (nums2.contains(i)) {
                result.add(i)
            }
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
                   2
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
                    2
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