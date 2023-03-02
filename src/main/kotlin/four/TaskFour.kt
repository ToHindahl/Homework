package four

fun averageOfIntArray(a : IntArray) : Double {
    var result = 0.0
    for(i in a.indices) {
        result += a[i]
    }
    return sumArray(a) / a.size as Double
}

fun sumArray(a : IntArray) : Int {
    var result = 0
    for(i in a.indices) {
        result += a[i]
    }
    return result
}