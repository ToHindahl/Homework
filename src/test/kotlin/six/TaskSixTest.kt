package six

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IndexOutOfBoundsException

class TaskSixTest {

    val baseList = initDoubleLinkedList(intArrayOf(1,2,3,4,5))
    val emptyList = initDoubleLinkedList(intArrayOf())

    @Test
    fun addTestTrue() {
        val input = baseList.copy()
        input.add(10)
        val result = initDoubleLinkedList(intArrayOf(1,2,3,4,5,10))
        Assertions.assertEquals(result, input)
    }

    @Test
    fun addTestEmpty() {
        val input = emptyList.copy()
        input.add(1)
        val result = initDoubleLinkedList(intArrayOf(1))
        Assertions.assertEquals(result, input)
    }

    @Test
    fun addTestIndexTrue() {
        val input = baseList.copy()
        input.add(10,1)
        val result = initDoubleLinkedList(intArrayOf(1,10,2,3,4,5))
        Assertions.assertEquals(result, input)
    }

    @Test
    fun addTestIndexFalse() {
        val input = baseList.copy()
        input.add(1)
        val result = initDoubleLinkedList(intArrayOf(1))
        Assertions.assertEquals(result, input)
    }

    @Test
    fun addTestIndexEmptyTrue() {
        val input = emptyList.copy()
        input.add(1,0)
        val result = initDoubleLinkedList(intArrayOf(1))
        Assertions.assertEquals(result, input)
    }

    @Test
    fun addTestIndexEmptyFalse() {
        assertThrows<IndexOutOfBoundsException>{
            emptyList.add(1, 1)
        }
    }
}