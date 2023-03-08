package nine

import java.util.*
import kotlin.NoSuchElementException

data class WeightedGraph (val adjacencyMap : MutableMap<WeightedVertex, MutableMap<WeightedVertex, Double>> = mutableMapOf()) {
    fun addVertex(v : WeightedVertex) {
        if (!adjacencyMap.containsKey(v)) {
            adjacencyMap[v] = mutableMapOf<WeightedVertex, Double>()
        }
    }

    fun removeVertex(v : WeightedVertex) {
        adjacencyMap.remove(v)
        adjacencyMap.forEach {
            it.value.remove(v)
        }
    }

    fun addEdge(fromVertex : WeightedVertex, toVertex : WeightedVertex, weight : Double) {
        if(adjacencyMap.containsKey(fromVertex) && adjacencyMap.containsKey(toVertex)) {
            println("add")
            adjacencyMap[fromVertex]!![toVertex] = weight
        } else {
            throw NoSuchElementException("Vertex nicht im Graph")
        }

    }

    fun removeEdge(fromVertex : WeightedVertex, toVertex : WeightedVertex) {
        if(adjacencyMap.containsKey(fromVertex) && adjacencyMap.containsKey(toVertex)) {
            if(adjacencyMap[fromVertex]!!.containsKey(toVertex)) {
                adjacencyMap[fromVertex]!!.remove(toVertex)
            } else {
                throw NoSuchElementException("Keine Edge zwischen Vertex")
            }
        } else {
            throw NoSuchElementException("Vertex nicht im Graph")
        }
    }

    fun shortestPath(startVertex : WeightedVertex, toVertex : WeightedVertex): Pair<Double?, MutableList<WeightedVertex>> {
        val distanceMap = mutableMapOf<WeightedVertex, Double>()
        val predecessorMap = mutableMapOf<WeightedVertex, WeightedVertex?>()
        val queue = PriorityQueue<Pair<WeightedVertex, Double>>(compareBy { it.second })
        for (vertex in adjacencyMap.keys) {
            distanceMap[vertex] = Double.POSITIVE_INFINITY
            predecessorMap[vertex] = null
        }
        distanceMap[startVertex] = 0.0

        queue.offer(startVertex to 0.0)

        while (queue.isNotEmpty()) {
            val (v, dist) = queue.poll()
            adjacencyMap[v]!!.forEach {
                val alt = dist + it.value
                if (alt < distanceMap[it.key]!!) {
                    distanceMap[it.key] = alt
                    predecessorMap[it.key] = v
                    queue.offer(it.key to distanceMap[it.key]!!)
                }
            }

        }

        val route = mutableListOf<WeightedVertex>()
        var curV = toVertex
        while (curV != startVertex) {
            route.add(0, curV)
            curV = predecessorMap[curV]?: throw Exception("Gesuchter Vertex nicht erreichbar")
        }

        route.add(0, startVertex)

        return distanceMap[toVertex] to route

    }


}
data class WeightedVertex(val name : String = "")
