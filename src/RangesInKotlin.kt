fun main(){

    println("Ranges in kotlin")

    for (i in 1..10){
        println("Numbers: ${i}")
    }

    for (i in 'a'..'f'){
        println("charactrer: ${i}")
    }

    for(num in 100.rangeTo(1200)){
        println(num)
    }

    for (num in 2000.downTo(1900)){
        println(num)
    }

    for (num in 100.downTo(50)){
        println(num)
    }

    var range=5..1

    for (nums in range.reversed()){
        println("${nums}")
    }

}