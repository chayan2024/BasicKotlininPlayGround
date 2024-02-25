fun main(args:Array<String>){

    //Iterate through range to print the values:

    for (i in 1..6){
        println("I value:${i}")
    }

    //Iterate through range to jump using step-3 :
    for (i in 1..10 step 3){
        println("Step I value: ${i}")
    }

    for(i in 5.downTo(1)){
        println("I value: ${i}")
    }

    //Iterate through array using for loop –

    var numbers= arrayOf(1,2,4,9,5,6,7,8)
    for (num in numbers){
        if (num%2==0){
            println("Number is :${num}")
        }
    }

    //Iterate through collection using for loop –

    var collection = listOf(1,2,3,"listOf", "mapOf", "setOf")

    for (elements in collection){
        println(elements)
    }

    //Traverse an array with using index property:
    var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")
    for (i in planets.indices){
        println(planets[i])
    }

    //Traverse an array using withIndex() Library Function:
    var planetss = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")
    for ((index,value) in planetss.withIndex()){
        println("Element at $index th index is $value")

    }

}