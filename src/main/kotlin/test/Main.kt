package test

fun greatings(name: String): String {
    return "Hello $name!"
}

fun main(args: Array<String>) {
    println(greatings("World"))
}