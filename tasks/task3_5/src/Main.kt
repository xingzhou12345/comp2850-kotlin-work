// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val file = Path("test.txt")
    file.writeText("Hello Kotlin!")
    file.appendText("Goodbye!")
    val text = file.readText()
    println(text)
}
