private val unpackRules = listOf(
        "IV" to "IIII",
        "IX" to "VIIII",
        "XL" to "XXXX",
        "XC" to "LXXXX",
        "CD" to "CCCC",
        "CM" to "DCCCC"
)

internal fun unpack(roman: String):String =
        unpackRules.fold(roman) { r, (old, new) ->
            r.replace(old, new)
        }

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

private val groupRules = listOf(
        "IIIII" to "V",
        "VV" to "X",
        "XXXXX" to "L",
        "LL" to "C",
        "CCCCC" to "D",
        "DD" to "M")

internal fun group(roman: String):String =
        groupRules
                .fold(roman) { r, (old, new) ->
                    r.replace(old, new)
                }

internal fun simplify(roman: String): String =
        unpackRules
                .reversed()
                .map { (compactForm, expandForm) -> expandForm to compactForm }
                .fold(roman) { r, (expandForm, compactForm) -> r.replace(expandForm, compactForm) }
                .toList()
                .joinToString("")