fun main(){

    val hashMap:HashMap<String,Int> =HashMap<String,Int>()

    println("Empty Hashmap:${hashMap}")
    hashMap.put("chayan",3000)
    hashMap.put("aaa",1000)
    hashMap.put("bbb",2000)
    hashMap.put("ccc",5000)
    println("Hashmap:${hashMap}")

    //hashMap traversal using a for loop

    for (key in hashMap.keys){
        println("Element at key ${key}: ${hashMap[key]}")
    }

    // hashmap is empty or not

    if (hashMap.isEmpty()){
        println("Hashmap is empty")
    }else{
        println("Hashmap is not empty")
    }

}