fun main(args: Array<String>){
    print("Waktu sekarang: ")
    val waktu = readLine()
    print("Nama anda: ")
    val nama = readLine()
    print("Umur anda: ")
    val umur = readLine()
    print("Suhu tubuh anda: ")
    val suhu = readLine()

    val text =""" 
        Selamat $waktu, $nama. Umur anda $umur Tahun.
        Suhu Tubuh anda $suhu derajat Celcius
    """.trimIndent()
    println(text) }