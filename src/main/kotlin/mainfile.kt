import java.util.*

fun main() {
    val scn = Scanner(System.`in`)
    val mylist = mutableListOf<String>()
    println("number of iterations:")
    var iteration: Int = scn.nextInt()
    println("enter a string :")
    scn.nextLine()
    while (iteration > 0) {
        val input: String = scn.nextLine()
        mylist.add(input)
        iteration--
    }
    println(mylist)
    println(mylist.filter { it.contains("a") || it.contains("m") })
    for (item in mylist) {
        if (item.contains("a") || item.contains("m")) {
            println(item.uppercase())

        }

    }
}