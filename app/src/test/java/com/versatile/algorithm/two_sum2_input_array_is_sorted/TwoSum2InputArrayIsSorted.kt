package com.versatile.algorithm.two_sum2_input_array_is_sorted

import org.assertj.core.api.Assertions
import org.junit.Test

//use binarySearch method in kotlin
fun twoSum(numbers: IntArray, target: Int): IntArray {

    run loop@{
        numbers.forEachIndexed { index, i ->
            if (i + numbers.last() < target) {
                return@forEachIndexed
            }
            val findIndexResult = numbers
                .binarySearch(target - i, fromIndex = index + 1)

            if (findIndexResult > -1) {
                return intArrayOf((index + 1), (findIndexResult + 1))
            }

        }
    }
    return intArrayOf()
}

//use two pointer from edge side
fun twoSum2(numbers: IntArray, target: Int): IntArray {

    var elementAIndex = 0
    var elementBIndex = numbers.lastIndex

    while (elementAIndex < elementBIndex) {
        if (numbers[elementAIndex] + numbers[elementBIndex] == target) {
            return intArrayOf(elementAIndex + 1, elementBIndex + 1)
        }
        if (numbers[elementAIndex] + numbers[elementBIndex] > target) {
            elementBIndex -= 1
        }
        if (numbers[elementAIndex] + numbers[elementBIndex] < target) {
            elementAIndex += 1
        }
    }
    return intArrayOf()
}

//use binary search algorithm by own code
fun twoSum3(numbers: IntArray, target: Int): IntArray {

    run loop@{
        numbers.forEachIndexed { index, firstValue ->
           var startIndex = index + 1
            var lastIndex = numbers.size
            val secondValue = target - firstValue
            while (startIndex < lastIndex) {
                val pivot = startIndex + (lastIndex - startIndex) / 2
                when {
                    numbers[pivot] == secondValue -> return intArrayOf(index + 1, pivot + 1)
                    numbers[pivot] < secondValue -> startIndex = pivot + 1
                    else -> lastIndex = pivot
                }
            }

        }
    }
    return intArrayOf()
}

class SolutionTest {

    @Test
    fun `get two sum`() {
        Assertions.assertThat(twoSum(intArrayOf(2, 7, 11, 15), 9))
            .isEqualTo(intArrayOf(1, 2))

        Assertions.assertThat(twoSum(intArrayOf(2, 3, 4), 6))
            .isEqualTo(intArrayOf(1, 3))

        Assertions.assertThat(twoSum(intArrayOf(-1, 0), -1))
            .isEqualTo(intArrayOf(1, 2))

        Assertions.assertThat(twoSum(intArrayOf(3, 24, 50, 79, 88, 150, 345), 200))
            .isEqualTo(intArrayOf(3, 6))



        Assertions.assertThat(twoSum2(intArrayOf(2, 7, 11, 15), 9))
            .isEqualTo(intArrayOf(1, 2))

        Assertions.assertThat(twoSum2(intArrayOf(2, 3, 4), 6))
            .isEqualTo(intArrayOf(1, 3))

        Assertions.assertThat(twoSum2(intArrayOf(-1, 0), -1))
            .isEqualTo(intArrayOf(1, 2))

        Assertions.assertThat(twoSum2(intArrayOf(3, 24, 50, 79, 88, 150, 345), 200))
            .isEqualTo(intArrayOf(3, 6))



        Assertions.assertThat(twoSum3(intArrayOf(2, 7, 11, 15), 9))
            .isEqualTo(intArrayOf(1, 2))

        Assertions.assertThat(twoSum3(intArrayOf(2, 3, 4), 6))
            .isEqualTo(intArrayOf(1, 3))

        Assertions.assertThat(twoSum3(intArrayOf(-1, 0), -1))
            .isEqualTo(intArrayOf(1, 2))

        Assertions.assertThat(twoSum3(intArrayOf(3, 24, 50, 79, 88, 150, 345), 200))
            .isEqualTo(intArrayOf(3, 6))
    }
}