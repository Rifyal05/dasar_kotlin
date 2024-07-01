import java.time.LocalDate
import java.time.format.DateTimeFormatter

//Nomor 1. Biodata
fun main() {
    var nama: String = "Rifyal Aidil Dziaul Haq"
    var umur: Int = 18
    var tanggallahir = LocalDate.parse("2005-08-08")
    var format = tanggallahir.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"))
    var hobi: String = "Main Game"
    var makanan: String = "Nasi"
    var minuman: String = "Air Putih"
    var alamat: String = "Jl. Kemuning, RT.02/RW.01, Dawuhan, Talang, Tegal, Indonesia, Bumi, Sistem Solar, Bimasakti "

    println("Biodata Saya")
    println("Nama            : $nama")
    println("TanggalLahir    : $format")
    println("Umur            : $umur")
    println("Hobi            : $hobi")
    println("Makanan Favorit : $makanan")
    println("Minuman Favorit : $minuman")
    println("Alamat          : $alamat")
}