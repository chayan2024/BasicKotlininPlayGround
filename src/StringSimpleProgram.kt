fun main (){

    println("How to get access all the element from String")

    var str="Hello"
    println(str[0])
    println(str[1])
    println(str[2])
    println(str[3])
    println(str[4])

    // Other way to get all the element

    var str1="Hello Wolrd"

    // apprracoh-1

    for(i in 0..str1.length-1){
        println("Elements:  ${str1[i]}")
    }

    // apprracoh-2

   for(i in str1.indices){
       println("Element Value:${str1[i]}")
   }
}
