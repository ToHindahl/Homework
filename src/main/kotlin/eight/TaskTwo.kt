package eight

import java.util.LinkedList
import java.util.Stack

data class Graph (val adjacencyMap : MutableMap<Vertex, MutableSet<Vertex>> = mutableMapOf()) {
    fun addVertex(v : Vertex) {
        if(!adjacencyMap.contains(v)) {
            adjacencyMap[v] = mutableSetOf()
        }
    }
    fun removeVertex(v : Vertex) {
        adjacencyMap.minus(v)
    }
    fun addEdge(fromVertex : Vertex, toVertex : Vertex) {
        adjacencyMap[fromVertex]?.add(toVertex)
    }
    fun removeEdge(fromVertex : Vertex, toVertex : Vertex) {
        adjacencyMap[fromVertex]?.remove(toVertex)
    }

    fun dfs(startVertex : Vertex) : Set<Vertex> {
        val visited = mutableSetOf<Vertex>()
        val stack = Stack<Vertex>()
        stack.push(startVertex)
        while (!stack.isEmpty()) {
            val curVertex = stack.pop()
            if (!visited.contains(curVertex)) {
                visited.add(curVertex)
                adjacencyMap[curVertex]?.forEach {
                    if (!visited.contains(it)) {
                        stack.push(it)
                    }
                }
            }
        }
        return visited
    }


    fun bfs(startVertex : Vertex) : Set<Vertex> {
        val visited = mutableSetOf<Vertex>()
        val queue = LinkedList<Vertex>()
        queue.offer(startVertex)
        while (!queue.isEmpty()) {
            val curVertex = queue.poll()
            if (!visited.contains(curVertex)) {
                visited.add(curVertex)
                adjacencyMap[curVertex]?.forEach {
                    if (!visited.contains(it)) {
                        queue.offer(it)
                    }
                }
            }
        }
        return visited
    }

    fun dfs(startVertex: Vertex, goal : String): Vertex? {
        val visited = mutableSetOf<Vertex>()
        val stack = Stack<Vertex>()
        stack.push(startVertex)
        while (!stack.isEmpty()) {
            val curVertex = stack.pop()
            if (curVertex.name == goal) {
                return curVertex
            }
            visited.add(curVertex)
            adjacencyMap[curVertex]?.forEach {
                if (!visited.contains(it)) {
                    stack.push(it)
                }
            }
        }
        return null
    }


}


data class Vertex(val name : String = "")
