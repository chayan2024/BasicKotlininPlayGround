fun main(){

    inLineFucntion { println("calling inline function") }
}

inline fun inLineFucntion(fn:()->Unit){
    fn()
    println("Inside the Inline function")
}