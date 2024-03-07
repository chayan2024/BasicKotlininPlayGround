import javax.print.attribute.standard.MediaSize.Other

fun main(){
    val str="Hello World"
    str.printWithprefix("prefix: ")

    // addition of two number using extension fucntion
    var number1=10
    var number2=20
    var sum=number1.addValue(number2)
    println("the sum of ${number1} and ${number2} is ${sum}")

}

fun Int.addValue(other: Int):Int{
    return this+other
}

fun String.printWithprefix(prefix:String){
   println("$prefix $this")
}