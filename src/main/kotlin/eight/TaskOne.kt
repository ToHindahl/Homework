package eight

import six.DoubleLinkedList
import six.DoubleNode
import six.LinkedList
import six.Node
import kotlin.NoSuchElementException

class DoubleLinkedListIterator(private val list : DoubleLinkedList) {

    private var nextNode : DoubleNode? = list.head

    fun next() : Int? {
        val curNode = nextNode
        nextNode = nextNode?.next
        return curNode?.value ?: throw NoSuchElementException()
    }

    fun hasNext() : Boolean {
        return nextNode != null
    }

    fun remove() {
        list.remove(0, nextNode?.prev, 0)
    }

}


fun countWords(s: String) : Map<String, Int> {
    val result : MutableMap<String, Int> = mutableMapOf<String, Int>()

    val worker = s.split(Regex("[^\\p{L}]+")).filter { it.isNotEmpty() }

    worker.forEach {
        result.compute(it.toLowerCase()) { _, value -> value?.plus(1) ?: 1 }
    }
    return result
}

