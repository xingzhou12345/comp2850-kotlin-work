// Task 5.3.2: main program
import kotlin.system.exitProcess
fun main(args: Array<String>){
    if (args.size !=1){
        println("Error: one dice specification required")
        exitProcess(1)
    }
    val parts =args[0].lowercase().split('d')
    if (parts.size !=2 || parts[0].isEmpty()|| parts[1].isEmpty()){
        println("Error: use a specification such as 3d6")
        exitProcess(1)
    }
    val numberOfDice = parts[0].toInt()
    val sides =parts[1].toInt()

    if (numberOfDice <=0 || sides<=0){
        println("Error: values must be positive")
        exitProcess(1)
    }
    rollDice(numberOfDice,sides)
}