import java.util.Scanner
val scn = Scanner(System.`in`)

fun MATH(x: Int) {
    var hasil = 2*(x*x)+5*x-8
    println("$hasil") }

fun main() {
    print("Nilai x = ")
    var x: Int = scn.nextInt()
    MATH(x) }