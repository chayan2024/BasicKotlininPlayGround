fun main(){
    val derived=DerivedClass();
    derived.B()
    derived.A()
}

class DerivedClass:BaseClas(){
    fun B(){
        println("Derived Class")
    }
}

open class BaseClas(){
    val name ="Kolkata"
    fun A(){
        println("Base Class")
    }
}