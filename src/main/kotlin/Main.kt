import kotlin.math.abs
import kotlin.math.max

fun main() {
    val k = readln().toInt()
    val x = readln().toInt()
    val y = readln().toInt()
    println(max(max(k - max(x, y), 2 - abs(x - y)), 0))
}