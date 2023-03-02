package four

fun median(a : IntArray) : Int {
    return if(a.size % 2 == 0) {
        val dataOne = a[a.size/2 - 1]
        val dataTwo = a[a.size/2]
        (dataOne + dataTwo) / 2
    } else {
        a[a.size/2]
    }
}