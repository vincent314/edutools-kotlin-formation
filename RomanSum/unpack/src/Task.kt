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