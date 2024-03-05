fun main(args:Array<String>){

    var a=A()
    a.create()
}

interface  B {
    fun insert()
    fun update()
    fun delete()
    fun create()

}

interface C{
    fun insertC()
    fun updateC()
    fun delete()
    fun create()
}
class A:B,C{

    override fun insert() {
        TODO("Not yet implemented")
    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun insertC() {
        TODO("Not yet implemented")
    }

    override fun updateC() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    override fun create() {
      println("Create method being called")
    }
}