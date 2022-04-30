fun faktor(num: Int){
    var hitung = 0
    var kelipatan: Int
    for (i in 1..100){
        kelipatan = num * i
        if(((kelipatan%2) == 0) or ((kelipatan%3) == 0)){
            print("$kelipatan ")
            hitung += 1 }
        if (hitung == 5){
            break; }
    } }

fun main(args: Array<String>) {
    print("Input Bilangan = ")
    val angka: Int = scn.nextInt()
    println(faktor(angka)) }