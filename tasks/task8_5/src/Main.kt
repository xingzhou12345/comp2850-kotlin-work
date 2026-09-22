// Task 8.5: example of using a higher-order function

fun main() {
    val text = "Hello123"
    println(text.howMany{it=='l'})
    println(text.howMany{it.isDigit()})
    println(text.howMany{it.isUpperCase()})
    // Add your testing code here
}
