/*
NAMA : YUSUF BAIS SUDRAJAT
NPM : 2410010001
KELAS ; 4B NONREGULER BANJARMASIN
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author USER
 */
public class MainTugas {
    public static void main(String[] args) {
        // 1. Menyimpan daftar nama kategori dalam array String (ukuran tetap) dan menampilkannya
        String[] kategori = {"Elektronik", "Pakaian", "Makanan", "Alat Tulis", "Otomotif"};
        
        System.out.println("=== Kategori Barang Toko ===");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        System.out.println("-----------------------------------------\n");

        // 2. Membuat objek Gudang awal dan menambah minimal 5 objek Barang
        Gudang gudangAwal = new Gudang("barang.txt");
        
        gudangAwal.tambahBarang(new Barang("Laptop ASUS VivoBook", 8500000.0, 4));
        gudangAwal.tambahBarang(new Barang("Mouse Wireless Logi", 150000.0, 15));
        gudangAwal.tambahBarang(new Barang("Keyboard Mechanical", 450000.0, 8));
        gudangAwal.tambahBarang(new Barang("Printer Inkjet HP", 950000.0, 3));
        gudangAwal.tambahBarang(new Barang("SSD NVMe 512GB", 650000.0, 12));

        // Menyimpan data barang awal ke berkas teks
        System.out.println("=== Proses Menyimpan Data ===");
        gudangAwal.simpanKeBerkas();
        System.out.println("-----------------------------------------\n");

        // 3. Membuat objek Gudang BARU untuk membuktikan data tersimpan secara fisik
        System.out.println("=== Proses Memuat Data Menggunakan Objek Baru ===");
        Gudang gudangBaru = new Gudang("barang.txt");
        
        // Memuat kembali data dari berkas teks
        gudangBaru.muatDariBerkas();
        System.out.println();
        
        // Menampilkan seluruh barang yang berhasil dimuat
        gudangBaru.tampilkanSemua();
        System.out.println();
        
        // Menampilkan total nilai persediaan untuk membuktikan data sukses diproses
        System.out.println(">> Total Nilai Persediaan Gudang Baru: Rp" + gudangBaru.totalNilai());
        System.out.println("=========================================");
    }
}
