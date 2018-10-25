fun fizzBuzz(range: IntRange): String {
    return range
            .asSequence()
            .map {
                when {
                    it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
                    it % 3 == 0 -> "Fizz"
                    it % 5 == 0 -> "Buzz"
                    else -> it.toString()
                }
            }.joinToString(",")
}

fun main(){
    println(fizzBuzz(1..10))
}