fun main(){

    var str1:String?="GreekCode"
    var str2:String?="xss"

    if (str2 is String){
        println("length of string:${str2?.length}")
    }else{
        println("string is null")
    }
}