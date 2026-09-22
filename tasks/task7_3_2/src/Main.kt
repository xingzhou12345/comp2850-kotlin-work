fun main(){
    val numbers = mutableListOf(9,3,6,2,8,5)
    numbers[0]=100
    println(numbers)
    numbers.add(1)
    println(numbers)
    numbers.addAll(listOf(7,8))
    println(numbers)
    numbers.remove(8)
    println(numbers)
    numbers.removeAt(0)
    println(numbers)
    numbers.removeAll(listOf(3,8))
    println(numbers)
    numbers.clear()
    println(numbers)
}