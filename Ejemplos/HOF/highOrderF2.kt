fun sum(numbers: List<Int>) = fold(numbers, 0) { acc, num -> acc + num }

fun prod(numbers: List<Int>) = fold(numbers, 1) { acc, num -> acc * num }
 
 private fun fold(numbers: List<Int>, start: Int, accumulator: (Int, Int) -> Int):Int {
 	var acc = start
 	for (num in numbers) {
 		acc = accumulator(acc, num)
 	}
 	return acc
 }

fun main(args: Array<String>){
 	val numbers = listOf(1, 2, 3, 4)
 	println(sum(numbers)) // Prints: 10
 	println(prod(numbers)) // Prints: 24
 }