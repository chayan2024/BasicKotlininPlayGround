fun main() {

    // Escape Character

    var str = "Hello\nWorld"
    println("Escape Character:  ${str}")

    // Multiple Line Character

    var strData="""my
        | name
        | is
        |John 
        |Travolta 
        |https://github.com/chayan2024/BasicKotlininPlayGround""".trimMargin()

    println(strData)

    // Structural Equality and Referntial Equality

    var x="USa"
    var y="USa"
    var z="india"
    println(x==y)
    println(x===y)
    println(x==z)
  }