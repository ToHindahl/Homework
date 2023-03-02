package seven

tailrec fun flatten(list : List<List<Int>>, accumulator : List<Int> = emptyList()) : List<Int> {
    return if (list.isEmpty()) {
        accumulator
    } else {
        flatten(list.drop(1), accumulator + list.first())
    }
}
