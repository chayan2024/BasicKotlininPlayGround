fun main(){

    val names= listOf("a","b","c","d","e","f","g","h","i","j","k")
    //method 1
    for (name in names){
        println("name:${name}")
    }

    //method 2

    for (i in names.indices){
        println("name:${i}")
    }

    //method 3

    names.forEachIndexed { i, j -> println("name[$i] = $j") }

    //method 4
    var it:ListIterator<String> =names.listIterator()
    while (it.hasNext()){
        val i=it.next()
        println("I Value ${i}")
    }
}