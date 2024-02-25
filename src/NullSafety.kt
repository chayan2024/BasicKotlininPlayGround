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
    var lastName:String?="Chowdhury"
    lastName=null
    lastName?.let {
        println(lastName.length)
    }

    // run
    var userName:String?="Hii"
    userName=null
    userName.run {
        println(userName?.length)
    }

    // also

    var passWord:String?="hello"
    passWord=null
    passWord.also {
        println(passWord?.length)
    }



}