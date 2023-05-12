package bot

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val remainder3 = readLine()!!.toInt()
    val remainder5 = readLine()!!.toInt()
    val remainder7 = readLine()!!.toInt()

    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105


    println("Your age is ${age}; that's a good time to start programming!")
}
