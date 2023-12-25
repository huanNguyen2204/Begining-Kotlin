fun main(args: Array<String>) {
    var str = "The quick brown fox jumps over the lazy dog"
    var words = str.split(" ")
    var unique = mutableMapOf<String, Int>()

    words.forEach {
        word -> if (unique.containsKey(word)) {
            var temp = unique[word]
            temp =+ 1
            unique[word] = temp
        } else {
            unique.put(word, 1)
        }
    }

    println(unique)
}