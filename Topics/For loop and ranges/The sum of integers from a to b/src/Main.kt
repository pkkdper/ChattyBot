fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    var sum = 0
    for(number in a..b) {
        sum += number
    }
    println(sum)
}
