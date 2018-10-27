fun main(args: Array<String>){
   val doStuff = fun(stopEarly: Boolean) {
   		println("line 1")
   		if (stopEarly) return
   		println("line 2")
	}
	doStuff(true)
	doStuff(false)
}