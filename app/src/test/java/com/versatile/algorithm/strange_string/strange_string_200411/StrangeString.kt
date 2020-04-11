package com.versatile.algorithm.strange_string.strange_string_200411
import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(s: String): String {

    var checkEven = true
    var result = ""
    s.forEach {

        checkEven = if (it == ' '){
            result = "$result "
            true
        }else {

            result += if (checkEven){
                it.toUpperCase()
            }else {
                it.toLowerCase()
            }
            checkEven.not()
        }


    }

    return result

}


class SolutionTest {


    @Test
    fun `make strange string`() {
        Assertions.assertThat(
            solution("try hello world")
        ).isEqualTo("TrY HeLlO WoRlD")

    }
}