import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import java.util.Calendar
import java.util.Date

fun main(args: Array<String>) {
//    var initLiteral = 5
//    var doubleLiteral = .02
//    var stringLiteral = "Hello"
//    var charLiteral = "1"
//    var boolLiteral = true
//
//    var rem = 10
//    var foundGcf = false

    var a = "Hello"
    var b = "Hello"

    if (a == b) {
        println("$a is equal to $b")
    }

    val fruits = listOf("Apple", "Banana", "Orange")
    println(fruits.get(2))
    println(fruits[2])

//    var emptyArray = arrayOfNulls<String>(2)
//    emptyArray[1] = "Hello"
//    emptyArray[2] = "World"

//    for (i in emptyArray.indices) println(emptyArray[i])
//
//    for (i in emptyArray) println(i)

    var arrayOfInts = arrayOf(1,2,3,4,5,6)

    arrayOfInts.forEach { e -> println(e) }

    var arrayWords = "The quick brow fox".split(" ").toTypedArray()
    arrayWords.forEach { item -> println(item) }

//    var name = "John Doe"
//    var email = "john.doe@gmail.com"
//    var phone = "(01)777-1234"
//
//    var concat = String.format("name: %s | email: %s | phone: %s", name, email, phone)
//    println(concat)

//    var name = "John Doe"
//    println("Hello $name")
//    println("The name '$name' is ${name.length} characters long")
//    println("Hello ${foo()}")
//
//    var theQuestion = "Doctor who"
//    var answer = "Theta Signma"
//    var correctAnswer = ""
//
//    if (answer == correctAnswer) {
//        println("You are correct")
//    }
//
//    val d = Date()
//    val c = Calendar.getInstance()
//    val day = c.get(Calendar.DAY_OF_WEEK)
//
//    if (day == 1) {
//        println("Today is Sunday")
//    } else if (day == 2) {
//        println("Today is Monday")
//    } else if (day == 3) {
//        println("Today is Tuesday")
//    }
//
//    val d2 = Date()
//    val c2 = Calendar.getInstance()
//    val day2 = c.get(Calendar.DAY_OF_WEEK)
//
//    when (day) {
//        1 -> println("Sunday")
//        2 -> println("Monday")
//        3 -> println("Tuesday")
//        4 -> println("Wednesday")
//    }
//
//    print("What is the answer to Life?")
//    var response:Int? = readLine()?.toInt()
//
//    val message = when (response) {
//        42 -> "So long, and thanks for the all fish"
//        43, 44, 45 -> "Either 43, 44 or 45"
//        in 46 .. 100 -> "forty six to one hundred"
//        else -> "Not what I'm looking for"
//    }
//
//    println(message)
//
//    var count = 0
//    var finish = 5
//
//    while (count++ < finish) {
//        println("counter = $count")
//    }
//
//    val words = "The quick brown fox".split(" ")
//
//    for (word in words) {
//        println(word)
//    }
//
//    var fileReader: FileReader
//
//    try {
//        fileReader = FileReader("README.txt")
//        var content = fileReader.read()
//        println(content)
//    } catch (ffe: FileNotFoundException) {
//        println(ffe.message)
//    } catch (ioe: IOException) {
//        println(ioe.message)
//    }

    displayMessage("Hello", 3)
    println(getSum(listOf(1,2,3,4,5,6)))
    var (x, y) = bigSmall(5, 3)
    println(x)
    println(y)

    val msg = "My name is Huan Nguyen"
    val util = StringUtil()

    println(util.homerify(msg))
    println(util.chanthofy(msg))
    println(util.terminatorify(msg))

    println(homerify(msg))
    println(chanthofy(msg))
    println(terminatorify(msg))

    val john = Person("Huan Nguyen")
    john.say("Hello World")

    var e1 = Employee("John Doe")
    var e2 = Employee("Jane Doe")
    var e3 = e1 + e2
    println(e3.name)
}

class Employee(var name: String) {
    infix operator fun plus(emp: Employee): Employee {
        this.name = "\n${emp.name}"
        return this
    }
}

class Person(val name: String) {
    fun say(message: String) = println("$name is saying $message")
}

fun homerify(msg: String) = "$msg -- woohoo"
fun chanthofy(msg: String) = "Chan, $msg, tho"
fun terminatorify(msg: String) = "$msg -- I'll be back"

class StringUtil {
    fun homerify(msg: String) = "$msg -- woohoo"
    fun chanthofy(msg: String) = "Chan, $msg, tho"
    fun terminatorify(msg: String) = "$msg -- I'll be back"
}

fun bigSmall(a: Int, b: Int): Pair<Int, Int> {
    if (a > b) return Pair(a, b)
    else {
        return Pair(b, a)
    }
}

fun getSum(values: List<Int>): Int {
    var total = 0

    for (i in values) total += 1
    return total
}

fun foo(): String {
    return "Boo"
}

fun printArr(arr: Array<Int>?) {
    if (arr != null) {
        arr.forEach { i -> println(i) }
    }
}

fun displayMessage(msg: String, count: Int): Unit {
    var counter = 1
    while (counter++ <= count) {
        println(msg)
    }
}