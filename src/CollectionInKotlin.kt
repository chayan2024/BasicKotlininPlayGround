fun main(){

    // immutable list in kotlin

    val fruits= listOf("apple","Google","microsoft")
    println("First Fruits:${fruits[0]}")
    println("Second Fruits:${fruits[1]}")

    for (fruitItem in fruits){
        println("value of the Fruits:${fruitItem}")
    }
    
    // immutable list in kotlin

    val immutableList= listOf("kolkata","delhi","mumbai")

    for (immutableItem in immutableList){
        println("values of the immutableList: ${immutableItem}")
    }

    // mutable List in kotlin

    val mutableList= mutableListOf("kolkata","delhi","mumbai")
    mutableList.add("hyderabad")
    for (mutableItem in mutableList){
        println("MutableList Item: ${mutableItem}")
    }

    // set in kotlin
    var immutableSet= setOf(6,9,9,0,0,"mumbai","kolkata")
    for (immutableitem in immutableSet){
        println("immutable set item:${immutableitem}")
    }

    // mutableset in kotlin

    val mutableSet= mutableSetOf<Int>(6,10)
    mutableSet.add(11)
    mutableSet.add(12)
    for (item in mutableSet){
        println("item in mutableset:${item}")
    }
    // map in kotlin

    var immutableMap= mapOf(9 to "chayan",1 to "ram",3 to "abc",4 to "xyz",5 to "yyy")
    for (key in immutableMap.keys){
        println("immutable Map key : ${immutableMap[key]}")
    }


    // mutable map

        var mutableMap = mutableMapOf<Int,String>(1 to "Mahipal",2 to "Nikhil",3 to "Rahul")
        // we can modify the element
        mutableMap.put(1,"Praveen")
        // add one more element in the list
        mutableMap.put(4,"Abhi")
        for(item in mutableMap.values){
            println(item)
        }


}
