fun main(args:Array<String>){

    println("Type Script and smart script")
    var name="chayan"
    var age=34
    var salary=2200.50
    var emp_id=1234f
    var employeeDetails:List<Any> = listOf(name,age,salary,emp_id)

    for (attribute in employeeDetails){

        when(attribute){

            is String-> println("Name: $attribute")
            is Int-> println("Age: $age")
            is Float-> println("Employee id: $emp_id")
            is Double-> println("salary: $salary")
            else-> println("Not an Attribute")

        }
    }
}