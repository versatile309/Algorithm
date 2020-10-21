package com.versatile.algorithm.valid_anagram

import org.assertj.core.api.Assertions
import org.junit.Test

//Runtime: 212 ms, faster than 40.46% of Kotlin online submissions for Valid Anagram.
//Memory Usage: 36.7 MB, less than 5.73% of Kotlin online submissions for Valid Anagram.
fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length)
        return false

    return s.toCharArray().sortedArray().contentEquals(t.toCharArray().sortedArray())

}

class SolutionTest {


    @Test
    fun `is anagram`() {
        Assertions.assertThat(
            isAnagram("anagram", "nagaram")
        ).isEqualTo(true)

        Assertions.assertThat(
            isAnagram("rat", "car")
        ).isEqualTo(false)

    }
}