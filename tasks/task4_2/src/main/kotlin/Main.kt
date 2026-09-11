// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("a:Cheese pizza")
    println("b:Chicken pizza")
    println("c:Mushroom pizza")
    println("d:Vegetable pizza")
    println("Please choose a,b,c or d:")
    val choice=readln().lowercase()
    //println("You chose: $choice")
    val message = if(choice.length==1 && choice[0] in 'a'..'d'){
        "Order accepted"
    }
    else{
        "Invalid choice!"
    }
    print(message)
}
