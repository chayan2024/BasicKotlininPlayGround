fun main() {

    //initialize array
    val num = arrayOf(1, 2, 3, 4)   //implicit type declaration
    println(num)

    val nums = arrayOf<Int>(10, 20, 30,40,50,60) //explicit type declaration
    println(nums)

    //iterate through loop with array

    for(i in 0..num.size-1){
        println("num: ${num[i]}")
    }

    for(i in 0..nums.size-1){
        println("Number of array: ${nums[i]}")
    }

    //using the array constructor

    val arrayName=Array(3,{i->i*1})
    for (i in 0..<arrayName.size-1){
        println(arrayName[i])
    }

    // build in array

    val builtArray= intArrayOf(1,2,3,4,5)
    println("builtArray: ${builtArray[3]}")

    // String array

    val strArray= arrayOf<String>("A","B","C")
    println("strArray: ${strArray[2]}")
    for(i in 0..strArray.size-1){
        println("Number Of Values: ${strArray[i]}")
    }

}