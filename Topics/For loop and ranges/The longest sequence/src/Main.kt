fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    var count = 1
    var max = 1

    if (n > 1) {
        for (i in 1 until n) {
            if (a[i] >= a[i-1]) {
                count++
                if (count > max) {
                    max = count
                }
            } else {
                count = 1
            }
        }
    }
    println(max)
}
