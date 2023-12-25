fun main(args: Array<String>) {
    var arr = emptyArray<String>()
    arr += "1"
    arr += "2"
    arr += "3"
    arr += "4"
    arr += "5"

    var arr2 = arrayOfNulls<String>(2)
    arr2.set(0, "1")
    arr2.set(1, "2")

    val fruits = mutableListOf<String>("Apple")
    fruits.add("Orange")
    fruits.add(1, "Banana")
    fruits.add("Guava")

    println(fruits)
    fruits.remove("Guava")
    fruits.removeAt(2)

    println(fruits.first() == "Strawberries")
    println(fruits.last() == "Banana")

    println(fruits)

    // Map
    val dict = hashMapOf("foo" to 1)
    dict["bar"] = 2

    val snapshot: MutableMap<String, Int> = dict
    snapshot["baz"] = 3

    println(snapshot)
    println(dict)
    println(snapshot["bar"])
}