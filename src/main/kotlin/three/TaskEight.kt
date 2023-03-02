package three

/**
 * Aufgabe 8, Übungsblatt 3 - Fibonaci Rekursiv
 * @param[x] n-te Fibonaci Number
 * @return Result
 */

tailrec fun fib(x : Int, accumulator : Int = 0, first : Int = 0, second : Int = 1) : Int {
    return if(x == accumulator) {
        accumulator
    } else {
        fib(x, accumulator+1, second, first+second)
    }
}