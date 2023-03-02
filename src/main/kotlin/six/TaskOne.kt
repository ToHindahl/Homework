package six

fun main() {
    val linkedList = initLinkedList(intArrayOf(7,2,3,7))
    linkedList.prepend(7)
    println(linkedList)
    println(linkedList.first())
    println(linkedList.lastIndexOf(7))
    println(linkedList.indexOf(7))
    println(linkedList.get(2))
    linkedList.remove(2)
    println(linkedList)
}

data class Node(var value : Int, var next : Node? = null) {
    tailrec fun size(accumulator : Int = 1) : Int {
        return if(next == null) {
            accumulator
        } else {
            next!!.size(accumulator+1)
        }
    }
}

open class LinkedList(var head : Node? = null) {
    fun isEmpty() : Boolean {
        return head == null
    }
    fun size() : Int {
        return head?.size() ?: 0
    }

    open fun prepend(x : Int) {
        head = Node(x, head)
    }

    open fun add(x : Int, curNode : Node? = head) {
        if(curNode?.next == null) {
            curNode!!.next = Node(x)
        } else {
            add(x, curNode.next)
        }
    }

    fun first() : Int {
        if(head == null) {
            throw IndexOutOfBoundsException("Liste leer")
        } else {
            return head!!.value
        }
    }


    tailrec fun last(curNode : Node? = head) : Int {
        if(head == null) {
            throw IndexOutOfBoundsException("Liste leer")
        } else {
            return if(curNode?.next == null) {
                curNode!!.value
            } else {
                last(curNode.next)
            }
        }
    }

    tailrec fun lastIndexOf(x : Int, curNode: Node? = head, lastFound : Int = -1, accumulator : Int = 0) : Int {
        return if(curNode == null) {
            lastFound
        } else {
            if(curNode!!.value == x) {
                lastIndexOf(x, curNode.next, accumulator, accumulator+1)
            } else {
                lastIndexOf(x, curNode.next, lastFound, accumulator+1)
            }
        }

    }

    tailrec fun get(i : Int, curNode : Node? = head, accumulator : Int = 0) : Int {
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

    tailrec fun indexOf(x : Int, curNode: Node? = head, accumulator : Int = 0) : Int {

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

    open fun remove(i : Int, curNode : Node? = head, beforeNode : Node? = null, accumulator : Int = 0) {
        if(curNode == null || size() <= i) {
            throw IndexOutOfBoundsException("Leere Liste oder Index nicht in der Liste")
        } else {
            if(accumulator == i) {
                if(beforeNode == null) {
                    head = curNode.next
                } else {
                    beforeNode.next = curNode.next
                }
            } else {
                return remove(i, curNode.next, curNode, accumulator+1)
            }
        }

    }

    tailrec fun set(i : Int, x : Int, curNode: Node? = head, accumulator : Int = 0) {
        if(curNode == null || size() <= i) {
            throw IndexOutOfBoundsException("Leere Liste oder Index nicht in der Liste")
        } else {
            if(accumulator == i) {
                curNode!!.value = x
            } else {
                return set(i, x, curNode.next, accumulator+1)
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

    fun equals(other : LinkedList): Boolean {
        return head == other.head
    }

}

fun initLinkedList(a : IntArray) : LinkedList {
    val list = LinkedList()
    a.reverse()
    a.forEach { list.prepend(it) }
    return list
}