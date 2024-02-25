fun main(){

    // null safety example

    var s1:String?="chayan"
    s1=null
    println("S1 Value:${s1}")

    // variable is declared as nullable

    var s2: String? = "GeeksforGeeks"

    s2 = null    // no compiler error

    println(s2?.length)


    // condition with if else

    var str:String?="ABC"
    str=null
    println(str)

    if (str!=null){
        println("String of the length:${str.length}")
    }else{
        println("null String")
    }

    // let

    var stringList : List<String?> = listOf("cc","aaa",null,"sdsd")

    // new list
    var newList= listOf<String?>()

    for (i in 0..stringList.size-1){

        stringList[i]?.let { newList=newList.plus(it) }
    }
    // pirnt new list
    for (items in newList){
        println("new List:${items}")
    }


    // run

    var intList:List<Int?> = listOf(1,2,4,6,7,9,22,null,78,89,null)

    // new List
    var newListss= listOf<Int?>()

    for (items in intList){

      items?.run { newListss=newListss.plus(this) }

    }

    // pirnt new list
    for (items in newListss){
        println("new List:${items}")
    }

    var strr:String?="ABCWORLD"
    println(strr?.length)
    strr=null
    println(strr?.length?:-1)

}