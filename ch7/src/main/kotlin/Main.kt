fun main(args: Array<String>) {
//    println(fooBar("Joe"))
//    println(fooBar(10))
    val lfruits = listOf("Apples", "Bananas", "Oranges")
    val lnumbers = listOf(1,3,5)
    val lnumlist = (1..100).toList().filter { it % 5 == 0 }

    println(lnumbers.getIt(5))
    println(lfruits.getIt(1))
}

//fun<T> fooBar(arg: T): String {
//    return "Heya $arg"
//}

fun<T> List<T>.getIt(index: Int): T {
    return this[index]
}

fun<T> fooBar(arg: T): T {
    var retval: T = 0 as T
    when (arg) {
        is String -> {
            retval = "Hello World" as T
        }
        is Number -> {
            retval = 100 as T
        }
    }
    return retval
}