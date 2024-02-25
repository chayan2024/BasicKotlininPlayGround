fun main(){
    val modFunction={ a:Int-> a%2==0}
    println(modFunction(4))
    val output=higherOrder(2.0,3.0) {c:Double,d:Double->c+d}
    println("Output:${output}")
}

fun higherOrder(c: Double, d: Double, function: (Double, Double) -> Double):Double {
    println(function(c,d))
    return function(c,d)
}
