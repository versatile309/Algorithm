package com.versatile.algorithm.implement_queue_using_stacks

/**
 * Runtime: 152 ms, faster than 83.72% of Kotlin online submissions for Implement Queue using Stacks.
 * Memory Usage: 34.8 MB, less than 25.58% of Kotlin online submissions for Implement Queue using Stacks.
 */
class MyQueue() {

    /** Initialize your data structure here. */
    var stack = ArrayList<Int>()
    val tempStack = ArrayList<Int>()

    /** Push element x to the back of queue. */
    fun push(x: Int) {
        if (stack.isEmpty()){
            stack.add(x)
        }else {
            for (i in 0 until stack.size) {
                tempStack.add(stack.removeAt(stack.size -1))
            }
            stack.add(x)
            while (tempStack.isNotEmpty()){
                stack.add(tempStack.removeAt(tempStack.size - 1))
            }
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        return stack.removeAt(stack.size - 1)
    }

    /** Get the front element. */
    fun peek(): Int {
        return stack.last()
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        return stack.isEmpty()
    }

}


/**
 * Runtime: 172 ms, faster than 25.58% of Kotlin online submissions for Implement Queue using Stacks.
 * Memory Usage: 34.8 MB, less than 20.93% of Kotlin online submissions for Implement Queue using Stacks.
 */
class MyQueue2() {

    /** Initialize your data structure here. */
    val stack1 = ArrayList<Int>()
    val stack2 = ArrayList<Int>()
    var front = 0

    /** Push element x to the back of queue. */
    fun push(x: Int) {
        if (stack1.isEmpty()){
            front = x
        }
        stack1.add(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        if (stack2.isEmpty()){
            while (stack1.isNotEmpty()){
                stack2.add(stack1.removeAt(stack1.size - 1))
            }
        }
        return stack2.removeAt(stack2.size - 1)
    }

    /** Get the front element. */
    fun peek(): Int {
        if (stack2.isNotEmpty()){
            return stack2.last()
        }
        return front
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        return stack1.isEmpty() && stack2.isEmpty()
    }

}