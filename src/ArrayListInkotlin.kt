fun main(){

    var arrayList=ArrayList<String>()
    arrayList.add("a")
    arrayList.add("b")
    arrayList.add("c")
    arrayList.add("d")
    arrayList.add("e")
    arrayList.add("f")
    arrayList.add("g")

    var arrayList1=ArrayList<String>()
    arrayList1.add("h")
    arrayList1.add("k")
    arrayList1.set(1,"x")
    arrayList1.addAll(arrayList)
    arrayList1.remove("k")
    arrayList1.sort()

    for (item in arrayList1){
        println("list of item:${item}")
    }

}