package five.one

import four.shuffle

fun isSorted(a : IntArray) : Boolean {
    for (i in 1 until a.size) {
        if (a[i] < a[i - 1]) {
            return false
        }
    }
    return true
}

fun bogoSort(a : IntArray) : IntArray {
    return if(isSorted(a)) {
        a
    } else {
        shuffle(a, 1)
        bogoSort(a)
    }
}