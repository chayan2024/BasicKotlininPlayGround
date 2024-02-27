fun main(){

    var hashSet= hashSetOf(1,2,3,3,4,4,5,5,5,6)

    for (item in hashSet){
        println("Hashset item: ${item}")
    }

    var captains= setOf(1,2,4,5,"Kohli","Smith","Root","Dhwan","Dhwan")
    for (item in captains){
        println("Captains: ${item}")
    }

}