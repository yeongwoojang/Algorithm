import java.util.LinkedList
import java.util.Queue

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    val queue: Queue<Int> = LinkedList<Int>()
    val removeList = mutableListOf<Int>()
    for (i in 1..n) {
        queue.add(i)
    }

    while (queue.size != 0) {
        for (i in 0 until k - 1) {
            val data = queue.peek()
            queue.poll()
            queue.add(data)
        }
        removeList.add(queue.poll())
    }

    println(removeList.joinToString(" "))
}