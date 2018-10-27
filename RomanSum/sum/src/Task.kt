fun sum(roman1: String, roman2: String): String = merge(unpack(roman1), unpack(roman2))
        .let(::group)
        .let(::simplify)