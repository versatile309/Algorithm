package com.versatile.algorithm.travel_route.travel_route_200318

import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(tickets: Array<Array<String>>): Array<String> {

    val result = mutableListOf<String>()
    val temp = mutableListOf<String>()
    val visitList = MutableList(tickets.size) { false }

    tickets.sortBy { it[1] }

    dfs("ICN", tickets, visitList, temp, result, 0)

    return result.toTypedArray()

}

fun dfs(currentCity : String,
        tickets: Array<Array<String>>,
        visitList: MutableList<Boolean>,
        temp : MutableList<String>,
        result : MutableList<String>,
        count : Int) : Boolean {

    temp.add(currentCity)

    if (count == tickets.size){
        result.clear()
        result.addAll(temp)
        return true
    }

    (tickets.indices).forEachIndexed { index, i ->
        if (tickets[index][0] == currentCity && !visitList[index]){
            visitList[index] = true
            if (dfs(tickets[i][1], tickets, visitList, temp, result, count + 1))
                return true
            visitList[index] = false
        }
    }
    temp.removeAt(temp.size-1)
    return false
}


class SolutionTest {


    @Test
    fun `string to integer`() {
        Assertions.assertThat(
            solution(arrayOf(
                arrayOf("ICN", "JFK"),
                arrayOf("HND", "IAD"),
                arrayOf("JFK", "HND")))
        ).isEqualTo(arrayOf("ICN", "JFK", "HND", "IAD"))

        Assertions.assertThat(
            solution(arrayOf(
                arrayOf("ICN", "SFO"),
                arrayOf("ICN", "ATL"),
                arrayOf("SFO", "ATL"),
                arrayOf("ATL", "ICN"),
                arrayOf("ATL", "SFO")))
        ).isEqualTo(arrayOf("ICN", "ATL", "ICN", "SFO", "ATL", "SFO"))

        Assertions.assertThat(
            solution(arrayOf(
                arrayOf("ICN", "BOO"),
                arrayOf("ICN", "COO"),
                arrayOf("COO", "DOO"),
                arrayOf("DOO", "COO"),
                arrayOf("BOO", "DOO"),
                arrayOf("DOO", "BOO"),
                arrayOf("BOO", "ICN"),
                arrayOf("COO", "BOO")))
        ).isEqualTo(arrayOf("ICN", "BOO", "DOO", "BOO", "ICN", "COO", "DOO", "COO","BOO"))
    }
}