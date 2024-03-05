fun main(){

    var today=DAYS.MONDAY
    println("Is Today a weekend ${DAYS.today(today)}")

    for (day in DAYS.entries){
        println("${day.ordinal}=${day.name} and is weekend ${day.isWeekEnd}")
    }
}
enum class DAYS(val isWeekEnd:Boolean=false){

    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    // Default value overridden
    SATURDAY(true);
    companion object {
        fun today(obj: DAYS): Boolean {
          return obj.name.compareTo("SATURDAY")==0|| obj.name.compareTo("SUNDAY")==0
        }
    }
}