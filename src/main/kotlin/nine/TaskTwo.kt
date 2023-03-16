package nine

data class PriorityQueue(val tree : PriorityBinarySearchTree = PriorityBinarySearchTree()) {
    fun offer(element : Pair<WeightedVertex, Double>) {
        tree.add(element)
    }

    fun poll() : Pair<WeightedVertex, Double> {
        val element = tree.findSmallest()?.element ?: throw NoSuchElementException("Leer")
        println(element)
        tree.remove(element)
        return element
    }

    fun isNotEmpty() : Boolean {
        return tree.root == null
    }
}

/**
 * Ich habe die Datenklasse Binary Search Tree aus Übung 7 angepasst, sodass wir Vertex mitspeichern können in einem Pair
 */
data class PriorityTreeNode(var element: Pair<WeightedVertex, Double>, var left: PriorityTreeNode? = null, var right: PriorityTreeNode? = null)

data class PriorityBinarySearchTree(var root : PriorityTreeNode? = null) {
    fun add(element : Pair<WeightedVertex, Double>, curNode: PriorityTreeNode? = root) {
        when {
            (curNode == null) -> root = PriorityTreeNode(element)
            (element.second <= curNode.element.second && curNode.left == null) -> curNode.left = PriorityTreeNode(element)
            (element.second <= curNode.element.second) -> add(element, curNode.left)
            (element.second > curNode.element.second && curNode.right == null) -> curNode.right = PriorityTreeNode(element)
            (element.second > curNode.element.second) -> add(element, curNode.right)
        }
    }

    /**
     * Remove Funktion von CHatGPT
     */
    fun remove(value: Pair<WeightedVertex, Double>) {
        root = removeRecursive(root, value)
    }

    private fun removeRecursive(node: PriorityTreeNode?, value: Pair<WeightedVertex, Double>) : PriorityTreeNode? {
        if (node == null) {
            return null
        }

        when {
            value.second <= node.element.second -> node.left = removeRecursive(node.left, value)
            value.second > node.element.second -> node.right = removeRecursive(node.right, value)
            else -> {
                if (node.left == null && node.right == null) {
                    return null
                }
                if (node.left == null) {
                    return node.right
                }
                if (node.right == null) {
                    return node.left
                }
                val smallestNode = findSmallest(node.right!!)
                node.element = smallestNode!!.element
                node.right = removeRecursive(node.right, smallestNode.element)
            }
        }

        return node
    }

    fun findSmallest(curNode: PriorityTreeNode? = root) : PriorityTreeNode? {
        return when {
            (curNode == null) -> throw NoSuchElementException("Leer")
            (curNode.left != null) -> findSmallest(curNode.left)
            else -> curNode
        }
    }

    fun removeSmallest() {
        val element = findSmallest()?.element ?: throw NoSuchElementException("Leer")
        remove(element)
    }


    private fun containsRecursive(element: Pair<WeightedVertex, Double>, curNode: PriorityTreeNode? = root) : Boolean {
        return when {
            (curNode == null) -> false
            (element.second == curNode.element.second) -> true
            (element.second < curNode.element.second) -> containsRecursive(element, curNode.left)
            else -> containsRecursive(element, curNode.right)
        }
    }
}
