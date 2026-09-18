// Task 5.1.2: main program
import kotlin.system.exitProcess
fun main(args: Array<String>){
    if (args.size !=1){
        println("Error: one number required")
        exitProcess(1)
    }
    val sides =args[0].toInt()
    if (sides <=0){
        println("Error: sides must be positive")
        exitProcess(1)
    }
    val result = rollDie(sides)
    println(result)
}