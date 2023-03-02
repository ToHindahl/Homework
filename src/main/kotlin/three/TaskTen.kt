package three

import two.checkParenthesis

/**
 * Aufgabe 7, Übungsblatt 3 - Überprüfen ist Palindrome Rekursiv
 * @param[s] String with Words
 * @return Count of Words in String
 */

tailrec fun checkParenthesisRecursive(s : String, worker : Int = 0) : Boolean {
    var worker = worker
    if(s.isEmpty()) {
        return worker == 0
    }
    val char = s[0]

    if (worker < 0) {
        return false
    } else {
        if (char == '(') {
            worker += 1
        } else if (char == ')')
            worker -= 1
    }

    return checkParenthesisRecursive(s.substring(1), worker)
}