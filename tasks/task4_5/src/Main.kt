// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if(args.size!=1){
        println("Error:one integer required")
        exitProcess(1)
    }
    val limit=args[0].toInt()
    var total =0L
    for (number in 1..limit step 2){
        total=total+number
    }
    println(total)
}
