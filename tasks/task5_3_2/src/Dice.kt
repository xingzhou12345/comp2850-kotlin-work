// Task 5.3.2: rollDice() function
fun rollDice(numberOfDice: Int = 1,sides: Int = 6){
    var total = 0
    for (n in 1..numberOfDice){
        val result =(1..sides).random()
        total =total +result
    }
    println(total)
}