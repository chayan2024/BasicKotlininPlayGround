fun main() {
    var numData = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    numData.set(3, 100)
    numData.set(9, 10)
    for (i in 0..numData.size - 1) {
        println("Number of Data in the List: ${numData[i]}")
    }

    // traversing array

    var numArray = arrayOf<String>("a", "b", "c", "d", "e")
    for (i in numArray.indices) {
        println("NumArray Indices: ${numArray[i]}")
    }

    // For each loop

    var foreachArray= arrayOf(1,2,3,45,5,6,67,7)
    foreachArray.forEach {
        index->println("foreach : ${index}")
    }

}