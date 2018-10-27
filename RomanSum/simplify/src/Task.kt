internal fun simplify(roman: String): String =
        listOf(
                "DCCCC" to "CM",
                "CCCC" to "CD",
                "LXXXX" to "XC",
                "XXXX" to "XL",
                "VIIII" to "IX",
                "IIII" to "IV"
        )
                .fold(roman) { r, (expandForm, compactForm) -> r.replace(expandForm, compactForm) }
                .toList()
                .joinToString("")
