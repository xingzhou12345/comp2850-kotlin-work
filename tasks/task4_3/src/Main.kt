// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt
fun main(args: Array<String>){
    if(args.size!=3){
        println("Error:three marks required")
        exitProcess(1)
    }
    val a=args[0].toDouble()
    val b=args[1].toDouble()
    val c=args[2].toDouble()
    val average=((a+b+c)/3.0).roundToInt()

    //println(average)
    val grade=when(average){
        in 70..100 ->"Distinction"
        in 40..69 ->"Pass"
        in 0..39 ->"Fail"
        else ->"Invalid mark"
    }
    println(grade)
}