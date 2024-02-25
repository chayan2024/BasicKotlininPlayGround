fun main(){
    greet()
    greet("Hello World",2024)
    var mulvalue=multiply(2,3)
    println("multiply of 2 and 3 is : ${mulvalue}")
}

fun multiply(num:Int,num1:Int):Int{
    var total=num*num1
    return total
}

fun greet(str:String,year:Int){
    println("Parameterized Function:${str},${year}")
}

fun greet(): Unit {
    println("Normal function")
}
