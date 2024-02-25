fun main() {

    val code1 = Code()
    code1.name = "chayan"
    code1.printIt()

    val code2 = Code()
    code2.name = "Chowdhury"
    code2.printIt()

    val code3 = code1.add(code2)
    code3.printIt()
}

fun Code.add(params: Code): Code {
    val codeObj = Code()
    codeObj.name= this.name +" "+params.name
    return codeObj
}

class Code {
    var name: String? = null
    fun printIt() {
        println(name)
    }
}