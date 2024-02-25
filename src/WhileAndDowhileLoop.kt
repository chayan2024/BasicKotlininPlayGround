fun main(args:Array<String>){

    var names= arrayOf("aa","bb","cc","dd","ee","ff","gg","hh","ii","kk")
    var index=0
    while (index<names.size){
        println(names[index])
        index++
    }

    var number=6
    var fact=1
    do {
      fact=fact*number
        number--
    }while (number>0)
    println("factorial of 6 is ${fact}")

    var num=2
    var i=1
    do {
     println("$num * $i = "+num*i)
        i++
    }while (i<=10)
}