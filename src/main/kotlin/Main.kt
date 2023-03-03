fun main(args: Array<String>) {
People()
    Capital()
  Sum()
    println()
       var names = fnames("Mumo","Mugo","Laureen")
    println(names)

}

fun People (){
    var names = arrayOf("Mike", "Clever", "Aniso", "Becky")
    println(names.contentToString())



}

fun Capital(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { cities -> println(cities.capitalize()) }

}

fun Sum(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[2].plus(numbers[5]))
    println(numbers.indexOf(158))
    println(println(numbers.sortedArray().contentToString()))

}
fun fnames(name1:String,name2:String,name3:String):String{
    var names = (arrayOf(name1,name2,name3))
    return names.contentToString()



}





















