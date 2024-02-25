fun main(){

    // when condition

    println("Please enter number")
    var monthOfYear= readLine()?.toInt()
    var month = when(monthOfYear){
        1->"Jan"
        2->"Feb"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"Sep"
        10->"Oct"
        11->"Nov"
        12->"Dec"
        else -> {"None of the Month is Entered"}
    }
    println("month is:${month}")

    //

    println("Enter the season ur are")
    var seasonSelected= readLine()?.toInt()
    var season=when(seasonSelected){
        in 1..3-> println("Winter")
        in 3..6-> println("Summer")
        in 6..9-> println("Autmn")
        in 9..12-> println("Rainy")
        else->{"None of the Entered"}
    }
    println("Season selected: ${season}")

    println("Enter name of the planet")
    var planet= readLine()?.toString()
    when(planet){
        "mercury","Earth","Mars","Jupiter","Neptune","pluto","venus","uranus"-> print("These are the planet")
        else-> println("This is not planet")
    }

    fun isOdd(x:Int)=x%2!=0
    fun isEven(x:Int)=x%2==0
    var num=11
    when{

        isOdd(num)-> println("Odd Number")
        isEven(num)-> println("even Number")
        else-> println("Neither Odd and Even")

    }
}