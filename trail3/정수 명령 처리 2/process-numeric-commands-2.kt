import java.util.LinkedList
import java.util.Queue

fun main() {
    val n = readLine()!!.toInt()
    val commands = mutableListOf<Pair<String, Int?>>()
    repeat(n) {
        val parts = readLine()!!.split(" ")
        val command = parts[0]
        val argument = if (parts.size > 1) parts[1].toInt() else null
        commands.add(Pair(command, argument))
    }

    val queue: Queue<String> = LinkedList<String>()
    commands.forEach { it ->
        val com = it.first
        when(com) {
            "push" -> {
                val data = it.second.toString()
                queue.add(data)
            }
            "front" -> {
                println(queue.peek())
            }
            "size" -> {
                println(queue.size)
            }
            "empty" -> {
                if (queue.isEmpty()) {
                    println("1")
                } else {
                    println("0")
                }
            }
            "pop" -> {
                println(queue.poll())
            }
        }
    }
}