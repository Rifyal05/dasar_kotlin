// Nomor 2. Mencari nilai rata-rata
fun main() {
    var nilaiMatdis = 50.0
    var nilaiAljabar = 40.0
    var nilaiIMK = 30.0
    var nilaiRataRata = (nilaiMatdis + nilaiAljabar + nilaiIMK) / 3

    if (nilaiRataRata > 75.0) {
        println("Anda lulus dengan nilai rata-rata: $nilaiRataRata")
    } else {
        println("Anda tidak lulus dengan nilai rata-rata: $nilaiRataRata ")
    }
}