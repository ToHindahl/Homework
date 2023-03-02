package six

data class DoubleNode(var x : Int, var prev : DoubleNode? = null, var next : DoubleNode? = null)

fun initDoubleLinkedList(a : IntArray) : DoubleLinkedList {
    val list = DoubleLinkedList()
    a.forEach { list.add(it) }
    return list
}

data  class DoubleLinkedList(var head : DoubleNode? = null, var tail : DoubleNode? = null) {

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

}
