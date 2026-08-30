import java.util.ArrayDeque

fun main() {
    val n = readLine()!!.toInt()
    val queue = ArrayDeque<Int>()
    for (i in 1..n) {
        queue.add(i)
    }

    for (i in 0 until n - 1) {
        queue.pollFirst()
        val data = queue.pollFirst()
        queue.addLast(data)
    }
    println(queue.joinToString(""))
}