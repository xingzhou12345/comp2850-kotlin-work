// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.readLines
import kotlin.system.exitProcess
fun main(args:Array<String>){
    if(args.size!=1){
        println("Error:one filename required")
        exitProcess(1)
    }
    val lines=Path(args[0]).readLines()
    var lineNumber=0
    var longestLineNumber=0
    var longestLength=-1
    for(line in lines){
        lineNumber=lineNumber+1
        if (line.length>longestLength){
            longestLength=line.length
            longestLineNumber=lineNumber
        }
        
    }
    if(lineNumber==0){
        println("File is empty")
    }else{
        println("Line $longestLineNumber is the longest(length=$longestLength)")
    }
}