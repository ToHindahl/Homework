package nine

import java.util.*

data class WeightedGraph (val adjacencyMap : MutableMap<WeightedVertex, MutableSet<WeightedVertex>> = mutableMapOf(), val weights : MutableMap<Pair<WeightedVertex, WeightedVertex>, Double> = mutableMapOf()) {
    fun addVertex(v : WeightedVertex) {
        if (adjacencyMap[v] != null) {
            adjacencyMap[v] = mutableSetOf<WeightedVertex>()
        }
    }

    fun removeVertex(v : WeightedVertex) {
        adjacencyMap.remove(v)
    }

    fun addEdge(fromVertex : WeightedVertex, toVertex : WeightedVertex, weight : Double) {
        addVertex(fromVertex)
        addVertex(toVertex)
        adjacencyMap[fromVertex]!!.add(toVertex)
        weights[fromVertex to toVertex] = weight
    }

    fun removeEdge(fromVertex : WeightedVertex, toVertex : WeightedVertex) {
        if (adjacencyMap.containsKey(fromVertex)){
            adjacencyMap[fromVertex]!!.remove(toVertex)
        }
        weights.remove(fromVertex to toVertex)
    }
}
data class WeightedVertex(val name : String = "") {
    fun dijkstraShortestPath(graph: WeightedGraph, source: WeightedVertex) : Pair<Map<WeightedVertex, Double>, Map<WeightedVertex, WeightedVertex?>> {
        val distanceMap = mutableMapOf<WeightedVertex, Double>()
        val predecessorMap = mutableMapOf<WeightedVertex, WeightedVertex?>()
        val queue = PriorityQueue<Pair<WeightedVertex, Double>>(compareBy { it.second })
    // Initialize distanceMap, predecessorMap
        for (vertex in graph.adjacencyMap.keys) {
            distanceMap[vertex] = Double.POSITIVE_INFINITY
            predecessorMap[vertex] = null
        }
        distanceMap[source] = 0.0
    // Add entries to priority queue
        for (vertex in graph.adjacencyMap.keys) {
            queue.offer(vertex to distanceMap[vertex]!!)
        }
    // algorithm
        while (queue.isNotEmpty()) {
            val (u, distU) = queue.poll()
            if (graph.adjacencyMap[u] != null) {
                // Update distanceMap, predecessorMap
                for (v in graph.adjacencyMap[u]!!) {
                    val alt = distU + graph.weights[u to v]!!
                    if (alt < distanceMap[v]!!) {
                        distanceMap[v] = alt
                        predecessorMap[v] = u
                        queue.remove(v to distanceMap[v]!!)
                        queue.offer(v to distanceMap[v]!!)
                    }
                }
            }
        }
        return distanceMap to predecessorMap
    }
}
