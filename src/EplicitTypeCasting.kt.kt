fun main(){

    var str1:Any="kotlin"
    var str2:String?=str1 as String?
    str1=11
    println(str2)
    // type casting not possible so returns null to str3
    val str3: String? = str1 as? String
    val str4: Int? = str1 as? Int          // it works
    println(str3)
    println(str4)
}