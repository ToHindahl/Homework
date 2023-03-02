package eight

import java.util.LinkedList
import java.util.Stack

data class Graph (val adjacencyMap : Map<Vertex, Set<Vertex>> = mutableMapOf()) {
    fun addVertex(v : Vertex) {
        if(!adjacencyMap.contains(v)) {
            adjacencyMap.plus(Pair(v, mutableSetOf()))
        }
    }
    fun removeVertex(v : Vertex) {
        adjacencyMap.minus(v)
    }
    fun addEdge(fromVertex : Vertex, toVertex : Vertex) {
        adjacencyMap[fromVertex]?.plus(toVertex)
    }
    fun removeEdge(fromVertex : Vertex, toVertex : Vertex) {
        adjacencyMap[fromVertex]?.minus(toVertex)
    }

    fun dfs(startVertex : Vertex) : Set<Vertex> {
        val stack = Stack<Vertex>()
        adjacencyMap[startVertex]?.forEach { stack.add(it) }
        while (stack)
        stack.forEach(stack.add(adjacencyMap[it]))
        return setOf()
    }

    fun bfs(startVertex : Vertex) : Set<Vertex> {
        val queue = LinkedList<Vertex>()

        return setOf()
    }

    fun  dfs(startVertex : Vertex, goal : Int) : Vertex? {

    }

}


data class Vertex(val name : String = "")
