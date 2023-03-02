package five.two

import kotlin.math.pow
import kotlin.math.sqrt

data class Point(val x : Double, val y : Double) {
    fun distance(p : Point) : Double {
        return sqrt(((x - p.x).pow(2)) + ((y - p.y).pow(2)))
    }
}

