fun main(){
    greet()
    greet("Hello World",2024)
    var mulvalue=multiply(2,3)
    println("multiply of 2 and 3 is : ${mulvalue}")
    val name = "chayan"
    val standard = "VIII"
    val roll = 25
    student(name,standard,roll)
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

fun student( name: String="chayan", standard: String="IX" , roll_no: Int=11 ) {
    println("Name of the student is: $name")
    println("Standard of the student is: $standard")
    println("Roll no of the student is: $roll_no")
}
