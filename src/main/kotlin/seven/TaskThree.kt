package seven

import six.LinkedList
import six.Node
import java.util.Stack

/**
 * Last-In First-Out
 */

data class Stack(val list : LinkedList = LinkedList()) {
    fun push(i : Int) : Unit = list.prepend(i)
    fun peek() : Int = list.first()
    fun pop() : Int {
        val value = list.first()
        list.remove(0)
        return value
    }
    fun isEmpty() : Boolean = list.head == null
}

/**
 * First-In First-Out
 */

data class Queue(val list : QueueLinkedList = QueueLinkedList()) {
    fun enqueue(i : Int) : Unit = list.add(i)
    fun front() : Int = list.first()
    fun dequeue() : Int {
        val value = list.first()
        list.remove(0)
        return value
    }
    fun isEmpty() : Boolean = list.head == null
}

/**
 * Damit die Queue in O = 1 läuft habe ich einzelne Funktionen umgebaut sowie ein tail hinzugefügt
 */

data class QueueLinkedList(var tail : Node? = null) : LinkedList() {
    override fun add(x : Int, curNode : Node?) {
        val newNode = Node(x)
        if(head == null && tail == null) {
            head = newNode
            tail = newNode
        } else {
            tail!!.next = newNode
            tail = newNode
        }
    }

    override fun prepend(x : Int) {
        val newNode = Node(x, head)
        head = newNode
        if(tail == null) {
            tail = newNode
        }
    }

    override fun remove(i : Int, curNode : Node?, beforeNode : Node?, accumulator : Int) {
        if(curNode == null || size() <= i) {
            throw IndexOutOfBoundsException("Leere Liste oder Index nicht in der Liste")
        } else {
            if(accumulator == i) {
                if(beforeNode == null) {
                    head = curNode.next
                } else {
                    beforeNode.next = curNode.next

                }
                if(curNode.next == null) {
                    tail = curNode
                }
            } else {
                return remove(i, curNode.next, curNode, accumulator+1)
            }
        }

    }

}

fun calculate(s : String) : Double {
    val list = s.split("\\s".toRegex())
    val stack = Stack<Double>()
    println(list)
    list.forEach {
        if (it.toDoubleOrNull() != null) {
            stack.add(it.toDoubleOrNull())
        } else if(stack.size >= 2) {
            val a = stack.pop()
            val b = stack.pop()
            when(it) {
                "+" -> stack.add(a + b)
                "-" -> stack.add(b - a)
                "/" -> stack.add(b / a)
                "*" -> stack.add(a * b)
                else -> throw Exception("Invalid Postfix Term")
            }
        } else {
            throw Exception("Invalid Postfix Term")
        }
    }

    return if(stack.size == 1) {
        stack.pop()
    } else {
        throw Exception("Invalid Postfix Term")
    }

}