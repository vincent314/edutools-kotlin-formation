internal fun merge(roman1: String, roman2: String): String {
    val weights: Map<Char, Int> = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
    )
    return roman1.plus(roman2).toCharArray()
            .sortedByDescending { weights[it] }
            .joinToString("")
}