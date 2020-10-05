package com.versatile.algorithm.min_stack

class MinStack() {

    /** initialize your data structure here. */
    private val stack = ArrayList<Int>()

    fun push(x: Int) {
        stack.add(x)
    }

    fun pop() {
        stack.removeAt(stack.lastIndex)
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return stack.min()!!
    }

}


class MinStack2() {

    data class Node(val value : Int, val min : Int)

    /** initialize your data structure here. */
    private val stack = ArrayList<Node>()

    fun push(x: Int) {
        if (stack.isEmpty()){
            stack.add(Node(x, x))
        } else {
            if (x < stack.last().min){
                stack.add(Node(x, x))
            } else {
                stack.add(Node(x, stack.last().min))
            }

        }
    }

    fun pop() {
        stack.removeAt(stack.lastIndex)
    }

    fun top(): Int {
        return stack.last().value
    }

    fun getMin(): Int {
        return stack.last().min
    }

}

