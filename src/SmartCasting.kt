fun main(){

    val str1: String? = null
    val str2: String? = str1 as String ?     // throw exception
    println(str2)
}