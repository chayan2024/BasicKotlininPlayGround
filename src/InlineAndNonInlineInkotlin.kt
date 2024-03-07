fun main() {

    var executionTime=measureTimeMills{
        Thread.sleep(100)
    }
    println("execution time: $executionTime milliscond")
}

inline fun measureTimeMills(block:()->Unit):Long{
val startTime=System.currentTimeMillis()
    block()
    return System.currentTimeMillis()-startTime
}