internal fun group(roman: String): String =
        listOf(
                "IIIII" to "V",
                "VV" to "X",
                "XXXXX" to "L",
                "LL" to "C",
                "CCCCC" to "D",
                "DD" to "M"
        )
                .fold(roman) { r, (old, new) ->
                    r.replace(old, new)
                }