class Olahraga {
    var nama: String = ""
    var jumlahPemain: Int = 0

    fun printDetails(){
        println("nama olahraga: $nama")
        println("jumlah pemain: $jumlahPemain") } }

fun main() {
    val olahraga1 = Olahraga()
    olahraga1.nama = "sepak bola"
    olahraga1.jumlahPemain = 11

    val olahraga2 = Olahraga()
    olahraga2.nama = "tinju"
    olahraga2.jumlahPemain = 2

    olahraga1.printDetails()
    olahraga2.printDetails() }