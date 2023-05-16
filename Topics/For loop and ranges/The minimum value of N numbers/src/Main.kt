fun main() {
    val number = readln().toInt()
    var smallestNumber = Int.MAX_VALUE
    repeat(number) {
        val num = readln().toInt()
        if (num < smallestNumber) {
            smallestNumber = num
        }
    }
    println(smallestNumber)
}
