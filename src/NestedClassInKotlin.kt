fun main(){

    var car=CarData()
    car.name="Hyundai"
    car.model="I20"
    car.age=2020

    val engine=car.Engine()
    engine.horsePower=100
    engine.cynlerder=50

    println(engine.getInfo())
}

class CarData{
    var name:String?=null
    var model:String?=null
    var age:Int?=0


    inner class Engine{
        var horsePower:Int=0
        var cynlerder:Int=0


        fun getInfo():String{
            return "Horse Power $horsePower & Cylnerder $$cynlerder"
        }
    }
}