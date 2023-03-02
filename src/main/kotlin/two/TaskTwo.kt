package two

/**
 * Aufgabe 2, Übungsblatt 2 - Binärzahl als String zu Deziamlzahl
 * @param[x] Binary as String !null & !empty
 * @return is Input a Prime Number
 */
fun isPrime(x : Int) : Boolean {
    if(x <= 1) {
        return false
    }
    for(i in 2 until x) {
        if(x % i == 0) {
            return false
        }
    }
    return true
}