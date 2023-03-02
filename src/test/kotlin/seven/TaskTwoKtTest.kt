package seven

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TaskTwoKtTest {

    @Test
    fun containsTestTrue() {
        val binarySearchTree = initBinarySearchTree(listOf(10,2,3,4,5,6,12,30,100,2,18))
        Assertions.assertEquals(true, binarySearchTree.contains(10))
    }

    @Test
    fun containsTestFalse() {
        val binarySearchTree = initBinarySearchTree(listOf(10,2,3,4,5,6,12,30,100,2,18))
        Assertions.assertEquals(false, binarySearchTree.contains(99))
    }

    @Test
    fun addTest() {
        val binarySearchTree = initBinarySearchTree(listOf(10,2,3,4,5,6,12,30,100,2,18))
        binarySearchTree.add(10)
        val list = listOf<Int>(2, 2, 3, 4, 5, 6, 10, 10, 12, 18, 30, 100)
        Assertions.assertEquals(list, binarySearchTree.toList())
    }

    @Test
    fun toListTest() {
        val binarySearchTree = initBinarySearchTree(listOf(10,2,3,4,5,6,12,30,100,2,18))
        val list = listOf<Int>(2, 2, 3, 4, 5, 6, 10, 12, 18, 30, 100)
        Assertions.assertEquals(list, binarySearchTree.toList())
    }
}