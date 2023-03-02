package three

/**
 * Aufgabe 9, Übungsblatt 3 - Überprüfen ob Input eine Primzahl ist Rekursiv
 * @param[x] Number to check (Input)
 * @return is Input a Prime Number
 */


fun isPrimeRecursive(x : Int, i : Int = 0) : Boolean {
    if(x <= 1 || x < 0) {
        return false
    } else if(i <= 1) {
        return true
    } else if(x % i == 0) {
        return false
    }
    return isPrimeRecursive(x, i - 1)
}