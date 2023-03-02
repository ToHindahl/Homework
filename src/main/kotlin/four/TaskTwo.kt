package four

/**
 * Aufgabe 1, Übungsblatt 4 - Int Array mit vorgebener Größe und Random Werten
 * @param[size] Size of Int Array
 * @return IntArray of given size with random Values
 */

fun sumThrowsWithTwoDice(numberOfSides : Int) : IntArray {
    val diceOne = diceSide(numberOfSides/2)
    val diceTwo = diceSide(numberOfSides/2)
    val sum = IntArray((numberOfSides/2) * (numberOfSides/2))
    var i = 0
    for (iOne in diceOne.indices){
        for(iTwo in diceTwo.indices) {
            sum[i] = diceOne[iOne] + diceTwo[iTwo]
            //println("(" + diceOne[iOne] + ", " + diceTwo[iTwo] + ") = " + sum[i])
            i++
        }
    }
    return sum
}

fun diceSide(numberOfSides: Int) : IntArray {
    val sides = IntArray(numberOfSides)
    for (i in 1 .. sides.size){
        sides[i-1] = i
    }
    return sides
}