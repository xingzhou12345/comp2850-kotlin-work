// Task 5.1.1: anagrams() function
fun anagrams(first:String,second:String):Boolean{
    val firstLetters=first.toList().sorted()
    val secondLetters=second.toList().sorted()
    return firstLetters == secondLetters
}