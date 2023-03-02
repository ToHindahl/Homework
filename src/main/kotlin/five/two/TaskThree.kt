package five.two

import kotlin.math.sqrt

data class Triangle(val a : Point, val b : Point, val c : Point) {
    fun perimeter() : Double {
        return a.distance(b) + b.distance(c) + c.distance(a)
    }

    fun lengthOfSides() : Triple<Double, Double, Double> {
        return Triple(a.distance(b), b.distance(c), c.distance(a))
    }

    fun area() : Double {
        val s = perimeter() / 2
        return sqrt(s * (s - lengthOfSides().first) * (s - lengthOfSides().second) * (s - lengthOfSides().third))
    }
}
