fun main(args: Array<String>) {
    val mfc = MultiFunction()
    mfc.print("The quick brown fox")
    mfc.call("12345")
}

interface Printable {
    fun print(doc:String) = println("Printer:Printing $doc")
}

class Person constructor(_name: String) {
    var name: String
    init {
        name = _name
    }
}

class Employee {
    var name: String
    constructor(_name: String) {
        name = _name
    }
}

interface Fax {
    fun call(number: String) = println("Calling $number")
    fun print(doc: String) = println("Fax:Printing $doc")
    fun answer() = println("answering")
}

class MultiFunction : Printable, Fax {
    override fun print(doc:String)  {
        super<Fax>.print(doc)
        super<Printable>.print(doc)
        println("Multifunction: printing")
    } }

interface A {
    fun foo() {
        println("A:foo")
    }
}

interface B {
    fun foo() {
        println("B:foo")
    }
}

class Child : A, B {
    override fun foo() {
        println("Child:foo")
    }
}