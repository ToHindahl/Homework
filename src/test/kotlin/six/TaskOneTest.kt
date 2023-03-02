package six

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IndexOutOfBoundsException

class TaskOneTest {

    val baseArray = intArrayOf(1,2,5,2,6)

    @Test
    fun isEmptyTestTrue() {
        val emptyList = initLinkedList(intArrayOf())
        Assertions.assertEquals(true, emptyList.isEmpty())
    }

    @Test
    fun isEmptyTestFalse() {
        val baseList = initLinkedList(baseArray)
        Assertions.assertEquals(false, baseList.isEmpty())
    }

    @Test
    fun sizeTestEmpty() {
        val emptyList = initLinkedList(intArrayOf())
        Assertions.assertEquals(0, emptyList.size())
    }

    @Test
    fun sizeTest() {
        val baseList = initLinkedList(baseArray)
        Assertions.assertEquals(5, baseList.size())
    }

    @Test
    fun prependTest() {
        val input = initLinkedList(baseArray)
        input.prepend(10)
        println(input)
        Assertions.assertEquals(10, input.get(0))
    }

    @Test
    fun addTest() {
        val input = initLinkedList(baseArray)
        input.add(10)
        Assertions.assertEquals(10, input.get(5))
    }

    @Test
    fun firstTestEmpty() {
        val emptyList = initLinkedList(intArrayOf())
        assertThrows<IndexOutOfBoundsException> {
            emptyList.first()
        }
    }

    @Test
    fun firstTest() {
        val baseList = initLinkedList(baseArray)
        Assertions.assertEquals(1, baseList.first())
    }

    @Test
    fun lastTestEmpty() {
        val emptyList = initLinkedList(intArrayOf())
        assertThrows<IndexOutOfBoundsException> {
            emptyList.last()
        }
    }

    @Test
    fun lastTest() {
        val baseList = initLinkedList(baseArray)
        Assertions.assertEquals(6, baseList.last())
    }

    @Test
    fun lastIndexOfTestTrue() {
        val baseList = initLinkedList(baseArray)
        Assertions.assertEquals(3, baseList.lastIndexOf(2))
    }

    @Test
    fun lastIndexOfTestFalse() {
        val baseList = initLinkedList(baseArray)
        Assertions.assertEquals(-1, baseList.lastIndexOf(10))
    }

    @Test
    fun getTestTrue() {
        val baseList = initLinkedList(baseArray)
        Assertions.assertEquals(2, baseList.get(3))
    }

    @Test
    fun getTestFalse() {
        val baseList = initLinkedList(baseArray)
        assertThrows<IndexOutOfBoundsException> {
            baseList.get(10)
        }
    }

    @Test
    fun getTestEmpty() {
        val emptyList = initLinkedList(intArrayOf())
        assertThrows<IndexOutOfBoundsException> {
            emptyList.get(10)
        }
    }

    @Test
    fun indexOfTestTrue() {
        val baseList = initLinkedList(baseArray)
        Assertions.assertEquals(1, baseList.indexOf(2))
    }

    @Test
    fun indexOfTestFalse() {
        val baseList = initLinkedList(baseArray)
        Assertions.assertEquals(-1, baseList.indexOf(10))
    }

    @Test
    fun removeTestTrue() {
        val input = initLinkedList(baseArray)
        input.remove(3)
        val result = initLinkedList(intArrayOf(1,2,5,6))
        Assertions.assertEquals(true, input.equals(result))
    }

    @Test
    fun removeTestEmpty() {
        val emptyList = initLinkedList(intArrayOf())
        assertThrows<IndexOutOfBoundsException> {
            emptyList.remove(1)
        }
    }

    @Test
    fun removeTestFalse() {
        val baseList = initLinkedList(baseArray)
        assertThrows<IndexOutOfBoundsException> {
            baseList.remove(10)
        }
    }

    @Test
    fun setTestEmpty() {
        val baseList = initLinkedList(baseArray)
        assertThrows<IndexOutOfBoundsException> {
            baseList.set(10, 10)
        }
    }

    @Test
    fun setTestTrue() {
        val input = initLinkedList(baseArray)
        input.set(1,3)
        val result = initLinkedList(intArrayOf(1,3,5,2,6))
        Assertions.assertEquals(true, input.equals(result))
    }

    @Test
    fun setTestFalse() {
        val baseList = initLinkedList(baseArray)
        assertThrows<IndexOutOfBoundsException> {
            baseList.remove(10)
        }
    }

    @Test
    fun removeValueTestEmpty() {
        val emptyList = initLinkedList(intArrayOf())
        Assertions.assertEquals(false, emptyList.removeValue(10))
    }

    @Test
    fun removeValueTestTrue() {
        val input = initLinkedList(baseArray)
        input.removeValue(2)
        val result = initLinkedList(intArrayOf(1,5,2,6))
        Assertions.assertEquals(true, input.equals(result))
    }

    @Test
    fun removeValueTestFalse() {
        val baseList = initLinkedList(baseArray)
        Assertions.assertEquals(false, baseList.removeValue(10))
    }
}