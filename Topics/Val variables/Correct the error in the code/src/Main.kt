fun main() {
    val listNumber = mutableListOf<Int>()
    val const: Int = 100
    listNumber.add(const * const)
    listNumber.add(const * const * const)
    listNumber.add(const * const * const * const)
    println(listNumber)
}