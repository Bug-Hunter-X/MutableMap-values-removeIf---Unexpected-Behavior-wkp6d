fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.values.removeIf { it % 2 == 0 }
    println(map) // Output: {a=1, b=2, c=3} // Expected: {a=1, c=3}
}