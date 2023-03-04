package eight

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TaskTwoKtTest {

    @Test
    fun testDfs() {
        val graph = Graph()
        val vertexA = Vertex("A")
        val vertexB = Vertex("B")
        val vertexC = Vertex("C")
        val vertexD = Vertex("D")
        val vertexE = Vertex("E")
        val vertexF = Vertex("F")
        graph.addVertex(vertexA)
        graph.addVertex(vertexB)
        graph.addVertex(vertexC)
        graph.addVertex(vertexD)
        graph.addVertex(vertexE)
        graph.addVertex(vertexF)
        graph.addEdge(vertexA, vertexB)
        graph.addEdge(vertexA, vertexC)
        graph.addEdge(vertexB, vertexD)
        graph.addEdge(vertexB, vertexE)
        graph.addEdge(vertexC, vertexF)

        Assertions.assertEquals(setOf(vertexA, vertexB, vertexD, vertexE, vertexC, vertexF), graph.dfs(vertexA))
        Assertions.assertEquals(setOf(vertexB, vertexD, vertexE), graph.dfs(vertexB))
        Assertions.assertEquals(setOf(vertexC, vertexF), graph.dfs(vertexC))
        Assertions.assertEquals(setOf(vertexD), graph.dfs(vertexD))
        Assertions.assertEquals(setOf(vertexE), graph.dfs(vertexE))
        Assertions.assertEquals(setOf(vertexF), graph.dfs(vertexF))
    }

    @Test
    fun testBfs() {
        val graph = Graph()
        val vertexA = Vertex("A")
        val vertexB = Vertex("B")
        val vertexC = Vertex("C")
        val vertexD = Vertex("D")
        val vertexE = Vertex("E")
        val vertexF = Vertex("F")
        graph.addVertex(vertexA)
        graph.addVertex(vertexB)
        graph.addVertex(vertexC)
        graph.addVertex(vertexD)
        graph.addVertex(vertexE)
        graph.addVertex(vertexF)
        graph.addEdge(vertexA, vertexB)
        graph.addEdge(vertexA, vertexC)
        graph.addEdge(vertexB, vertexD)
        graph.addEdge(vertexB, vertexE)
        graph.addEdge(vertexC, vertexF)

        Assertions.assertEquals(setOf(vertexA, vertexB, vertexC, vertexD, vertexE, vertexF), graph.bfs(vertexA))
        Assertions.assertEquals(setOf(vertexB, vertexD, vertexE), graph.bfs(vertexB))
        Assertions.assertEquals(setOf(vertexC, vertexF), graph.bfs(vertexC))
        Assertions.assertEquals(setOf(vertexD), graph.bfs(vertexD))
        Assertions.assertEquals(setOf(vertexE), graph.bfs(vertexE))
        Assertions.assertEquals(setOf(vertexF), graph.bfs(vertexF))
    }
}