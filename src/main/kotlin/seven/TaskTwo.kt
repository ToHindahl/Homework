package seven

import java.util.concurrent.atomic.DoubleAccumulator

fun main() {
    var binarySearchTree = initBinarySearchTree(listOf(10,2,3,4,5,6,12,30,100,2,18))
    binarySearchTree.add(10)
    println(binarySearchTree)
    println(binarySearchTree.contains(10))
    println(binarySearchTree.contains(2))
    println(binarySearchTree.contains(99))
    println(binarySearchTree.toList())
}

data class TreeNode(val value : Int, var left : TreeNode? = null, var right : TreeNode? = null)

data class BinarySearchTree(var root : TreeNode? = null) {

    tailrec fun contains(value : Int, curNode : TreeNode? = root): Boolean {
        return when {
            (curNode == null) -> false
            (value == curNode.value) -> true
            (value <= curNode.value) -> contains(value, curNode.left)
            (value > curNode.value) -> contains(value, curNode.right)
            else -> false
        }
    }

    tailrec fun add(value : Int, curNode : TreeNode? = root) {
        when {
            (curNode == null) -> root = TreeNode(value)
            (value <= curNode.value && curNode.left == null) -> curNode.left = TreeNode(value)
            (value <= curNode.value) -> add(value, curNode.left)
            (value > curNode.value && curNode.right == null) -> curNode.right = TreeNode(value)
            (value > curNode.value) -> add(value, curNode.right)
        }
    }

    tailrec fun toList(node: TreeNode? = root, accumulator : List<Int> = emptyList()): List<Int> {
        if (node == null) {
            return accumulator
        }
        val left = toList(node.left, accumulator)
        val value = node.value
        val right = toList(node.right, accumulator)
        return left + value + right
    }
}

fun initBinarySearchTree(list : List<Int>) : BinarySearchTree {
    val binarySearchTree = BinarySearchTree()
    list.forEach { binarySearchTree.add(it) }
    return binarySearchTree
}
