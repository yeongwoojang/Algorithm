import java.util.ArrayDeque
import java.util.Deque

fun main() {
    val n = readLine()!!.toInt()
    val commands = List(n) { readLine()!!.split(" ") }
    val dequeue: Deque<String> = ArrayDeque<String>()

    commands.forEach {
        val com = it.take(1).joinToString("")
        when (com) {
            "push_front" -> {
                val data = it.takeLast(1).joinToString("")
                dequeue.addFirst(data)
            }
            "push_back" -> {
                val data = it.takeLast(1).joinToString("")
                dequeue.addLast(data)
            }
            "pop_front" -> {
                println(dequeue.pollFirst())
            }
            "pop_back" -> {
                println(dequeue.pollLast())
            }
            "size" -> {
                println(dequeue.size)
            }
            "empty" -> {
                println(if (dequeue.isEmpty()) 1 else 0)
            }
            "front" -> {
                println(dequeue.peekFirst())
            }
            "back" -> {
                println(dequeue.peekLast())
            }
        }
    }
}