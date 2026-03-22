package co.touchlab.repro

class Greeting {
    private val platform = getPlatform()

    fun greet(): String = "Hello, ${platform.name}!"

//    suspend fun suspendGreeter(): String = "Hello, ${platform.name}! I'm suspend fun"
//
//    fun flowTest() =
//        kotlinx.coroutines.flow.flow {
//            emit("Hello, ${platform.name}!")
//        }
}
