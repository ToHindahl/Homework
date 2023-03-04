package six

import eight.DoubleLinkedListIterator

data class DoubleNode(var value : Int, var prev : DoubleNode? = null, var next : DoubleNode? = null) {
    tailrec fun size(accumulator : Int = 1) : Int {
        return if(next == null) {
            accumulator
        } else {
            next!!.size(accumulator+1)
        }
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        var curNode : DoubleNode? = this
        while (curNode != null) {
            stringBuilder.append(curNode.value).append(" ")
            curNode = curNode.next
        }
        return stringBuilder.toString()
    }
}

fun initDoubleLinkedList(a : IntArray) : DoubleLinkedList {
    val list = DoubleLinkedList()
    a.forEach { list.add(it) }
    return list
}

data  class DoubleLinkedList(var head : DoubleNode? = null, var tail : DoubleNode? = null) {

    fun size() : Int {
        return head?.size() ?: 0
    }

    tailrec fun add(x : Int, i : Int, curNode : DoubleNode? = head, accumulator : Int = 0) {
        if(curNode == null && i != 0) {
            throw IndexOutOfBoundsException("Index nicht in der Liste!")
        } else {
            if(accumulator == i) {
                val newNode = DoubleNode(x, curNode, curNode!!.next?: null)
                if(curNode!!.next == null) {
                    curNode.next = newNode
                } else {
                    curNode.next!!.prev = newNode
                    curNode.next = newNode
                }
            } else {
                return add(x, i, curNode?.next, accumulator+1)
            }
        }
    }

    fun add(x : Int) {
        val newNode = DoubleNode(x)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            newNode.prev = tail
            tail?.next = newNode
            tail = newNode
        }
    }

    fun iterator() : DoubleLinkedListIterator {
        return DoubleLinkedListIterator(this)
    }

    tailrec fun remove(i : Int, curNode : DoubleNode? = head, accumulator : Int = 0) {
        if(curNode == null || size() <= i) {
            throw IndexOutOfBoundsException("Leere Liste oder Index nicht in der Liste")
        } else {
            if(accumulator == i) {
                if(curNode.prev == null) {
                    head = curNode.next
                } else {
                    curNode.prev!!.next = curNode.next
                }
            } else {
                return remove(i, curNode.next, accumulator+1)
            }
        }

    }

    tailrec fun indexOf(x : Int, curNode: DoubleNode? = head, accumulator : Int = 0) : Int {
        return if(curNode == null) {
            -1
        } else {
            if(curNode.value == x) {
                accumulator
            } else {
                indexOf(x, curNode.next, accumulator+1)
            }
        }
    }

    fun removeValue(x : Int) : Boolean {
        val index = indexOf(x)
        return if(index == -1) {
            false
        } else {
            remove(index)
            true
        }
    }

    tailrec fun get(i : Int, curNode : DoubleNode? = head, accumulator : Int = 0) : Int {
        return if(head == null || size() <= i) {
            throw IndexOutOfBoundsException("Index nicht in der Liste")
        } else {
            if(accumulator == i) {
                curNode!!.value
            } else {
                get(i, curNode?.next, accumulator+1)
            }
        }
    }

    override fun toString(): String {
        return head?.toString() ?: ""
    }

}
