fun main() {
    val amount = readln().toInt()
    val numList = mutableListOf<Int>()
    repeat(amount) {
        val number = readln().toInt()
        numList.add(number)
    }
    val isSorted = numList.sorted() == numList
    if (isSorted) {
        println("YES")
    } else {
        println("NO")
    }
}
