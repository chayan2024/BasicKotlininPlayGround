fun main(){

    var c1=Father.child1()
    println(c1.toString())
}
sealed class Father{
    class child1:Father()
    class child2:Father()

}

fun family(member:Father){

    when(member){
        is Father.child1-> println("Child1")
        is Father.child2-> println("Child1")
    }
}