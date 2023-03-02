package one

//Aufgabe 5a)
fun moduloPositiv(x : Int, y : Int) : Int {
    return x - ((x / y) * y)  // funktioniert, da wir mit ganzen Zahlen rechnen (Int)
}
//Aufgabe 5b)
fun moduloNegativ(x : Int, y : Int) : Int {

    if(x<0){
        return -1 * moduloPositiv(abs(x), abs(y))
    }else {
        return moduloPositiv(abs(x), abs(y))
    }
}