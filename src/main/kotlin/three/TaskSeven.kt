package three

/**
 * Aufgabe 7, Übungsblatt 3 - Überprüfen ist Palindrome Rekursiv
 * @param[s] String with Words
 * @return Count of Words in String
 */
fun isPalindrome(s : String) : Boolean {
    return reverseStringEndrecursive(s.lowercase()) == s.lowercase()
}