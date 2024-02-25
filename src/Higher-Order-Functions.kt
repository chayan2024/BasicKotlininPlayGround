fun main(args:Array<String>){

    higherOrderFunc(lambda)
    higherOrderAddFunc(::add)
    val multiply=higerMultiply()
    val result=multiply(2,3)
    println("Result of multiplciation:${result}")
}

fun higerMultiply():((Int,Int)->Int){
    return ::mul
}
fun mul(a: Int, b: Int): Int{
    return a * b
}
fun add(a: Int, b: Int): Int{
    return a + b
}

fun higherOrderAddFunc(addFunc:(Int,Int)->Int){
    var result=addFunc(3,3)
    println("Result:: ${result}")
}

var lambda={ println("hello Computer science") }
fun higherOrderFunc(lamda:()->Unit){

    lamda()
}

