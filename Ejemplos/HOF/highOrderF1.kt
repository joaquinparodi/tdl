
fun sum(numbers: List<Int>): Int {
 	var sum = 0
 	for (num in numbers) {
 		sum += num
 	}
 	return sum
 }
 fun prod(numbers: List<Int>): Int {
 	var prod = 1
 	for (num in numbers) {
 		prod *= num
 	}
 	return prod
 }

fun main(args: Array<String>) {
 	val numbers = listOf(10,1,2)
 	print(numbers) //[10, 1, 2]
 	println()
 	println(prod(numbers)) // 20
 	println(sum(numbers)) // 13
 }