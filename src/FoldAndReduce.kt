fun main(){

    // fold higer order functions
    var num= listOf(1,2,3,4)
    val sum=num.fold(0){
        accumulator,element->
        accumulator+element
    }
    println("Fold Value: ${sum}")

    // Reduce higer order order fucntion

    var add= listOf(1,2,3,4,5,6,7,8)
    var addition=add.reduce { accumulator, element -> accumulator+element }
    println("Reduce:${addition}")
}