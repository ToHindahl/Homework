package eight

import six.DoubleLinkedList
import six.DoubleNode
import six.LinkedList
import six.Node
import java.util.*
import kotlin.NoSuchElementException

class DoubleLinkedListIterator(private val list : DoubleLinkedList) {

    private var nextNode : DoubleNode? = list.head

    fun next() : Int {
        val curNode = nextNode
        nextNode = nextNode?.next
        return curNode?.value ?: throw NoSuchElementException()
    }

    fun hasNext() : Boolean {
        return nextNode != null
    }

    fun remove() {
        val sameIndex = 0 // Value doesn't matter Value has the same
        list.remove(0, nextNode?.prev, 0)
    }

}


fun countWords(s: String) : Map<String, Int> {
    val result : MutableMap<String, Int> = mutableMapOf<String, Int>()

    // Der String wird aufgesplittet in Wörter ohne Sonderzeichen
    val worker = s.split(Regex("[^\\p{L}]+")).filter { it.isNotEmpty() }
    println(worker)

    worker.forEach {
        result.compute(it.lowercase(Locale.getDefault())) { _, value -> value?.plus(1) ?: 1 }
    }
    return result
}

