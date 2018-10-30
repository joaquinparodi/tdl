
import kotlinx.coroutines.*

data class Response(val num: Double)

data class Server(val url: String) {
	var res: Response? = null
    suspend fun call(): Server {
        delay(222)  
        this.res = Response(Math.random())
        return this
    }
}

fun main(args: Array<String>) = runBlocking {
	val startTime = System.currentTimeMillis()
    val list: MutableList<Server> = ArrayList()
    val jobs = List(10) {
       async {
           val server = Server("myUrl")

           print(".")
		      server.call()
       }
   }
    
   jobs.forEach { list.add(it.await()) }
   val endTime = System.currentTimeMillis()
   print("\n${list[0].res?.num.toString()}")
}
