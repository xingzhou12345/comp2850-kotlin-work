// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    var temperature=0
    while (temperature<=30){
        val fahrenheit=temperature*9.0/5.0+32
        println("$temperature C =$fahrenheit F")
        temperature = temperature +10

     
    }
    // Add your code here
}
