package five.one

/**
 *
 */

tailrec fun indexOfInt(a : IntArray, n : Int,  i : Int = 0) : Int {
    return if(i >= a.size) {
        -1
    } else {
        if (a[i] == n) {
            i
        } else {
            indexOfInt(a, n, i + 1)
        }
    }
}