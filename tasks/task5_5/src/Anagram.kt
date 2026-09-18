// Task 5.1.1: anagrams() function
infix fun String.anagramOf(other:String):Boolean{
    val firstLetters = this.toList().sorted()
    val secondLetters = other.toList().sorted()
    return firstLetters == secondLetters
}