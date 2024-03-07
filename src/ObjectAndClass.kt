fun main(){
    // creating object for car and addinf properties
    val car=Car(this)
    car.name="Toyota"
    car.model="Tyguuin"
    car.year=2023
    println("Car properties: ${car.getInfo()}")
}

class Car(builder: Builder) {
    var name:String?=null
    var model:String?=null
    var year:Int?=0

    fun getInfo():String{
        return "name: $name,model : $model year : ${year} "
    }
}