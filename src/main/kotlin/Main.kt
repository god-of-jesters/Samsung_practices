import kotlin.math.abs
import kotlin.math.max

fun main(args: Array<String>) {
    var k = readln().toInt()
    var x = readln().toInt()
    var y = readln().toInt()
    println(max(max(k - max(x, y), 2 - abs(x - y)), 0))
}