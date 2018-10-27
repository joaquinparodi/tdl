fun String.bePolite(): String{
	return "$this, por favor."
}

fun main(args: Array<String>) {
	val order = "Dame un chocolate"
	println(order.bePolite())
}
