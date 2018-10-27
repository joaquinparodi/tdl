class C {
    fun foo() { println("member") }
}


fun main(args: Array<String>) {
	var c = C()
	c.foo()
	fun C.foo() { println("extension") }
	c.foo()
}
