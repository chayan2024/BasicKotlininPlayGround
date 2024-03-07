
fun main(){

    val numbers= arrayOf(1,2,3,4,5,6,7,8)
   try {

       for (i in numbers.indices){
           try {
               var n=(0..4).random()
               println(numbers[i+1]/n)

           }catch (e:ArithmeticException){
               println(e)
           }
       }

   }catch (e:ArrayIndexOutOfBoundsException){
       println(e)
   }

    // scanner inpiut

}