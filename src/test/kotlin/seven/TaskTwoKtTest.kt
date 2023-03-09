package seven

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TaskTwoKtTest {

    @Test
    fun containsTestTrue() {
        val binarySearchTree = initBinarySearchTree(listOf(10.0,2.0,3.0,4.0,5.0,6.0,12.0,30.0,100.0,2.0,18.0))
        Assertions.assertEquals(true, binarySearchTree.contains(10.0))
    }

    @Test
    fun containsTestFalse() {
        val binarySearchTree = initBinarySearchTree(listOf(10.0,2.0,3.0,4.0,5.0,6.0,12.0,30.0,100.0,2.0,18.0))
        Assertions.assertEquals(false, binarySearchTree.contains(99.0))
    }

    @Test
    fun addTest() {
        val binarySearchTree = initBinarySearchTree(listOf(10.0,2.0,3.0,4.0,5.0,6.0,12.0,30.0,100.0,2.0,18.0))
        binarySearchTree.add(10.0)
        val list = listOf<Double>(2.0, 2.0, 3.0, 4.0, 5.0, 6.0, 10.0, 12.0, 18.0, 30.0, 100.0)
        Assertions.assertEquals(list, binarySearchTree.toList())
    }

    @Test
    fun toListTest() {
        val binarySearchTree = initBinarySearchTree(listOf(10.0,2.0,3.0,4.0,5.0,6.0,12.0,30.0,100.0,2.0,18.0))
        val list = listOf<Double>(2.0, 2.0, 3.0, 4.0, 5.0, 6.0, 10.0, 12.0, 18.0, 30.0, 100.0)
        Assertions.assertEquals(list, binarySearchTree.toList())
    }

    @Test
    fun toListTestEmpty() {
        val binarySearchTree = initBinarySearchTree(listOf())
        Assertions.assertEquals(emptyList<Double>(), binarySearchTree.toList())
    }
}