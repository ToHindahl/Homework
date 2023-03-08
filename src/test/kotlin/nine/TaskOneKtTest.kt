package nine

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.Random

class TaskOneKtTest {

    @Test
    fun weightedGraphTest() {
        val graph = WeightedGraph()
        val vertexA = WeightedVertex("A")
        val vertexB = WeightedVertex("B")
        val vertexC = WeightedVertex("C")
        val vertexD = WeightedVertex("D")
        val vertexE = WeightedVertex("E")

        graph.addVertex(vertexA)
        graph.addVertex(vertexB)
        graph.addVertex(vertexC)
        graph.addVertex(vertexD)
        graph.addVertex(vertexE)

        graph.addEdge(vertexA, vertexB, 1.0)
        graph.addEdge(vertexB, vertexC, 2.0)
        graph.addEdge(vertexC, vertexD, 3.0)
        graph.addEdge(vertexD, vertexE, 4.0)
        graph.addEdge(vertexE, vertexB, 5.0)
        graph.addEdge(vertexA, vertexC, 6.0)
        graph.addEdge(vertexB, vertexD, 7.0)
        graph.addEdge(vertexA, vertexE, 8.0)


        graph.removeVertex(vertexB)


        println(graph.shortestPath(vertexA, vertexE))

    }
    @Test
    fun weightedGraphTestTwo() {
        val graph = WeightedGraph()
        val vertexA = WeightedVertex("A")
        val vertexB = WeightedVertex("B")
        val vertexC = WeightedVertex("C")
        val vertexD = WeightedVertex("D")
        val vertexE = WeightedVertex("E")

        graph.addVertex(vertexA)
        graph.addVertex(vertexB)
        graph.addVertex(vertexC)
        graph.addVertex(vertexD)
        graph.addVertex(vertexE)

        graph.addEdge(vertexA, vertexB, 1.0)
        graph.addEdge(vertexB, vertexC, 2.0)
        graph.addEdge(vertexC, vertexD, 3.0)
        graph.addEdge(vertexD, vertexE, 4.0)

        graph.removeVertex(vertexB)

        println(graph.shortestPath(vertexA, vertexE))

    }

}