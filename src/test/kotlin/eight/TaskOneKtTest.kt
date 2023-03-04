package eight

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows
import six.DoubleLinkedList
import six.initDoubleLinkedList
import java.util.NoSuchElementException

class TaskOneKtTest {

    @Test
    fun iteratorTestEmpty() {
        Assertions.assertEquals(false, DoubleLinkedList().iterator().hasNext())
    }

    @Test
    fun iteratorTestNotEmpty() {
        Assertions.assertEquals(true, initDoubleLinkedList(intArrayOf(1,2,3,4,5,6,7,8,9,0)).iterator().hasNext())
    }

    @Test
    fun iteratorTestNextFirstTrue() {
        Assertions.assertEquals(1, initDoubleLinkedList(intArrayOf(1,2,3,4,5,6,7,8,9,0)).iterator().next())
    }

    @Test
    fun iteratorTestNextFirstFalse() {
        assertThrows<NoSuchElementException> {
            DoubleLinkedList().iterator().next()
        }
    }

    @Test
    fun iteratorTest() {
        val list = initDoubleLinkedList(intArrayOf(1,2,3,4,5,6,7,8,9,0))
        val iterator = list.iterator()
        Assertions.assertEquals(1, iterator.next())
        Assertions.assertEquals(2, iterator.next())
        println(list.head)
        iterator.remove()
        println(list.head)
        Assertions.assertEquals(3, list.get(1))
    }

    @Test
    fun countWordsTest() {
        Assertions.assertEquals(mapOf("life" to 2, "is" to 1, "na" to 5), countWords("Life is life, na na na na na"))
    }

    @Test
    fun countWordsTestEmpty() {
        Assertions.assertEquals(emptyMap<String, Int>(), countWords(""))
    }

    @Test
    fun countWordsTestSingleWord() {
        Assertions.assertEquals(mapOf("hello" to 1), countWords("hello"))
    }

    @Test
    fun countWordsTestDistinctWords() {
        Assertions.assertEquals(mapOf("hello" to 1, "world" to 1, "kotlin" to 1), countWords("hello world kotlin"))
    }

    @Test
    fun countWordsTestRepeatedWords() {
        Assertions.assertEquals(mapOf("hello" to 2, "world" to 1, "kotlin" to 3), countWords("hello kotlin world kotlin hello kotlin"))
    }

    @Test
    fun countWordsTestMixedCase() {
        Assertions.assertEquals(mapOf("hello" to 2, "world" to 1, "kotlin" to 3), countWords("Hello kotlin world Kotlin HELLO Kotlin"))
    }

    @Test
    fun countWordsTestSpecialCharactersAndNumbers() {
        Assertions.assertEquals(mapOf("hello" to 1, "world" to 1, "kotlin" to 1), countWords("hello#123 world! kotlin"))
    }

}