package seven

data class TreeNode(val value : Double, var left : TreeNode? = null, var right : TreeNode? = null)

data class BinarySearchTree(var root : TreeNode? = null) {

    tailrec fun contains(value : Double, curNode : TreeNode? = root): Boolean {
        return when {
            (curNode == null) -> false
            (value == curNode.value) -> true
            (value <= curNode.value) -> contains(value, curNode.left)
            (value > curNode.value) -> contains(value, curNode.right)
            else -> false
        }
    }

    tailrec fun add(value : Double, curNode : TreeNode? = root) {
        when {
            (curNode == null) -> root = TreeNode(value)
            (value <= curNode.value && curNode.left == null) -> curNode.left = TreeNode(value)
            (value <= curNode.value) -> add(value, curNode.left)
            (value > curNode.value && curNode.right == null) -> curNode.right = TreeNode(value)
            (value > curNode.value) -> add(value, curNode.right)
        }
    }

    tailrec fun toList(node: TreeNode? = root, accumulator : List<Double> = emptyList()): List<Double> {
        if (node == null) {
            return accumulator
        }
        val left = toList(node.left, accumulator)
        val value = node.value
        val right = toList(node.right, accumulator)
        return left + value + right
    }
}

fun initBinarySearchTree(list : List<Double>) : BinarySearchTree {
    val binarySearchTree = BinarySearchTree()
    list.forEach { binarySearchTree.add(it) }
    return binarySearchTree
}
